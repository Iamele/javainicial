package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	/**
	 * Programa Java que lea un nombre y muestre por pantalla:
	 * “Buenos dias nombre_introducido”.
	 */
		
		String nombre;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre = scan.nextLine();
		System.out.println("Buenos dias " + nombre);

	}

}
