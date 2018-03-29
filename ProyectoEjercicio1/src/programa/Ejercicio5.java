package programa;

public class Ejercicio5 {

	public static void main(String[] args) {
		/**
		 *  Programa Java que declare una variable A de tipo entero y asígnale un valor. 
		 *  A continuación muestra un mensaje indicando si A es par o impar. Utiliza el 
		 *  operador condicional ( ? : ) dentro del println para resolverlo. 
		 */
		
		int A = 44;
		
		System.out.println("Par o impar? -> " + (A % 2 == 0? "Es par" : "Es impar"));

	}

}
