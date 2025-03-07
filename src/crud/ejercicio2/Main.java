package crud.ejercicio2;

import java.util.*;

public class Main {
	static Scanner reader = new Scanner(System.in);
	
	static String askNombre() {
		System.out.print("Introduce el nombre: ");
		return reader.nextLine();
	}
	
	static double askPrecio() {
		System.out.print("Introduce el precio: ");
		double precio = reader.nextDouble();
		reader.nextLine();
		return precio;
	}
	
	static int askCuantosQuedan() {
		System.out.println("Introduce cuántos quedan: ");
		int cuantosQuedan = reader.nextInt();
		reader.nextLine();
		return cuantosQuedan;
	}

	public static void main(String[] args) {
		
		String entrada;
		
		String nombre;
		double precio;
		int cuantosQuedan;
		
		do {
			System.out.print("a. Listado\nb. Alta\nc. Baja\nd. Modificación\ne. Entrada de mercancía\n"
					+ "f. Salida de mercancía\ng. Salir\nIntroduzca la opción: ");
			entrada = reader.next();
			
			switch (entrada.toLowerCase()) {
			case "a" -> {
				if (!Crud.read()) {
					System.out.println("No hay artículos en la lista.");
				}
			}
			case "b" -> {
				nombre = askNombre();
				precio = askPrecio();
				cuantosQuedan = askCuantosQuedan();
				
				if (Crud.create(nombre, precio, 1.21, cuantosQuedan)) {
					System.out.println("El artículo se ha dado de alta correctamente.");
				}
			}
			case "c" -> {
				nombre = askNombre();
				
				if (Crud.delete(nombre)) {
					System.out.println("El artículo se ha dado de baja correctamente.");
				} else {
					System.out.println("El artículo no existe.");
				}
				
			}
			default -> {
				System.out.println("No ha introducido una opción correcta.");
			}
			}
			
		} while (!entrada.toLowerCase().equals("g"));

	}

}
