package domain;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Turno {

    private LocalTime horario;
    private ArrayList<Persona> clientes;
    private Profesor profesor;
    private boolean estaLleno;

    /// region constructores

    public Turno() {
    }

    public Turno(LocalTime horario) {
        this.horario = horario;
    }

    public Turno(LocalTime horario, Profesor profesor) {
        this.horario = horario;
        this.profesor = profesor;
    }

    public Turno(LocalTime horario, Profesor profesor, ArrayList<Persona> clientes) {
        this.horario = horario;
        this.clientes = clientes;
        this.profesor = profesor;
        this.estaLleno = getEstaLleno();
    }
    /// endregion

    /// region getters y setters

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    // Porque agregas el cliente de esta forma?
    /*
     * public ArrayList<Persona> AgregarCliente() { return clientes; }
     */

    public boolean AgregarCliente(Persona persona) {
        for (Persona e : clientes) {
            if (e.equals(persona)) {
                System.out.println("El cliente ya se encuentra en este turno");
                return false;
            }
        }
        clientes.add(persona);
        return true;
    }

    public void BorrarCliente(Persona persona) {
        // ver como arreglar esto
        clientes.delete(persona);
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

    public boolean getEstaLleno() { /// retorna que el turno esta completo si
        estaLleno = false; /// ya hay mas de 10 clientes anotados
        if (clientes.size() > 10) {
            estaLleno = true;
        }

        return estaLleno;
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

    public String VerTurno() {
        return "Turno{" + "horario=" + getHorario().getHour() + /// muestra solo la hora
                ", \n clientes=" + clientes + ",\n Vacantes=" + mostrarEstaLleno() + '}';
    }

}
