package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/**
		 * Programa Java que lee un número entero por teclado y obtiene y muestra por 
		 * pantalla el doble y el triple de ese número.
		 */
		
		int numero;
		Scanner scan = new Scanner(System.in); 
		System.out.println("Ingrese un numero entero");
		numero = scan.nextInt();
		int doble = numero * 2;
		int triple = numero * 3;
		System.out.println("El doble es: " + doble + " El triple es: " + triple);
		doble = scan.nextInt();
		triple = scan.nextInt();
		

	}

}
