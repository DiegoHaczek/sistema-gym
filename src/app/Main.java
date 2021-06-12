package app;

import java.time.LocalDate;
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
		boolean b = true;

		GYM gym;

		gym.AgregarPersona(new Profesor("Hector","Sosa",35749547,'H',35,223548743, Disciplina.MUSCULACION);

		gym.AgregarPersona(new Cliente("Juan","Perez",44748146,'H',18,223548743, LocalDate.now()));

		gym.AgregarTurno(new Turno(9:00, new Profesor("")));
		
		while (true) {

			System.out.println("");
			System.out.println("Ingre una Opcion");
			System.out.println("1:");
			System.out.println("2:");
			System.out.println("3:");
			System.out.println("0:");
			System.out.println("");

			Scanner scanString = new Scanner(System.in);
			Scanner scanint = new Scanner(System.in);
			Scanner scan = new Scanner(System.in);

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
				b = false;
				break;
			}
		}

	}
}
