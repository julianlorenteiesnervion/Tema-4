package crud.ejercicio3;

import java.util.*;

public class Main {
	static Scanner reader = new Scanner(System.in);
	
	static String askTamano() {
		System.out.print("Introduce el tamaño de la pizza: ");
		return reader.nextLine();
	}
	
	static String askTipo() {
		System.out.print("Introduce el tipo de la pizza: ");
		return reader.nextLine();
	}
	
	static int askCodigo() {
		System.out.print("Introduce el código de la pizza: ");
		int codigo = reader.nextInt();
		reader.nextLine();
		return codigo;
	}

	public static void main(String[] args) {
		
		String entrada = "";
		String tamano;
		String tipo;
		int codigo;
		
		do {
			
			System.out.print("a. Listado de pizzas\nb. Nuevo pedido\nc. Pizza servida\nd. Salir\nIntroduce una opción: ");
			entrada = reader.nextLine();
			
			switch (entrada) {
			// Listado de pizzas
			case "a" -> {
				if (!Crud.read()) {
					System.out.println("No hay pizzas registradas.");
				}
			}
			// Nuevo pedido
			case "b" -> {
				tamano = askTamano();
				tipo = askTipo();
				
				Crud.create(tamano, tipo);
			}
			// Pizza servida
			case "c" -> {
				codigo = askCodigo();
				
				if (Crud.serve(codigo)) {
					System.out.println("La pizza con el código " + codigo + " se ha servido correctamente.");
				} else {
					System.out.println("La pizza con el código " + codigo + " no existe o ya está servida.");
				}
			}
			// Salir
			case "d" -> {
				System.out.println("Saliendo del programa...");
			}
			default -> System.out.println("No ha introducido una opción válida.");
			}
			
		} while (!entrada.equals("d"));

	}

}
