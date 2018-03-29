package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/**
		 * Programa que lea una cantidad de grados centígrados y la pase a grados 
		 * Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
		 */
		
		double centigrados;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese grados centigrados");
		centigrados = scan.nextDouble();
		double fahrenheit = 32 + (9 * centigrados / 5);
		
		System.out.println("Fahrenheit es: " + (9 * centigrados / 5));
		

	}

}
