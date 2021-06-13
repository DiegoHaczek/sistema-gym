package domain;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Cliente extends Persona {

    private LocalDate fechaIngreso;
    private FrecuenciaPago frecuenciaPago;

    private Map<FrecuenciaPago, Integer> mapaPrecios = new HashMap<>();
    //FORMATO DD/MM/AA PARA LA FECHA DE INGRESO
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/u");

    //CONSTRUCTORES
    public Cliente(){
        super();
        fechaIngreso = LocalDate.now();
        iniciarDatos();
    }

    public Cliente(String nombre, String apellido, int dni, char genero, int edad, int celular, LocalDate fechaIngreso) {
        super(nombre,apellido,dni,genero,edad,celular);
        this.fechaIngreso = fechaIngreso;
        iniciarDatos();
    }

    private void iniciarDatos(){

        //PRECIOS DE FRECUENCIAS DE PAGO
        mapaPrecios.put(FrecuenciaPago.DIARIA,300);
        mapaPrecios.put(FrecuenciaPago.SEMANAL,1000);
        mapaPrecios.put(FrecuenciaPago.MENSUAL,2500);

        //ELECCION DE FRECUENCIA DE PAGO
        int eleccionPago = 0;
        Scanner scanner = new Scanner(System.in);

        while(eleccionPago != 1 && eleccionPago != 2 && eleccionPago != 3){

            System.out.println("Elegí una opción de pago");
            System.out.println("1=Pago por día, costo $300");
            System.out.println("2=Pago por semana, costo $1000");
            System.out.println("3=Pago por mes, costo $2500");

            try {
                eleccionPago = scanner.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Debe ingresar unicamente numeros");
            }

            //" limpio el buffer "
            scanner.nextLine();
        }
        switch (eleccionPago){
            case 1:
                frecuenciaPago = FrecuenciaPago.DIARIA;
                break;
            case 2:
                frecuenciaPago = FrecuenciaPago.SEMANAL;
                break;
            case 3:
                frecuenciaPago = FrecuenciaPago.MENSUAL;
                break;
        }

        //Creo la billetera
        super.initBilletera();

        //Pago la cuota, si el saldo es insuficiente aumento deuda.
        if(super.pagar(mapaPrecios.get(frecuenciaPago))){
            super.saldo -= mapaPrecios.get(frecuenciaPago);
        }else{
            System.out.println("Tu saldo es insuficiente para realizar esta operacion, podras reservar un turno pero tendras deuda");
            super.deuda += mapaPrecios.get(frecuenciaPago);
        }

        //Muestro el saldo
        super.verSaldo();

    }

    public JSONObject getFormatoJSON() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", super.getNombre());
        jsonObject.put("apellido", super.getApellido());
        jsonObject.put("dni", super.getDni());
        jsonObject.put("genero", super.getGenero());
        jsonObject.put("edad", super.getEdad());
        jsonObject.put("celular", super.getEdad());
        jsonObject.put("frecuencia de pago",frecuenciaPago);
        jsonObject.put("fecha de ingreso",fechaIngreso.format(formatter));
        return jsonObject;
    }


    @Override
    public String toString() {
        return "Cliente[ " + super.toString() +
                "deuda=" + deuda +
                ", fechaIngreso=" + fechaIngreso.format(formatter) +
                ", frecuenciaPago=" + frecuenciaPago +
                ", saldo=" + saldo +
                ']';
    }
}
