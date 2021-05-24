package com.tpfinal;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
        frecuenciaPago = FrecuenciaPago.DIARIA;
        initDatos();
    }

    public Cliente(LocalDate fechaIngreso, boolean certificadoSalud,FrecuenciaPago frecuenciaPago ){
        super();
        this.fechaIngreso = fechaIngreso;
        this.certificadoSalud = certificadoSalud;
        this.frecuenciaPago = frecuenciaPago;
        initDatos();
    }

    private void initDatos(){

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
