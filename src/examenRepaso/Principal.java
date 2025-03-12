package examenRepaso;

import java.util.*;

public class Principal {

	static Scanner reader = new Scanner(System.in);
	
	static String askDni() {
		System.out.print("Introduce el DNI: ");
		return reader.nextLine();
	}
	
	static String askNombre() {
		System.out.print("Introduce el nombre: ");
		return reader.nextLine();
	}
	
	static int askSueldoBase() {
		int sueldoBase;
		
		System.out.print("Introduce el sueldo base: ");
		sueldoBase = reader.nextInt();
		reader.nextLine();
		
		return sueldoBase;
	}
	
	static int askHorasExtra() {
		int horasExtra;
		
		System.out.print("Introduce las horas extra: ");
		horasExtra = reader.nextInt();
		reader.nextLine();
		
		return horasExtra;
	}
	
	public static void main(String[] args) {
		
		Empleado empleado = null;
		int opcion;
		String dni;
		String nombre;
		int sueldoBase;
		int horasExtra;
		int importe;
		
		System.out.println("Bienvenido al sistema");
		
		do {
			
			System.out.print("1. Añadir empleado.\n"
					+ "2. Listar empleados.\n"
					+ "3. Modificar horas extra.\n"
					+ "4. Modificar importe horas extra.\n"
					+ "5. Eliminar empleado.\n"
					+ "0. Salir.\n"
					+ "Introduce una opción: ");
			opcion = reader.nextInt();
			reader.nextLine();
			
			switch (opcion) {
			case 1 -> {
				dni = askDni();
				nombre = askNombre();
				sueldoBase = askSueldoBase();
				horasExtra = askHorasExtra();
				
				empleado = new Empleado(dni, nombre, sueldoBase, horasExtra);
				
				if (ListadoEmpleados.create(empleado)) {
					System.out.println("El empleado se ha agregado correctamente.");
				} else {
					System.out.println("Ha ocurrido un problema a la hora de agregar el empleado.");
				}
			}
			case 2 -> {
				if (!ListadoEmpleados.read()) {
					System.out.println("La lista está vacía.");
				}
			}
			case 3 -> {
				dni = askDni();
				horasExtra = askHorasExtra();
				
				empleado = new Empleado(dni);
				
				if (ListadoEmpleados.updateHorasExtra(empleado, horasExtra)) {
					System.out.println("Se ha actualizado la cantidad de horas extra del empleado con DNI " + dni + ".");
				} else {
					System.out.println("Ha ocurrido un problema a la hora de actualizar la cantidad de horas extra.");
				}
			}
			case 4 -> {
				System.out.print("Introduce el nuevo importe de horas extra: ");
				importe = reader.nextInt();
				reader.nextLine();
				
				ListadoEmpleados.updateImporteExtra(importe);
			}
			case 5 -> {
				dni = askDni();
				
				empleado = new Empleado(dni);
				
				if (ListadoEmpleados.delete(empleado)) {
					System.out.println("El empleado se ha eliminado correctamente.");
				} else {
					System.out.println("Ha ocurrido un problema a la hora de eliminar el empleado.");
				}
			}
			case 0 -> {
				System.out.println("Saliendo del sistema...");
			}
			default -> System.out.println("Ha introducido una opción no válida.");
			}
			
		} while (opcion != 0);
		
	}

}
