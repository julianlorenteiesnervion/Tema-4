package crud.ejercicio3;

import java.util.*;

import crud.ejercicio3.Pizza.Estado;

public class Crud {

	static ArrayList<Pizza>listaPizzas = new ArrayList<>();
	
	static int codigo = 0;
	
	public static boolean create(String tamano, String tipo) {
		boolean op = false;
		
		Pizza pizza = new Pizza(codigo, tamano, tipo);
		
		if (listaPizzas.add(pizza)) {
			op = true;
		}
		
		codigo++;
		
		return op;
	}
	
	public static boolean read() {
		boolean op = false;
		
		int i = 0;
		
		for (Pizza pizza : listaPizzas) {
			System.out.println(pizza);
			i++;
		}
		
		if (i > 0) {
			op = true;
		}
		
		return op;
	}
	
	public static boolean serve(int codigo) {
		boolean op = false;
		
		for (Pizza pizza : listaPizzas) {
			if (pizza.getCodigo() == codigo && pizza.getEstado().equals(Estado.PEDIDA)) {
				pizza.setEstado("SERVIDA");
				
				op = true;
			}
		}
		
		return op;
	}
	
}
