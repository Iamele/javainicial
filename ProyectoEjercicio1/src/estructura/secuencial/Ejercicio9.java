package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/**
		 * Programa que calcula el �rea de un tri�ngulo a partir de la longitud de sus lados.
		 */
		
		double lado1, lado2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la longitud de los lados");
		lado1 = scan.nextDouble();
		lado2 = scan.nextDouble();
		System.out.println("Area del triangulo: " + (lado1 * lado2) / 2);
		

	}

}
