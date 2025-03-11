package crud.ejercicio4;

import java.util.*;

public class Main {
	
	static Scanner reader = new Scanner(System.in);
	
	static int askCodigo() {
		int codigo;
		
		System.out.print("Introduce el código: ");
		codigo = reader.nextInt();
		reader.nextLine();
		
		return codigo;
	}
	
	static String askAutor() {
		System.out.print("Introduce el autor: ");
		return reader.nextLine();
	}
	
	static String askTitulo() {
		System.out.print("Introduce el título: ");
		return reader.nextLine();
	}
	
	static int askDuracion() {
		int duracion;
		
		System.out.print("Introduce la duración (en segundos): ");
		duracion = reader.nextInt();
		reader.nextLine();
		
		return duracion;
	}
	
	static String askGenero() {
		System.out.print("Introduce el género: ");
		return reader.nextLine();
	}

	public static void main(String[] args) {
		
		int opcion;
		
		int codigo;
		String autor;
		String titulo;
		int duracion;
		String genero;
		
		do {
			
			System.out.print("COLECCIÓN DE DISCOS\n===================\n1. Listado.\n2. Nuevo Disco.\n3. Borrar.\n4. Salir.\nIntroduce una opción: ");
			opcion = reader.nextInt();
			reader.nextLine();
			
			switch (opcion) {
			case 1 -> {
				if (!Crud.read()) {
					System.out.println("No hay discos registrados.");
				}
			}
			case 2 -> {
				codigo = askCodigo();
				autor = askAutor();
				titulo = askTitulo();
				duracion = askDuracion();
				genero = askGenero();
				
				if (Crud.create(codigo, autor, titulo, duracion, genero)) {
					System.out.println("El disco se ha agregado correctamente.");
				} else {
					System.out.println("Ha ocurrido un problema a la hora de agregar el disco.");
				}
			}
			case 3 -> {
				codigo = askCodigo();
				
				if (Crud.delete(codigo)) {
					System.out.println("El disco se ha eliminado correctamente.");
				} else {
					System.out.println("Ha ocurrido un problema a la hora de eliminar el disco.");
				}
			}
			case 4 -> System.out.println("Saliendo del programa...");
			default -> System.out.println("No ha introducido una opción correcta.");
			}
			
		} while (opcion != 4);
		
	}

}
