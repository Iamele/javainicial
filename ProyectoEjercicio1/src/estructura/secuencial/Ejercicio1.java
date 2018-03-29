package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
		 */
		
		int primero, segundo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un entero");
		primero = scan.nextInt();
		System.out.println("Introduce otro entero");
		segundo = scan.nextInt();
		System.out.println("El primer nro es: " + primero + " El segundo nro es: " + segundo);
		

	}

}
