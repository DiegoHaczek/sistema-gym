package domain;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.Random;

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

    public JSONObject getFormatoJSON() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", super.getNombre());
        jsonObject.put("apellido", super.getApellido());
        jsonObject.put("dni", super.getDni());
        jsonObject.put("genero", super.getGenero());
        jsonObject.put("edad", super.getEdad());
        jsonObject.put("celular", super.getEdad());
        jsonObject.put("disciplina", disciplina);
        return jsonObject;
    }

    @Override
    public String toString(){
        return "\nProfesor[ " + super.toString() +
                ", disciplina: " + this.disciplina + "]";
    }

}
