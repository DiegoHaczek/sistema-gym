package domain;

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
