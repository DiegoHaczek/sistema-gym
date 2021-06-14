package app;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;

import domain.*;

public class Main {
	private static boolean incribirse_A_Turnos;

	public static void main(String[] args) {
		int op;
		String opString;
		int opint;
		int opint2;
		boolean estado2 = true;
		boolean estado = true;
		Persona persona;

		GYM gym = new GYM();

		gym.AgregarPersona(new Profesor("Hector", "Sosa", 1, 'H', 35, 223421122, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Jimena", "Fierro", 2, 'M', 35, 223421122, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Lucas", "Lopez", 3, 'H', 35, 223421122, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Pedro", "Sgalla", 4, 'H', 35, 223421122, Disciplina.MUSCULACION));

		gym.AgregarPersona(new Cliente("Juan", "Perez", 5, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Juana", "Matinez", 6, 'M', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Pablo", "Jose", 7, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Gonzalo", "Perez", 8, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Gaston", "Loel", 9, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Franco", "Valiente", 10, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Lucia", "Benoffi", 11, 'M', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Pedro", "Lopez", 12, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Sofia", "Piedra", 13, 'M', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Andrea", "Gonzales", 14, 'M', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Malena", "Polites", 15, 'M', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Carlos", "Fernandez", 16, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Ezequiel", "Valdes", 17, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Francisco", "Aguas", 18, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Nicolas", "Rodriguez", 19, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Elias", "Feliz", 21, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Enrique", "Rojo", 23, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Matias", "Azul", 24, 'H', 18, 223421122, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Cristian", "Maldis", 25, 'H', 18, 223421122, LocalDate.now()));

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
			System.out.println("5:");
			System.out.println("6:");
			System.out.println("7:");
			System.out.println("0:Salir");
			System.out.println("");

			Scanner scanString = new Scanner(System.in);
			Scanner scanint = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);

			switch (op = scan.nextInt()) {

				case 1:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}

				case 2:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
				case 3:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1: Incribirse a un Turno");
						System.out.println("2: Cambiar de Turno");
						System.out.println("3: Cancelar Turno");
						System.out.println("4: Ver Turnos");
						System.out.println("0: Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:
								persona= gym.BuscarClientePorDNI();
								
								if(persona == null){
									System.out.println("Esta persona no esta es null");
									break;
								}
								
								//ver porque se rompe aca
								if(gym.Incribirse_A_Turnos(9, persona) == true){
									System.out.println("Se ingresor a la persona");
								}else{
									System.out.println("LLega?3");
								}
								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:
								persona= gym.BuscarClientePorDNI();
								gym.Cambiar_De_Turnos(persona, 9, 12);
								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:
								persona= gym.BuscarClientePorDNI();
								gym.Cancelar_Turno(9, persona);
								new java.util.Scanner(System.in).nextLine();
								break;
							case 4:
								
								gym.Ver_Turnos();
								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
				case 4:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
				case 5:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
				case 6:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
				case 7:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}
				case 8:
					while (estado2) {
						System.out.println("");
						System.out.println("Ingre una Opcion");
						System.out.println("1:");
						System.out.println("2:");
						System.out.println("3:");
						System.out.println("0:Salir");
						System.out.println("");
						switch (op = scan.nextInt()) {
							case 1:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 2:

								new java.util.Scanner(System.in).nextLine();
								break;
							case 3:

								new java.util.Scanner(System.in).nextLine();
								break;

							default:

								System.out.println("Opcion invalida");
								new java.util.Scanner(System.in).nextLine();
								break;
							case 0:
								estado2 = false;
								break;
						}
					}

				default:

					System.out.println("Opcion invalida");
					new java.util.Scanner(System.in).nextLine();
					break;
				case 0:
					estado2 = false;
					break;
			}
		}

	}
}
