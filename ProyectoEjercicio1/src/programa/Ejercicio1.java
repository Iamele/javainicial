package programa;

public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * Programa java que realice lo siguiente: declarar una variable N de tipo int, 
		 * una variable A de tipo double y una variable C de tipo char y asigna a cada una 
		 * un valor. A continuaci�n muestra por pantalla: El valor de cada variable, la 
		 * suma de N + A, la diferencia de A - N, el valor num�rico correspondiente al 
		 * car�cter que contiene la variable C.
		 */

		int N = 12;
		double A = 50;
		char C = 'a';
				
		
		System.out.println("var A: " + A);
		System.out.println("var C: " + C);
		System.out.println("var N: " + N);
		
		System.out.println("var C " + (int) C);
		System.out.println("sum N + A: " + (N + A));
		System.out.println("dif A - N: " + (A - N));
		
	}

}
