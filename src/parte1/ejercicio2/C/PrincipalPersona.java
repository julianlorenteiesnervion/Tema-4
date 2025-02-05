package parte1.ejercicio2.C;

import java.util.*;

public class PrincipalPersona {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.print("Introduce tu dni: ");
		persona1.setDni(reader.nextInt());
		reader.nextLine();
		System.out.print("Introduce tu nombre: ");
		persona1.setNombre(reader.nextLine());
		System.out.print("Introduce tus apellidos: ");
		persona1.setApellidos(reader.nextLine());
		System.out.print("Introduce tu edad: ");
		persona1.setEdad(reader.nextInt());
		reader.nextLine();
		
		System.out.print("Introduce tu dni: ");
		persona2.setDni(reader.nextInt());
		reader.nextLine();
		System.out.print("Introduce tu nombre: ");
		persona2.setNombre(reader.nextLine());
		System.out.print("Introduce tus apellidos: ");
		persona2.setApellidos(reader.nextLine());
		System.out.print("Introduce tu edad: ");
		persona2.setEdad(reader.nextInt());
		reader.nextLine();
		
		System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni() + (persona1.getEdad() >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni() + (persona2.getEdad() >= 18 ? " es mayor de edad." : " no es mayor de edad."));
		
	}

}
