package com.tpfinal;

import java.util.Scanner;

public class Persona {

    public static final char GENERO_POR_DEFECTO = 'H';

    private String nombre;
    private String apellido;
    private int dni;
    private char genero;
    private int edad;
    private int celular;

    public Persona() {
        crearPersona();
    }

    public void crearPersona(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre");
        this.nombre = scanner.next();

        System.out.println("Ingrese un apellido");
        this.apellido = scanner.next();

        System.out.println("Ingrese su dni");
        this.dni = scanner.nextInt();

        do{
            System.out.println("Ingrese su genero (H = Hombre, M = Mujer)");
            this.genero = scanner.next().charAt(0);
        }while (genero != 'H' && genero != 'M');

        System.out.println("Ingrese su edad");
        this.edad = scanner.nextInt();

        System.out.println("Ingrese un celular");
        this.celular = scanner.nextInt();

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
