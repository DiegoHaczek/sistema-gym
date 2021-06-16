package domain;

import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONException;

public class Turno {

    private Integer horario;
    private ArrayList<Persona> clientes = new ArrayList<>();
    private Profesor profesor;
    private boolean estaLleno;

    /// region constructores

    public Turno() {
    }

    public Turno(Integer horario) {
        this.horario = horario;
    }

    public Turno(Integer horario, Profesor profesor) {
        this.horario = horario;
        this.profesor = profesor;
    }

    public Turno(Integer horario, Profesor profesor, ArrayList<Persona> clientes) {
        this.horario = horario;
        this.clientes = clientes;
        this.profesor = profesor;
        this.estaLleno = getEstaLleno();
    }
    /// endregion

    /// region getters y setters

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    // Porque agregas el cliente de esta forma?
    /*
     * public ArrayList<Persona> AgregarCliente() { return clientes; }
     */

    public void AgregarCliente(Persona persona) {
        for (Persona e : clientes) {
            if (e.equals(persona)) {
                System.out.println("El cliente ya se encuentra en este turno");
            }
        }
        clientes.add(persona);
    }

    public void BorrarCliente(Persona persona) {
        // ver como arreglar esto
        clientes.remove(persona);
    }

    public void setClientes(ArrayList<Persona> clientes) {
        this.clientes = clientes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void CambiarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Persona> getClientes() {
        return clientes;
    }

    public boolean getEstaLleno() { /// retorna que el turno esta completo si
        System.out.println(clientes.size());
        if (clientes.size() > 10) {
            return true;
        }
        else{
            return false;
        }
    }

    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }

    public String mostrarEstaLleno() {

        if (getEstaLleno()) {
            return "Turno lleno";
        } else {
            return "El turno no esta lleno";
        }
    }

    /// endregion

   /* public String VerTurno() {
        return "Turno{" + "horario=" + getHorario() + /// muestra solo la hora
                ", \n clientes=" + clientes + ",\n Vacantes=" + mostrarEstaLleno() + '}';
    }*/

    @Override
    public String toString() {
        return "Turno [Horario=" + horario + ", estaLleno=" + estaLleno + ", Clientes=" + clientes + profesor + "]";
    }

    public JSONObject getFormatoJSON() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Horario", getHorario());
        jsonObject.put("Profesor", getProfesor());
        jsonObject.put("Lista Clientes", getClientes());
        jsonObject.put("Esta lleno?", getEstaLleno());
        return jsonObject;
    }

}
