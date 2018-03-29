package estructura.secuencial;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/**
		 * Programa que lee un número de 3 cifras y muestra sus cifras por separado.
		 */
		
		int numero;
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt(); 
		System.out.println("Ingrese numero de tres cifras");
		validarIngreso (numero, scan);
		
		
		
		
		
	}
		
		
		private static int validarIngreso(int numero, Scanner scan) {
			if (numero < 1000 && numero > 99) {
				return numero;
			}else {
				System.out.println("El valor es incorrecto, "
						+ "re-ingrese un numero de 3 cifras");
				numero = scan.nextInt();
				return validarIngreso(numero, scan);
			}
			
		}
}

		
		
	
			


  


