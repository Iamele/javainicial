package programa;

public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		* Programa java que realice lo siguiente: declarar dos variables X e Y de tipo 
		* int, dos variables N y M de tipo double y asigna a cada una un valor. A 
		* continuación reliza y muestra muestra por pantalla una serie de operaciones entre 
		* ellas. 
		*/
		
		int X = 12;
		int Y = 78;
		double N = 12.5;
		double M = 23.1;
		
		/**
		 * Suma
		 */
		
		System.out.println("suma X + Y: " + (X + Y));
		System.out.println("suma N + M: " + (N + M));
		System.out.println("suma X + N: " + (X + N));
		System.out.println("suma Y + M: " + (Y + M));
		System.out.println("suma Y + N: " + (Y + N));
		
		/**
		 * Diferencia
		 */
		
		
		System.out.println("diferencia X - Y: " + (M - Y));
		System.out.println("diferencia N - M: " + (N - M));
		System.out.println("diferencia X - N: " + (X - N));
		System.out.println("diferencia Y - M: " + (Y - M));
		System.out.println("diferencia Y - N: " + (Y - N));
		
		/**
		 * Producto
		 */
		
		
		System.out.println("producto X * Y: " + (X * Y));
		System.out.println("producto N * M: " + (N * M));
		System.out.println("producto X * N: " + (X * N));
		
		/**
		 * Cociente
		 */
		
		System.out.println("cociente X / Y: " + (X / N));
		
		/**
		 * Resto
		 */
		
		System.out.println("resto X % 2: " + (X % 2));
		
		/**
		 * El doble
		 */
		
		System.out.println("doble de M: " + (M * 2));
		
		/**
		 * El producto
		 */
		
		System.out.println("El producto: " + (X * Y * M * N) + " Y la suma: " + (X + Y + M + N));
	}

}
