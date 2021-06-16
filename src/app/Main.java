package app;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;

import domain.*;

import javax.swing.text.Style;

public class Main {

	public static void main(String[] args) {

		//blñalbalablablbalablalbabllablabl

		int op;
		String opString;
		boolean estado2 = true;
		boolean estado = true;
		Persona persona;

		GYM gym = new GYM();

		gym.AgregarPersona(new Profesor("Hector", "Sosa", 1, 'H', 35, 223421122, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Jimena", "Fierro", 2, 'M', 35, 223421122, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Lucas", "Lopez", 3, 'H', 35, 223421122, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Pedro", "Sgalla", 4, 'H', 35, 223421122, Disciplina.MUSCULACION));

		gym.AgregarPersona(new Cliente("Juan", "Perez", 5, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Juana", "Matinez", 6, 'M', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Pablo", "Jose", 7, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Gonzalo", "Perez", 8, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Gaston", "Loel", 9, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Franco", "Valiente", 10, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Lucia", "Benoffi", 11, 'M', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Pedro", "Lopez", 12, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Sofia", "Piedra", 13, 'M', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Andrea", "Gonzales", 14, 'M', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Malena", "Polites", 15, 'M', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Carlos", "Fernandez", 16, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Ezequiel", "Valdes", 17, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Francisco", "Aguas", 18, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Nicolas", "Rodriguez", 19, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Elias", "Feliz", 21, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Enrique", "Rojo", 23, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Matias", "Azul", 24, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));
		gym.AgregarPersona(new Cliente("Cristian", "Maldis", 25, 'H', 18, 223421122, LocalDate.now(),FrecuenciaPago.SEMANAL));

		gym.AgregarTurno(new Turno(9, new Profesor("Hector", "Sosa", 1, 'H', 35, 223548743, Disciplina.MUSCULACION)));
		gym.AgregarTurno(new Turno(10, new Profesor("Jimena", "Fierro", 2, 'M', 35, 223548743, Disciplina.MUSCULACION)));
		gym.AgregarTurno(new Turno(11, new Profesor("Lucas", "Lopez", 3, 'H', 35, 223548743, Disciplina.MUSCULACION)));
		gym.AgregarTurno(new Turno(12, new Profesor("Pedro", "Sgalla", 4, 'H', 35, 223548743, Disciplina.MUSCULACION)));

		while (estado) {
			System.out.println("");
			System.out.println("Ingre una Opcion");
			System.out.println("1:Profesor");
			System.out.println("2:Cliente");
			System.out.println("3:Turnos");
			System.out.println("4:Tienda");
			System.out.println("5:Listar");
			System.out.println("6:Planilla de Caja");
			System.out.println("7:Modificar valor Articulos");
			System.out.println("0:Salir");
			System.out.println("");

			Scanner scanner = new Scanner(System.in);
			switch (op = scanner.nextInt()){
				case 1:
					estado2 = true;
					while(estado2){
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3: Borrar Profesor");
						System.out.println("0:Salir");
						System.out.println("");

						switch (op = scanner.nextInt()){
							case 1:
								gym.ListarCliente();
								break;
							case 2:
								gym.BuscarProfesorPorDNI();
								break;
							case 3:
								gym.Borrar_Profesor();
								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;
				case 2:
					estado2 = true;
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3: Borrar Cliente");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scanner.nextInt()) {
							case 1:
								break;
							case 2:
								break;
							case 3:
								gym.Borrar_Cliente();
								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;
				case 3:
					estado2 = true;
					while (estado2){
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1: Inscribirse a un Turno");
						System.out.println("2: Cambiar de Turno");
						System.out.println("3: Cancelar Turno");
						System.out.println("4: Ver Turnos");
						System.out.println("0: Salir");
						System.out.println("");
						switch (op = scanner.nextInt()) {
							case 1:
								persona = gym.BuscarClientePorDNI();

								if (persona == null) {
									System.out.println("Esta persona no esta es null");
									break;
								}

								if (gym.Inscribirse_A_Turnos(gym.Elegir_Turno(), persona)) {
									System.out.println("Se ingreso a la persona");
								} else {
									System.out.println("LLega?3");
								}
								break;
							case 2:
								persona = gym.BuscarClientePorDNI();
								gym.Cambiar_De_Turnos(persona, gym.Buscar_Turno_Por_Cliente(persona), gym.Elegir_Turno());
								break;
							case 3:
								persona = gym.BuscarClientePorDNI();
								gym.Cancelar_Turno(gym.Buscar_Turno_Por_Cliente(persona), persona);
								break;
							case 4:
								gym.Ver_Turnos();
								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;
				case 4:
					estado2 = true;
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1: Ver Tienda");
						System.out.println("2: Vender");
						System.out.println("3: Agregar Producto");
						System.out.println("4: Reponer Stock");
						System.out.println("5: Reponer Caja");
						System.out.println("6: Retirar de Caja");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scanner.nextInt()) {
							case 1:
								gym.Ver_Tienda();
								break;
							case 2:
								gym.Vender_Producto();
								break;
							case 3:
								gym.Agregar_Producto(new Producto());
								break;

							case 4:
								gym.Reponer_Stock();
								break;
							case 5:
								gym.Reponer_Caja();
								break;
							case 6:
								gym.Retirar_De_Caja();
								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;
				case 5:
					estado2 = true;
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1: Ver profesores");
						System.out.println("2: Ver clientes");
						System.out.println("3: Ver productos");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scanner.nextInt()) {
							case 1:
								gym.ListarProfesor();
								break;
							case 2:
								gym.ListarCliente();
								break;
							case 3:
								gym.Ver_Tienda();
								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;
				case 6:
					estado2 = true;
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:Ver movimientos");
						System.out.println("2:Cerrar caja");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scanner.nextInt()) {
							case 1:
								gym.listar();
								break;
							case 2:
								gym.cierreCaja();
								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;
				case 7:
					estado2 = true;
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scanner.nextInt()) {
							case 1:

								break;
							case 2:

								break;
							case 3:

								break;
							default:
								System.out.println("Entrada incorrecta");
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
					break;

				default:
					System.out.println("Entrada incorrecta");
					break;

				case 0:
					estado = false;
					break;
			}

		}


	}

}
