package domain;

import org.json.JSONException;
import org.json.JSONObject;

public class Profesor extends Persona{

    private Disciplina disciplina;

    //CONSTRUCTORES
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

    @Override
    public String toString(){
        return "\nProfesor[ " + super.toString() +
                ", disciplina: " + this.disciplina + "]";
    }

}
