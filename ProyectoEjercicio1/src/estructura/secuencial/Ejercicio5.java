package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/**
		 * Programa que lee por teclado el valor del radio de una circunferencia y calcula 
		 * y muestra por pantalla la longitud y el área de la circunferencia. Longitud de 
		 * la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
		 */
		
		double radio;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el valor del radio de una circunferencia");
		radio = scan.nextDouble();
		double longitud = 2*Math.PI*radio;
		double area = Math.PI* Math.pow(radio, 2);
		System.out.println("Longitud: " + longitud + " Area: " + area);
		longitud = scan.nextDouble();
		area = scan.nextDouble();

	}

}
