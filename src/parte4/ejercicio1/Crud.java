package parte4.ejercicio1;

import java.util.*;

public class Crud {
	
	static ArrayList<Alumno>alumnos = new ArrayList<>();
	
	public static boolean create(String nombre, double media) {
		Alumno alumno = new Alumno(nombre, media);
		
		alumnos.add(alumno);
		
		return true;
	}
	
	public static boolean read() {
		boolean op = false;
		
		int i = 0;
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre() + ": " + alumno.getMedia());
			i++;
		}
		
		if (i > 0) {
			op = true;
		}
		
		return op;
	}
	
	public static boolean update(String nombre, double media) {
		boolean op = false;
		
		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nombre)) {
				alumno.setMedia(media);
				
				op = true;
			}
		}
		
		return op;
	}
	
	public static boolean remove(String nombre) {
		boolean op = false;
		
		Alumno alumno = new Alumno(nombre);
		
		if (alumnos.remove(alumno)) {
			op = true;
		}
		
		return op;
	}
}