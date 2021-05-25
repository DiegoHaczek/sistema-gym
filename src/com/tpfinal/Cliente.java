package com.tpfinal;

import java.time.LocalDate;
import java.util.*;

public class Cliente extends Persona{

    private boolean deuda;
    private LocalDate fechaIngreso;
    private boolean certificadoSalud;
    private FrecuenciaPago frecuenciaPago;

    private Map<FrecuenciaPago,Integer> mapaPrecios = new HashMap<>();
    private int saldo;

    public Cliente(){
        super();
        fechaIngreso = LocalDate.now();
        certificadoSalud = false;
        initDatos();
    }

    public Cliente(LocalDate fechaIngreso, boolean certificadoSalud,FrecuenciaPago frecuenciaPago ){
        super();
        this.fechaIngreso = fechaIngreso;
        this.certificadoSalud = certificadoSalud;
        initDatos();
    }

    private void initDatos(){

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

        //SALDO Y PAGO DE CUOTA
        mapaPrecios.put(FrecuenciaPago.DIARIA,300);
        mapaPrecios.put(FrecuenciaPago.SEMANAL,1000);
        mapaPrecios.put(FrecuenciaPago.MENSUAL,2500);

        Random random = new Random();
        this.saldo = random.nextInt(3000);

        int cuota = mapaPrecios.get(frecuenciaPago);
        if(saldo >= cuota){
            deuda = false;
            System.out.println("Se descontaron $" + cuota + " de tu saldo. Quedando restantes $" + saldo);
        }else{
            System.out.println("Tu saldo es insuficiente, podras reservar turno pero tendras deuda");
            this.deuda = true;
        }
    }

    @Override
    public String toString() {
        return "Cliente[ " + super.toString() +
                "deuda=" + deuda +
                ", fechaIngreso=" + fechaIngreso +
                ", certificadoSalud=" + certificadoSalud +
                ", frecuenciaPago=" + frecuenciaPago +
                ", saldo=" + saldo +
                ']';
    }
}
