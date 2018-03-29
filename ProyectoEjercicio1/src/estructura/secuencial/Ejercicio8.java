package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/**
		 * Programa que calcula el volumen de una esfera.
		 */
		
		double radio, volumen;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el radio de la esfera");
		radio = scan.nextDouble();
		volumen = solveVolume(radio);
		System.out.println("Volumen: " + volumen);
		
	}

		
		private static double solveVolume(double radio) {
			double volume = 4 * Math.PI / 3 * Math.pow(radio, 3);
			return volume;
			
		}
		
	}


