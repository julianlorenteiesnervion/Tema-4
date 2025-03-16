package crud.ejercicio5;

import java.util.*;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);
	
	private static CuentaCorriente crearCuenta() {
        System.out.print("Introduce el número de cuenta: ");
        String numeroCuenta = reader.nextLine();
        System.out.print("Introduce el saldo inicial: ");
        double saldoInicial = reader.nextDouble();
        reader.nextLine();
        return new CuentaCorriente(numeroCuenta, saldoInicial);
    }

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
        int opcion;
        CuentaCorriente cuenta = null;
        
        do {
        	System.out.println("\n--- Menú de Gestión de Cuentas ---\n" +
        		    "1. Crear una cuenta\n" +
        		    "2. Mostrar cuentas\n" +
        		    "3. Ingresar dinero\n" +
        		    "4. Retirar dinero\n" +
        		    "5. Eliminar una cuenta\n" +
        		    "0. Salir\n" +
        		    "Elige una opción: ");
            opcion = reader.nextInt();
            reader.nextLine();

            switch (opcion) {
                case 1 -> {
                	// Crear una cuenta
                    cuenta = crearCuenta();
                    if (Crud.create(cuenta)) {
                        System.out.println("Cuenta creada exitosamente.");
                    } else {
                        System.out.println("La cuenta ya existe.");
                    }
                }
                    
                case 2 -> {
                	// Mostrar cuentas
                	Crud.read();
                }
                case 3 -> {
                	// Ingresar dinero
                		System.out.println("Nombre de la cuenta: ");
                		cuenta = new CuentaCorriente(reader.nextLine());
                        System.out.print("Cantidad a ingresar: ");
                        int cantidadIngreso = reader.nextInt();
                        reader.nextLine();
                        Crud.ingreso(cuenta, cantidadIngreso);
                        System.out.println("Dinero ingresado.");
                }
                case 4 -> {
                	// Retirar dinero
                	System.out.println("Nombre de la cuenta: ");
            		cuenta = new CuentaCorriente(reader.nextLine());
                    System.out.print("Cantidad a retirar: ");
                    int cantidadRetiro = reader.nextInt();
                    reader.nextLine();
                    Crud.retiro(cuenta, cantidadRetiro);
                    System.out.println("Dinero retirado.");
                }
                case 5 -> {
                	// Eliminar una cuenta
                	System.out.println("Nombre de la cuenta: ");
            		cuenta = new CuentaCorriente(reader.nextLine());
                    if (Crud.delete(cuenta)) {
                        System.out.println("Cuenta eliminada exitosamente.");
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }
                case 0 -> {
                	System.out.println("Saliendo del programa...");
                }
                default -> {
                	System.out.println("Opción no válida.");
                }
            }
        } while (opcion != 0);
		
	}

}
