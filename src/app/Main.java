package app;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;

import domain.*;

public class Main {
	public static void main(String[] args) {
		int op;
		String opString;
		int opint;
		int opint2;
		boolean estado = true;

		GYM gym = new GYM();

		gym.AgregarPersona(new Profesor("Hector", "Sosa", 35749547, 'H', 35, 223548743, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Jimena", "Fierro", 35749547, 'M', 35, 223548743, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Lucas", "Lopez", 35749547, 'H', 35, 223548743, Disciplina.MUSCULACION));
		gym.AgregarPersona(new Profesor("Pedro", "Sgalla", 35749547, 'H', 35, 223548743, Disciplina.MUSCULACION));

		gym.AgregarPersona(new Cliente("Juan", "Perez", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Juana", "Matinez", 44748146, 'M', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Pablo", "Jose", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Gonzalo", "Perez", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Gaston", "Loel", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Franco", "Valiente", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Lucia", "Benoffi", 44748146, 'M', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Pedro", "Lopez", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Sofia", "Piedra", 44748146, 'M', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Andrea", "Gonzales", 44748146, 'M', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Malena", "Polites", 44748146, 'M', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Carlos", "Fernandez", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Ezequiel", "Valdes", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Francisco", "Aguas", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Nicolas", "Rodriguez", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Elias", "Feliz", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Enrique", "Rojo", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Matias", "Azul", 44748146, 'H', 18, 223548743, LocalDate.now()));
		gym.AgregarPersona(new Cliente("Cristian", "Maldis", 44748146, 'H', 18, 223548743, LocalDate.now()));

		gym.AgregarTurno(new Turno(LocalTime.of(9, 00, 00),
				new Profesor("Hector", "Sosa", 35749547, 'H', 35, 223548743, Disciplina.MUSCULACION)));
		gym.AgregarTurno(new Turno(LocalTime.of(9, 00, 00),
				new Profesor("Jimena", "Fierro", 35749547, 'M', 35, 223548743, Disciplina.MUSCULACION)));
		gym.AgregarTurno(new Turno(LocalTime.of(9, 00, 00),
				new Profesor("Lucas", "Lopez", 35749547, 'H', 35, 223548743, Disciplina.MUSCULACION)));
		gym.AgregarTurno(new Turno(LocalTime.of(9, 00, 00),
				new Profesor("Pedro", "Sgalla", 35749547, 'H', 35, 223548743, Disciplina.MUSCULACION)));

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
					while (estado) {
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
								estado = false;
								break;
						}
					}

				case 2:
					while (estado) {
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
								estado = false;
								break;
						}
					}
				case 3:
					while (estado) {
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
								estado = false;
								break;
						}
					}
				case 4:
					while (estado) {
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
								estado = false;
								break;
						}
					}
				case 5:
					while (estado) {
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
								estado = false;
								break;
						}
					}
				case 6:
					while (estado) {
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
								estado = false;
								break;
						}
					}
				case 7:
					while (estado) {
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
								estado = false;
								break;
						}
					}
				case 8:
					while (estado) {
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
								estado = false;
								break;
						}
					}

				default:

					System.out.println("Opcion invalida");
					new java.util.Scanner(System.in).nextLine();
					break;
				case 0:
					estado = false;
					break;
			}
		}

	}
}
