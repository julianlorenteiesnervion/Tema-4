package crud.ejercicio1;

import java.util.*;

public class Main {
	static Scanner reader = new Scanner(System.in);
	
	static void mostrarOpciones() {
		System.out.println("ALUMNOS/AS\n"
				+ "===================\n"
				+ "1. Listado.\n"
				+ "2. Nuevo Alumno.\n"
				+ "3. Modificar.\n"
				+ "4. Borrar.\n"
				+ "5. Salir.");
	}
	
	static boolean checkOpcion(int num) {
		boolean res = false;
		
		if (num >= 1 && num <= 5) {
			res = true;
		}
		
		return res;
	}
	
	static String askNombre() {
		System.out.print("Introduce el nombre: ");
		return reader.nextLine();
	}
	
	static double askMedia() {
		System.out.print("Introduce la nota media: ");
		double media = reader.nextDouble();
		reader.nextLine();
		
		return media;
	}

	public static void main(String[] args) {

		int opcion;
		
		String nombre;
		double notaMedia;
		
		do {
			mostrarOpciones();
			
			do {
				System.out.print("Introduce una opción: ");
				opcion = reader.nextInt();
				reader.nextLine();
			} while (!checkOpcion(opcion));
			
			
			switch (opcion) {
			case 1 -> {
				if (!Crud.read()) {
					System.out.println("No hay alumnos en la lista.");
				}
			}
			case 2 -> {
				nombre = askNombre();
				
				notaMedia = askMedia();
				
				Crud.create(nombre, notaMedia);
			}
			case 3 -> {
				nombre = askNombre();
				
				notaMedia = askMedia();
				
				if (Crud.update(nombre, notaMedia)) {
					System.out.println("Alumno actualizado.");
				} else {
					System.out.println("El alumno no existe.");
				}
			}
			case 4 -> {
				nombre = askNombre();
				
				if (Crud.remove(nombre)) {
					System.out.println("Alumno eliminado.");
				} else {
					System.out.println("El alumno no existe.");
				}
			}
			case 5 -> {
				System.out.println("Saliendo del programa...");
			}
			}
		} while (opcion != 5);
		
		reader.close();
	}

}
