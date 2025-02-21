package parte4.ejercicio1;

import java.util.*;

public class Crud {
	
	public static void mostrarOpciones() {
		System.out.println("ALUMNOS/AS\n"
				+ "===================\n"
				+ "1. Listado.\n"
				+ "2. Nuevo Alumno.\n"
				+ "3. Modificar.\n"
				+ "4. Borrar.\n"
				+ "5. Salir.");
	}
	
	HashMap<Alumno, Alumno>Alumnos = new HashMap<>();
}