package domain;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

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
		if (persona instanceof Profesor) {
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

	public void BorrarPersona()
	{
		Scanner scanner = new Scanner(System.in);

		int rta = 0;
		int dni = 0;
		do{
			scanner.nextLine();
			try{
				System.out.println("Desea borrar un profesor o un cliente? 1: Profesor 2: Cliente ");
				rta= scanner.nextInt();}
			catch (InputMismatchException e){ System.out.println("Debe ingresar 1 o 2");}
			catch (Exception e){ e.getMessage();}
			if (rta==1){
				ListarProfesor();
				scanner.nextLine();
				try{System.out.println("Ingrese Dni del profesor a borrar ");
					dni = scanner.nextInt();}
				catch (InputMismatchException e){ System.out.println("Debe ingresar un DNI");
				}catch (Exception e){e.getMessage();}
				if (listaProfesor.lista!=null){

					for (Persona profesor: listaProfesor.lista) {
						if (profesor.getDni()==dni){
							listaProfesor.lista.remove(profesor);
							System.out.println("Profesor Borrado");
							break;                                                     ///Corto el ciclo una vez encontrado
						}else { System.out.println("No existe un profesor con ese DNI"); }}}
			}if(rta==2){
				ListarCliente();
				scanner.nextLine();
				try{System.out.println("Ingrese Dni del Cliente a borrar ");
					dni = scanner.nextInt();}
				catch (InputMismatchException e){ System.out.println("Debe ingresar un DNI");
				}catch (Exception e){e.getMessage();}
				if (listaCliente.lista!=null){
					for (Persona cliente: listaCliente.lista) {
						if (cliente.getDni()==dni){
							listaCliente.lista.remove(cliente);
							System.out.println("Cliente Borrado");
							break;
						}else { System.out.println("No existe un cliente con ese DNI"); }}}


			}}while(rta!=1&&rta!=2);}

	public void BuscarProfesorPorDNI()
	{
		int dni=0;
		Scanner scanner = new Scanner(System.in);
		while (dni==0){
			scanner.nextLine();
			try{
				System.out.println("Ingrese el DNI del profesor a buscar");
				dni=scanner.nextInt();}
			catch (InputMismatchException e){ System.out.println("Debe ingresar un DNI");}
			catch (Exception e){e.getMessage();}

			for (Persona profesor: listaProfesor.lista) {
				if (profesor.getDni() == dni) {
					System.out.println(profesor);
					break;
				} else {
					System.out.println("No existe un profesor con ese DNI");
				}
			}
		}
	}

	public void BuscarClientePorDNI()
	{
		int dni=0;
		Scanner scanner = new Scanner(System.in);
		while (dni==0){
			scanner.nextLine();
			try{
				System.out.println("Ingrese el DNI del cliente a buscar");
				dni=scanner.nextInt();}
			catch (InputMismatchException e){ System.out.println("Debe ingresar un DNI");}
			catch (Exception e){e.getMessage();}

			for (Persona cliente: listaCliente.lista) {
				if (cliente.getDni() == dni) {
					System.out.println(cliente);
					break;
				} else {
					System.out.println("No existe un cliente con ese DNI");
				}
			}
		}
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

	public JSONArray levantarJson() throws JSONException {
		JSONArray listArray = new JSONArray();
		JsonUtil utiles = new JsonUtil();
		JSONObject jsonObject = new JSONObject();

		for (T e : lista) {
			listArray.put(e.getFormatoJSON());
		}
		String respuesta = listArray.toString();
		JSONArray arregloJson = new JSONArray(respuesta);
		utiles.grabarJson(arregloJson);
		return arregloJson;
	}

}
