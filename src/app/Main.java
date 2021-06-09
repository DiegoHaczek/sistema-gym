package app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int op;
		String opString;
		int opint;
		int opint2;
		boolean b = true;
		
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
