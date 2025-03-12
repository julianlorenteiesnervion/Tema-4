package examenRepaso;

import java.util.*;

public class ListadoEmpleados {

	private static HashSet<Empleado>listaEmpleados = new HashSet<>();
	
	public static boolean create(Empleado empleado) {
		boolean op = false;
		
		if (!exists(empleado) && listaEmpleados.add(empleado)) {
			op = true;
		}
		
		return op;
	}
	
	public static boolean exists(Empleado empleado) {
		boolean op = false;
		
		for (Empleado empleado2 : listaEmpleados) {
			if (empleado.equals(empleado2)) {
				op = true;
			}
		}
		
		return op;
	}
	
	public static boolean read() {
		boolean op = false;
		
		if (!listaEmpleados.isEmpty()) {
			for (Empleado empleado : listaEmpleados) {
				System.out.println(empleado);
			}
			
			op = true;
		}
		
		return op;
	}
	
	public static boolean updateHorasExtra(Empleado empleado, int horasExtra) {
		boolean op = false;
		
		for (Empleado empleado2 : listaEmpleados) {
			if (empleado.equals(empleado2)) {
				empleado2.setHorasExtra(horasExtra);
				
				op = true;
			}
		}
		
		return op;
	}
	
	public static void updateImporteExtra(int importeExtra) {
		Empleado.setImporteExtra(importeExtra);
	}
	
	public static boolean delete(Empleado empleado) {
		return listaEmpleados.remove(empleado);
	}
}
