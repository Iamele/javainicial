package programa;

public class Ejercicio4 {

	public static void main(String[] args) {
		/**
		 * Programa java que declare cuatro variables enteras A, B, C y D y as�gnale un 
		 * valor acada una. A continuaci�n realiza las instrucciones necesarias para que: 
		 * B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el 
		 * valor de B.
		 */
		
		int A = 8;
		int B = 12;
		int C = 4;
		int D = 13;
		int AUX = B;
		
		System.out.println("B = C: " + (B = C));
		System.out.println("C = A: " + (C = A));
		System.out.println("A = D: " + (A = D));
		System.out.println("D = B: " + (D = AUX));

	}

}
