package programa;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * Programa Java que declare una variable C de tipo entero y asígnale un valor. A 
		 * continuación muestra un mensaje indicando si el valor de C es positivo o 
		 * negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es 
		 * mayor o menor que 100. Consideraremos el 0 como positivo. Utiliza el operador 
		 * condicional ( ? : ) dentro del println para resolverlo.
		 */
		
		int C = 5;
		
		System.out.println("Positivo o Negativo? " + (C == 0? "Positivo" : "Negativo" + " Paro o impar? " + (C % 2 == 0? "Par" : "Impar") + " Multiplo de 5? " + (C % 5 == 0? "Sí" : "No") + " Multiplo de 10? " + (C % 10 == 0? "Sí" : "No")));

	}

}
