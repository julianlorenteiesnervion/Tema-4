package crud.ejercicio4;

import java.util.*;

public class Crud {
	
	private static HashSet<Disco>listaDiscos = new HashSet<>();
	
	public static boolean create(int codigo, String autor, String titulo, int duracion, String genero) {
		boolean op = false;
		
		Disco disco = new Disco(codigo, autor, titulo, duracion, genero);
		
		if (listaDiscos.add(disco)) {
			op = true;
		}
		
		return op;
	}
	
	public static boolean read() {
		boolean op = false;
		
		int i = 0;
		
		for (Disco disco : listaDiscos) {
			System.out.println(disco);
			i++;
		}
		
		if (i > 0) {
			op = true;
		}
		
		return op;
	}
	
	public static boolean delete(int codigo) {
		boolean op = false;
		
		Disco disco = new Disco(codigo);
		
		if (listaDiscos.remove(disco)) {
			op = true;
		}
		
		return op;
	}
}
