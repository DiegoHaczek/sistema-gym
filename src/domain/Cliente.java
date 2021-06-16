package domain;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente extends Persona {

    private LocalDate fechaIngreso;
    private FrecuenciaPago frecuenciaPago;
    private boolean pagoCuota;
    //FORMATO DD/MM/AA PARA LA FECHA DE INGRESO
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/u");

    public FrecuenciaPago getFrecuenciaPago() {
        return frecuenciaPago;
    }

    public void setPagoCuota(boolean pagoCuota) {
        this.pagoCuota = pagoCuota;
    }

    public boolean getPagoCuota() {
        return pagoCuota;
    }


    public Cliente(){
        super();
        fechaIngreso = LocalDate.now();
        frecuenciaPago = FrecuenciaPago.MENSUAL;
    }

    public Cliente(String nombre, String apellido, int dni, char genero, int edad, int celular, LocalDate fechaIngreso,FrecuenciaPago frecuenciaPago) {
        super(nombre,apellido,dni,genero,edad,celular);
        this.fechaIngreso = fechaIngreso;
        this.frecuenciaPago = frecuenciaPago;
    }




    @Override
    public String toString() {
        return "\nCliente[ " + super.toString() +
                ", fechaIngreso=" + fechaIngreso.format(formatter) +
                ", frecuenciaPago=" + frecuenciaPago +
                ']';
    }
}
