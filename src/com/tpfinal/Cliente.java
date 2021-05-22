package com.tpfinal;

import java.time.LocalDate;

public class Cliente extends Persona{

    private boolean deuda;
    private LocalDate fechaIngreso;
    private boolean certificadoSalud;
    private FrecuenciaPago frecuenciaPago;

    public Cliente(){
        super();
        deuda = false;
        fechaIngreso = LocalDate.now();
        certificadoSalud = false;
        frecuenciaPago = FrecuenciaPago.DIARIA;
    }

    public Cliente(String nombre, String apellido, int dni, char genero, int edad, int celular, boolean deuda, LocalDate fechaIngreso, boolean certificadoSalud,FrecuenciaPago frecuenciaPago ){
        super(nombre,apellido,dni,genero,edad,celular);
        this.deuda = deuda;
        this.fechaIngreso = fechaIngreso;
        this.certificadoSalud = certificadoSalud;
        this.frecuenciaPago = frecuenciaPago;
    }

    @Override
    public String toString() {
        return "Cliente[" + super.toString() +
                "deuda=" + deuda +
                ", fechaIngreso=" + fechaIngreso +
                ", certificadoSalud=" + certificadoSalud +
                ", frecuenciaPago=" + frecuenciaPago +
                ']';
    }
}
