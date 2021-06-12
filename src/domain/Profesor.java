package domain;

import java.time.LocalDate;
import java.util.Random;

public class Profesor extends Persona{

    private Disciplina disciplina;

    public Profesor(){
        super();
        disciplina = Disciplina.MUSCULACION;
    }

    public Profesor(Disciplina disciplina){
        super();
        this.disciplina = disciplina;
    }
    public Profesor(String nombre, String apellido, int dni, char genero, int edad, int celular, Disciplina disciplina) {
        super(nombre,apellido,dni,genero,edad,celular);
        this.disciplina = disciplina;

    }

    private void iniciarDatos(){

        //Creo la billetera
        super.initBilletera();

        //Muestro el saldo
        super.verSaldo();
    }

    @Override
    public String toString(){
        return "Profesor[ " + super.toString() +
                ", disciplina: " + this.disciplina + "]";
    }

}
