package condicionales;

import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) {
		/**
		 * Java 05 Sintaxis de la condicional if Si la condicional es verdadera, se
		 * ejecuta la instrucción del if
		 * 
		 * if ( condicional ) sentencias;
		 * 
		 * if ( condicional ) { sentencias; }
		 * 
		 * if ( condicional ) sentencia; else sentencia_Si_condicional_es_falsa;
		 * ------------------------------------------------------ if ( condicional )
		 * sentencia; else if ( nueva_condicional) sentencia; . . . else if (
		 * n_condición ) sentencia; else sentencia;
		 * 
		 */

		boolean condicion = false;
		if (condicion)
			System.out.println("La condición es verdadera");
		else
			System.out.println("La condición es falsa");

		int edad = 15;

		if (edad >= 18)
			System.out.println("La persona es mayor de edad ");
		else
			System.out.println("La persona es menor de edad");

		// ---------------------------------------------------
		/*
		 * De una variable tipo int, evaluar si está en el rango de 1 a 10, si es así
		 * desplegar en consola "La selección está en el rango" En caso contrario
		 * "La selección está fuera de rango"
		 */
		int rango = -5;

		if (rango >= 1 && rango <= 10) {
			System.out.println("La selección está en el rango");
		} else {
			System.out.println("La selección está fuera de rango");
		}

		// -----------------------------------------------------
		/*
		 * Operador ternario.
		 * 
		 * Sintaxis: expresión ? respuesta_si_es_true : si_es_false
		 * 
		 */

		String texto = ( rango >= 1 && rango <= 10 ) ?
				"La selección está en el rango" : 
				"La selección está fuera de rango";
		System.out.println(texto);
	// ------------------------------------------------------------------------
	// --------------  Clase Scanner ------------------------------------------
		Scanner myScan;
		myScan = new Scanner( System.in  );
		System.out.print("Escribe tu nombre: ");
		String myName = myScan.nextLine(); // leer hasta /n "
		
		System.out.println("Tu nombre es: " + myName);
		

	}
	

}
