package domain;

import java.time.LocalTime;

import excepciones.LimiteExcepcion;

public class GYM {

	// Persona persona;
	Cliente cliente;
	// Persona persona;
	Profesor profesor;
	// ListaGenerica<Persona> listaPersona;
	ListaGenerica<Persona> listaCliente;
	ListaGenerica<Persona> listaProfesor;
	ListaGenerica<Turno> listaTurnos;
	ListaGenerica<Persona> listaClienteConDeudas;

	// CONTRUCTOR

	public GYM() {
		listaCliente = new ListaGenerica<>();
		listaProfesor = new ListaGenerica<>();
		listaTurnos = new ListaGenerica<>();
		listaClienteConDeudas = new ListaGenerica<>();
	}

	// Agregar

	public void AgregarPersona(Persona persona) // Usamos un solo agregar
	{
		if (persona instanceof Cliente) {
			listaProfesor.Agregar_A_lista(persona);
		} else {
			listaCliente.Agregar_A_lista(persona);
		}
	}

	public void AgregarTurno(Turno turno) // Usamos un solo agregar
	{
		listaTurnos.Agregar_A_lista(turno);
	}

	// LISTAR

	public void ListarCliente() {
		listaCliente.Listar();
	}

	public void ListarProfesor() {
		listaProfesor.Listar();
	}

	public void Ver_Turnos() {
		listaTurnos.Listar();
	}

	// BORRAR

	public void Borrar() {

	}

	// BUSCAR

	public void Buscar() {

	}

	/*
	 * public void LevantarJson() { listaCliente.json(); listaProfesor.json();
	 * listaClienteConDeudas.json(); } public void ArchivarJson() {
	 * listaCliente.json(); listaProfesor.json(); listaClienteConDeudas.json(); }
	 */
	public void Chequear_deuda()// Lista la deuda actual tiene el cliente
	{

	}

	public void Dar_De_baja()// de la lista Cliente que pasan a la lista deudores
	{
		for (Persona cliente : listaCliente.lista) {
			if (cliente.getDeuda() > 0) {
				listaClienteConDeudas.lista.add(cliente);
			}
		}
	}

	public void Dar_De_alta()// de la lista deudores que pasan a lista Cliente
	{
		for (Persona cliente : listaClienteConDeudas.lista) {
			if (cliente.getDeuda() < 0) {
				listaCliente.lista.add(cliente);
			}
		}
	}

	// FUNCIONES TURNOS

	public boolean Incribirse_A_Turnos(LocalTime horario, Cliente cliente)// turnos
	{
		// ver si al retorno un puntero donde lo modifica de una
		if (listaTurnos.Buscar_en_Lista(horario) != null) {
			if (listaTurnos.Buscar_en_Lista(horario).getEstaLleno()) {
				listaTurnos.Buscar_en_Lista(horario).AgregarCliente(cliente);
				return true;
			}
			System.out.println("Esta lleno Sorry");
			return false;
		}
		return false;
	}

	public void Cambiar_De_Turnos(Cliente cliente, LocalTime horarioActual, LocalTime horarioNuevo)// Turnos
	{
		Cancelar_Turno(horarioActual, cliente);
		Incribirse_A_Turnos(horarioNuevo, cliente);
	}

	public void Cancelar_Turno(LocalTime horario, Persona persona)// Turnos
	{
		// ver si al retorno un puntero donde lo modifica de una
		listaTurnos.Buscar_en_Lista(horario).BorrarCliente(persona);
	}

	public void Vender_Productos() // Tienda
	{

	}

	public void Reponer_Stock()// Tienda
	{

	}

	public void Cetificado_De_Salud()// Cliente
	{

	}

}
