package parte1.ejercicio2.OOP;

import java.util.*;

public class PrincipalPersona {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.print("Introduce tu dni: ");
		persona1.dni = reader.nextInt();
		reader.nextLine();
		System.out.print("Introduce tu nombre: ");
		persona1.nombre = reader.nextLine();
		System.out.print("Introduce tus apellidos: ");
		persona1.apellidos = reader.nextLine();
		System.out.print("Introduce tu edad: ");
		persona1.edad = reader.nextInt();
		reader.nextLine();
		
		System.out.print("Introduce tu dni: ");
		persona2.dni = reader.nextInt();
		reader.nextLine();
		System.out.print("Introduce tu nombre: ");
		persona2.nombre = reader.nextLine();
		System.out.print("Introduce tus apellidos: ");
		persona2.apellidos = reader.nextLine();
		System.out.print("Introduce tu edad: ");
		persona2.edad = reader.nextInt();
		reader.nextLine();
		
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + (persona1.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + (persona2.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		
	}

}
