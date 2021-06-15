package domain;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//import javax.rmi.CORBA.Tie;

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
	Tienda tienda;

	// CONSTRUCTOR

	public GYM() {

		listaCliente = new ListaGenerica<>();
		listaProfesor = new ListaGenerica<>();
		listaTurnos = new ListaGenerica<>();
		listaClienteConDeudas = new ListaGenerica<>();
		tienda = new Tienda(new ArrayList<Producto>());
	}

	//region AGREGAR

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

	//endregion

	//region LISTAR

	public void ListarCliente() {
		listaCliente.Listar();
	}

	public void ListarProfesor() {
		listaProfesor.Listar();
	}

	public void Ver_Turnos() {
		listaTurnos.Listar();
	}

	//endregion

	//region BORRAR

	public void BorrarPersona() {
		Scanner scanner = new Scanner(System.in);

		int rta = 0;
		int dni = 0;
		do {
			scanner.nextLine();
			try {
				System.out.println("Desea borrar un profesor o un cliente? 1: Profesor 2: Cliente ");
				rta = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar 1 o 2");
			} catch (Exception e) {
				e.getMessage();
			}
			if (rta == 1) {
				ListarProfesor();
				scanner.nextLine();
				try {
					System.out.println("Ingrese Dni del profesor a borrar ");
					dni = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un DNI");
				} catch (Exception e) {
					e.getMessage();
				}
				if (listaProfesor.lista != null) {
					boolean existe = false;
					for (Persona profesor : listaProfesor.lista) {
						if (profesor.getDni() == dni) {
							listaProfesor.lista.remove(profesor);
							System.out.println("Profesor Borrado");
							existe=true;
							break; /// Corto el ciclo una vez encontrado
						}
					}if (!existe) {System.out.println("No existe un profesor con ese DNI");}

				}
			}
			if (rta == 2) {
				ListarCliente();
				scanner.nextLine();
				try {
					System.out.println("Ingrese Dni del Cliente a borrar ");
					dni = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un DNI");
				} catch (Exception e) {
					e.getMessage();
				}
				if (listaCliente.lista != null) {
					boolean existe = false;
					for (Persona cliente : listaCliente.lista) {
						if (cliente.getDni() == dni) {
							listaCliente.lista.remove(cliente);
							System.out.println("Cliente Borrado");
							existe=true;
							break;
						}

					}if (!existe){ System.out.println("No existe un cliente con ese DNI"); }
				}

			}
		} while (rta != 1 && rta != 2);
	}

	public void BuscarProfesorPorDNI() {
		int dni = 0;
		Scanner scanner = new Scanner(System.in);
		while (dni == 0) {
			scanner.nextLine();
			try {
				System.out.println("Ingrese el DNI del profesor a buscar");
				dni = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un DNI");
			} catch (Exception e) {
				e.getMessage();
			}

			// creo que no va a retornar la lista
			for (Persona profesor : listaProfesor.lista) {
				if (profesor.getDni() == dni) {
					System.out.println(profesor);
					break;
				} else {
					System.out.println("No existe un profesor con ese DNI");
				}
			}
		}
	}

	public Persona BuscarClientePorDNI() {
		int dni = 0;
		Scanner scanner = new Scanner(System.in);
		while (dni == 0) {
			try {
				System.out.println("Ingrese el DNI del cliente a buscar");
				dni = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un DNI");
			} catch (Exception e) {
				e.getMessage();
			}

			scanner.nextLine();

			// creo que no va a retornar la lista
			for (Persona cliente : listaCliente.lista) {
				if (cliente.getDni() == dni) {
					System.out.println(cliente);
					return cliente;
				}
			}
		}
		System.out.println("No existe un cliente con ese DNI");
		return null;
	}


	//endregion

	/*
	 * public void LevantarJson() { listaCliente.json(); listaProfesor.json();
	 * listaClienteConDeudas.json(); } public void ArchivarJson() {
	 * listaCliente.json(); listaProfesor.json(); listaClienteConDeudas.json(); }
	 */

	//regionFUNCIONES CLIENTES

	public void Chequear_deuda(Cliente cliente)// Lista la deuda actual tiene el cliente
	{
		System.out.println("La deuda de " + cliente.getNombre() + "es $" + cliente.getDeuda());
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

	//endregion

	//region FUNCIONES TURNOS

	public boolean Inscribirse_A_Turnos(Integer horario, Persona persona)// turnos
	{
		for (Turno e : listaTurnos.lista) {
			if (e.getHorario() == horario) {
				if (e.getEstaLleno()){
					System.out.println("Esta lleno Sorry");
					return false;
				} else {
					e.AgregarCliente(persona);
					return true;
				}
			}
		}
		System.out.println("No se encontro Turno");
		return false;
	}

	public void Cambiar_De_Turnos(Persona persona, Integer horarioActual, Integer horarioNuevo)// Turnos
	{
		Cancelar_Turno(horarioActual, persona);
		Inscribirse_A_Turnos(horarioNuevo, persona);
	}

	public void Cancelar_Turno(Integer horarioActual, Persona persona)// Turnos
	{
		for (Turno e : listaTurnos.lista) {

			if (e.getEstaLleno()) {
				if (e.getHorario() == horarioActual) {
					e.BorrarCliente(persona);
				}
			}
		}
	}

	//endregion

	//region FUNCIONES TIENDA

	public void Ver_Tienda (){ System.out.println(tienda);
	}

	public void Vender_Producto() {

		tienda.mostrarIdProductos(); /// se muestran los id de los productos

		Scanner scanner = new Scanner(System.in);

		int id = -1;
		int cantidad = 0;

		while (id == -1) {
			scanner.nextLine();
			try {
				System.out.println("Ingrese el Id del producto a vender"); /// se pide el id del producto a vender
				id = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un numero"); /// se verifica que se haya ingresado un num
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		if (tienda.getProductos().size() >= id) { /// verifica que el id exista, si existe continua

			while (cantidad == 0) {
				scanner.nextLine();
				try {
					System.out.println("Ingrese cantidad a vender");
					cantidad = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un numero");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			if (cantidad <= tienda.getProductos().get(id).stock) { /// verifica que haya stock suficiente

				System.out.println("Venta realizada");
				tienda.getProductos().get(id).stock -= cantidad; /// si es asi, resto la cantidad vendida al stock de la
																	/// tienda
				tienda.agregar(tienda.getProductos().get(id).precio * cantidad);/// y agrego el precio de la venta a la
																				/// caja
			} else {
				System.out.println("Stock insuficiente");
			}

		} else {
			System.out.println("Id inexistente");
		}

	}

	public void Reponer_Stock() {

		tienda.mostrarIdProductos(); /// se muestran los id de los productos
		/// para los id de los productos uso el indice
		Scanner scanner = new Scanner(System.in); /// en la lista

		int id = -1;
		int cantidad = 0;

		while (id == -1) {
			scanner.nextLine();
			try {
				System.out.println("Ingrese el Id del producto a reponer"); /// se pide el id del producto a vender
				id = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un numero"); /// se verifica que se haya ingresado un num
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		if (tienda.getProductos().size() >= id) { /// verifica que el id exista, si existe continua

			while (cantidad == 0) {
				scanner.nextLine();
				try {
					System.out.println("Ingrese cantidad a reponer");
					cantidad = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un numero");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			tienda.getProductos().get(id).stock += cantidad;
			System.out.println("Stock repuesto");

		} else {
			System.out.println("Id inexistente");
		}
	}

	public void Cambiar_Precio() {

		Scanner scanner = new Scanner(System.in);

		int id = -1;
		int precio = 0;

		while (id == -1) {
			scanner.nextLine();
			try {
				System.out.println("Ingrese el Id del producto a cambiar de precio");
				tienda.mostrarIdProductos();
				id = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debe ingresar un numero"); /// se verifica que se haya ingresado un num
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		if (tienda.getProductos().size() >= id) { /// verifica que el id exista, si existe continua

			while (precio == 0) {
				scanner.nextLine();
				System.out.println("Precio actual: " + tienda.getProductos().get(id).precio);
				try {
					System.out.println("Ingrese nuevo precio: ");
					precio = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Debe ingresar un numero");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}

			tienda.getProductos().get(id).precio = precio;
			System.out.println("Precio modificado");

		} else {
			System.out.println("Id inexistente");
		}
	}

	public void Agregar_Producto(Producto productoAgregado) {

		boolean existe = false;

		for (Producto producto : tienda.getProductos()) {
			if (productoAgregado.getNombreProducto().equals(producto.getNombreProducto())) {
				System.out.println("El producto que desea agregar ya existe en la tienda");
				existe = true;
			}
		}
		if (!existe) {
			tienda.getProductos().add(productoAgregado);
		}
	}

	public void Quitar_Producto (){

		tienda.mostrarIdProductos();
		int id=-1;

		Scanner scanner = new Scanner(System.in);

		while (id==-1) {
			scanner.nextLine();

			try{
				System.out.println("Ingrese id del producto a quitar");
				id = scanner.nextInt();
			}
			catch (InputMismatchException e){
				System.out.println("Debe ingresar un numero");
			}
		}

		if (tienda.getProductos().size()>=id){
			tienda.getProductos().remove(id);
			System.out.println("Producto removido");}
		else { System.out.println("Id inexistente");

		}
	}

	public void Retirar_De_Caja (){
		Scanner scanner = new Scanner(System.in);
		int cantidad = 0;

		while (cantidad==0){

			scanner.nextLine();

			try{
				tienda.verSaldo();
				System.out.println("Ingrese la cantidad a retirar");
				cantidad = scanner.nextInt();
			}catch (InputMismatchException e){                      ///verifica que se haya ingresado un numero
				System.out.println("Debe ingresar un numero");
			}catch (Exception e){
				e.getMessage();
			}
		}

		boolean retiro = tienda.pagar(cantidad);                                    ///utilizo la interfaz billetera
		if (retiro){
			System.out.println("Retiro de caja registrado");
			tienda.verSaldo();
		}else { System.out.println("El monto indicado es mayor al existente en la caja");
			tienda.verSaldo();
		}
	}

	public void Reponer_Caja (){

		Scanner scanner = new Scanner(System.in);
		int cantidad = 0;

		while (cantidad==0){

			scanner.nextLine();

			try{
				System.out.println("Ingrese la cantidad a reponer");
				cantidad = scanner.nextInt();
			}catch (InputMismatchException e){                      ///verifica que se haya ingresado un numero
				System.out.println("Debe ingresar un numero");
			}catch (Exception e){
				e.getMessage();
			}
		}

		tienda.agregar(cantidad);                        ///utilizo la funcion de la interfaz billetera
		System.out.println("Reposicion de caja registrada");

	}

	//endregion

	
	/*public JSONArray levantarJson() throws JSONException { JSONArray listArray =
	 * new JSONArray(); JsonUtil utiles = new JsonUtil(); JSONObject jsonObject =
	 * new JSONObject();
	 * 
	 * for (T e : lista) { listArray.put(e.getFormatoJSON()); } String respuesta =
	 * listArray.toString(); JSONArray arregloJson = new JSONArray(respuesta);
	 * utiles.grabarJson(arregloJson); return arregloJson; }*

	public void Levantar_ALL() throws JSONException {
		JSONArray listaArray = new JSONArray();
		JsonUtil utiles = new JsonUtil();
		listaArray.put(avionGuerra.levantarJson());
		listaArray.put(avionPrivado.levantarJson());
		listaArray.put(avionCargas.levantarJson());
		listaArray.put(avionComercial.levantarJson());
		String repuesta = listaArray.toString();
		JSONArray arregloJson = new JSONArray(repuesta);
		utiles.grabarJson(arregloJson);
		System.out.println(arregloJson);

	}

	public String Pasar_A_JSON_Lista() {
		JSONArray ListJson = new JSONArray(ListaHelado);
		JSONArray ListJson2 = new JSONArray(ListaHelado);
		return ListJson.toString();
	}*/


	/*public String devuelveToString(){
	
		JSONArray jsonArray = new JSONArray();
		JSONObject myObject = new JSONObject();
	
		myObject = devuelveObj();
	
		jsonArray.put(myObject);
	
		return jsonArray.toString();
	}*/

}
