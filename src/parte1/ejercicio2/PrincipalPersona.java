/**
 * Clase principal que contiene el método main para probar la clase Persona.
 * Se solicitan datos de dos personas por consola y se determina si son mayores de edad.
 */
package parte1.ejercicio2;

import java.util.Scanner;

public class PrincipalPersona {

	/**
	 * Método principal que recoge los datos de dos personas por consola y muestra si son mayores de edad.
	 * 
	 * @param args Argumentos pasados por línea de comandos (no se utilizan en este caso).
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// Declaración de objetos Persona
		Persona persona1;
		Persona persona2;
		
		// Variables para almacenar los datos de las personas
		int dni;
		String nombre;
		String apellidos;
		int edad;
		
		// Solicitud de datos para la primera persona
		System.out.print("Introduce tu dni: ");
		dni = reader.nextInt();
		reader.nextLine();
		System.out.print("Introduce tu nombre: ");
		nombre = reader.nextLine();
		System.out.print("Introduce tus apellidos: ");
		apellidos = reader.nextLine();
		System.out.print("Introduce tu edad: ");
		edad = reader.nextInt();
		reader.nextLine();
		
		// Crear el objeto persona1 con los datos introducidos
		persona1 = new Persona(dni, nombre, apellidos, edad);
		
		// Solicitud de datos para la segunda persona
		System.out.print("Introduce tu dni: ");
		dni = reader.nextInt();
		reader.nextLine();
		System.out.print("Introduce tu nombre: ");
		nombre = reader.nextLine();
		System.out.print("Introduce tus apellidos: ");
		apellidos = reader.nextLine();
		System.out.print("Introduce tu edad: ");
		edad = reader.nextInt();
		reader.nextLine();
		
		// Crear el objeto persona2 con los datos introducidos
		persona2 = new Persona(dni, nombre, apellidos, edad);
		
		// Mostrar si las personas son mayores de edad
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + (persona1.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + (persona2.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
	}
}
