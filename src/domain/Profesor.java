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
        iniciarDatos();
    }

    public Profesor(Disciplina disciplina){
        super();
        this.disciplina = disciplina;
        iniciarDatos();
    }
    public Profesor(String nombre, String apellido, int dni, char genero, int edad, int celular, Disciplina disciplina) {
        super(nombre,apellido,dni,genero,edad,celular);
        this.disciplina = disciplina;
        iniciarDatos();
    }


    private void iniciarDatos(){

        //Creo la billetera
        super.initBilletera();

        //Muestro el saldo
        super.verSaldo();
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
        return "Profesor[ " + super.toString() +
                ", disciplina: " + this.disciplina + "]";
    }

}
