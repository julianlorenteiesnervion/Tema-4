package parte1.ejercicio2;

import java.util.*;

public class PrincipalPersona {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Persona persona1;
		Persona persona2;
		
		int dni;
		String nombre;
		String apellidos;
		int edad;
		
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
		
		persona1 = new Persona(dni, nombre, apellidos, edad);
		
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
		
		persona2 = new Persona(dni, nombre, apellidos, edad);
		
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + (persona1.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + (persona2.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		
	}

}
