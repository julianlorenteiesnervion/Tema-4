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
		System.out.print("Introduce el stock: ");
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
			reader.nextLine();
			
			switch (entrada.toLowerCase()) {
			case "a" -> { // Listado
				if (!Crud.read()) {
					System.out.println("No hay artículos en la lista.");
				}
			}
			case "b" -> { // Alta
				nombre = askNombre();
				precio = askPrecio();
				cuantosQuedan = askCuantosQuedan();
				
				if (Crud.create(nombre, precio, 1.21, cuantosQuedan)) {
					System.out.println("El artículo se ha dado de alta correctamente.");
				}
			}
			case "c" -> { // Baja
				nombre = askNombre();
				
				if (Crud.delete(nombre)) {
					System.out.println("El artículo se ha dado de baja correctamente.");
				} else {
					System.out.println("El artículo no existe.");
				}
				
			}
			case "d" -> { // Modificación
				nombre = askNombre();
				precio = askPrecio();
				cuantosQuedan = askCuantosQuedan();
				
				if (Crud.update(nombre, precio, cuantosQuedan)) {
					System.out.println("El artículo se ha actualizado correctamente.");
				} else {
					System.out.println("Ha ocurrido un problema con la modificación.");
				}
			}
			case "e" -> { // Entrada de mercancía
				nombre = askNombre();
				cuantosQuedan = askCuantosQuedan();
				
				if (Crud.newMercancia(nombre, cuantosQuedan)) {
					System.out.println("La mercancía se ha añadido correctamente.");
				} else {
					System.out.println("El artículo no existe o ha introducido una cantidad de mercancía incorrecta."); // ¿Puedo devolver enteros en vez de booleans para así dar un mensaje de error más específico con un switch?
				}
			}
			case "f" -> { // Salida de mercancía
				nombre = askNombre();
				cuantosQuedan = askCuantosQuedan();
				
				if (Crud.removeMercancia(nombre, cuantosQuedan)) {
					System.out.println("La mercancía se ha retirado correctamente.");
				} else {
					System.out.println("El artículo no existe o ha introducido una cantidad de mercancía incorrecta."); // ¿Puedo devolver enteros en vez de booleans para así dar un mensaje de error más específico con un switch?
				}
			}
			case "g" -> { // Salir
				System.out.println("Saliendo del programa...");
			}
			default -> {
				System.out.println("No ha introducido una opción correcta.");
			}
			}
			
		} while (!entrada.toLowerCase().equals("g"));

	}

}
