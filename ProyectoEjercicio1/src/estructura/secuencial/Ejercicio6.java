package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/**
		 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		 */
		
		double Kmh;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la velocidad en Km/h");
		Kmh = scan.nextDouble();
		double ms = Kmh * 1000 / 3600;
		System.out.println("m/s: " + ms);
		ms = scan.nextDouble();
		

	}

}
