package com.tpfinal;

public class Persona {

    public static final char GENERO_POR_DEFECTO = 'H';

    private String nombre;
    private String apellido;
    private int dni;
    private char genero;
    private int edad;
    private int celular;

    public Persona() {
        nombre = "";
        apellido = "";
        dni = 0;
        genero = GENERO_POR_DEFECTO;
        edad = 0;
        celular = 0;
    }

    public Persona(String nombre, String apellido, int dni, char genero, int edad, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.edad = edad;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona[" +
                " nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", genero=" + genero +
                ", edad=" + edad +
                ", celular=" + celular +
                ']';
    }
}
