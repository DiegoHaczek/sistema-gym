package domain;
import jdk.internal.util.xml.impl.Input;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private char genero;
    private int edad;
    private int celular;
    private int deuda;


    //GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDni() { return dni; }
    public char getGenero() { return genero; }
    public int getEdad() { return edad; }
    public int getCelular() { return celular; }
    public int getDeuda() { return deuda; }

    //CONSTRUCTORES
    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, char genero, int edad, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.edad = edad;
        this.celular = celular;
    }


    public void crearPersona(){
        Scanner scanner = new Scanner(System.in);

        //Uso el replaceAll en caso de que el usuario ingrese numeros.
        System.out.println("Ingrese un nombre");
        this.nombre = scanner.next();
        this.nombre = this.nombre.replaceAll("[^a-zA-Z]", "");

        System.out.println("Ingrese un apellido");
        this.apellido = scanner.next();
        this.apellido = this.apellido.replaceAll("[^a-zA-Z]", "");

        while(this.dni == 0) {

            //" limpio el buffer "
            scanner.nextLine();

            try {
                System.out.println("Ingrese su dni");
                this.dni = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar unicamente numeros");
            }
        }

        do{
            System.out.println("Ingrese su genero (H = Hombre, M = Mujer)");
            this.genero = scanner.next().charAt(0);
        }while (genero != 'H' && genero != 'M');

        while (this.edad == 0) {

            //" limpio el buffer "
            scanner.nextLine();

            try {
                System.out.println("Ingrese su edad");
                this.edad = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar unicamente numeros");
            }
        }

        while (this.celular == 0) {

            //" limpio el buffer "
            scanner.nextLine();

            try {
                System.out.println("Ingrese un celular");
                this.celular = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar unicamente numeros");
            }
        }


    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", genero=" + genero +
                ", edad=" + edad +
                ", celular=" + celular +
                ']';
    }



}
