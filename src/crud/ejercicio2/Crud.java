package crud.ejercicio2;

import java.util.*;

public class Crud {

	static ArrayList<Articulo>listaArticulos = new ArrayList<>();
	
	public static boolean create(String nombre, double precio, double iva, int cuantosQuedan) {
		boolean op;
		
		Articulo articulo = new Articulo(nombre, precio, iva, cuantosQuedan);
		
		if (listaArticulos.add(articulo)) {
			op = true;
		} else {
			op = false;
		}
		
		return op;
	}
	
	public static boolean read() {
		boolean op;
		
		int i = 0;
		
		for (Articulo articulo : listaArticulos) {
			i++;
			System.out.println(articulo);
		}
		
		if (i > 0) {
			op = true;
		} else {
			op = false;
		}
		
		return op;
	}
	
	public static boolean update(String nombre, double precio, int cuantosQuedan) {
		boolean op = false;
		
		for (Articulo articulo : listaArticulos) {
			if (articulo.getNombre().equalsIgnoreCase(nombre)) {
				op = true;
				
				articulo.setPrecio(precio);
				articulo.setCuantosQuedan(cuantosQuedan);
			}
		}
		
		return op;
	}
	
	public static boolean delete(String nombre) {
		boolean op;
		
		Articulo articulo = new Articulo(nombre);
		
		if (listaArticulos.remove(articulo)) {
			op = true;
		} else {
			op = false;
		}
		
		return op;
	}
	
	public static boolean newMercancia(String nombre, int cuantosQuedan) {
		boolean op = false;
		
		for (Articulo articulo : listaArticulos) {
			if (articulo.getNombre().equalsIgnoreCase(nombre) && cuantosQuedan > 0) {
				articulo.setCuantosQuedan(articulo.getCuantosQuedan() + cuantosQuedan);
				
				op = true;
			}
		}
		
		return op;
	}
	
	public static boolean removeMercancia(String nombre, int cuantosQuedan) {
		boolean op = false;
		
		for (Articulo articulo : listaArticulos) {
			if (articulo.getNombre().equalsIgnoreCase(nombre) && (articulo.getCuantosQuedan() - cuantosQuedan) >= 0 && cuantosQuedan > 0) {
				articulo.setCuantosQuedan(articulo.getCuantosQuedan() - cuantosQuedan);
				
				op = true;
			}
		}
		
		return op;
	}
}
