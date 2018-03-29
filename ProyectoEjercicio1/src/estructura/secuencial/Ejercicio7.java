package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la 
		 * longitud de la hipotenusa según el teorema de Pitágoras. 
		 */
		
		double cateto1, cateto2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el valor de los catetos");
		cateto1 = scan.nextDouble();
		cateto2 = scan.nextDouble();
		double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		System.out.println("Hipotenusa: " + hipotenusa);
		

	}

}
