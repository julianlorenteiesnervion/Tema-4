package crud.ejercicio5;

import java.util.*;

public class Crud {
	
	private static Set<CuentaCorriente> cuentas = new HashSet<>();
	
	/**
     * Crea una nueva cuenta corriente y la añade al conjunto.
     * 
     * @param cuenta La cuenta corriente que se va a añadir.
     * @return true si la cuenta fue añadida exitosamente, false si ya existía.
     */
    public static boolean create(CuentaCorriente cuenta) {
        return cuentas.add(cuenta);
    }
    
    public static void read() {
    	for (CuentaCorriente cuenta : cuentas) {
    		System.out.println(cuenta);
    	}
    }
    
    public static void ingreso(CuentaCorriente cuenta, int dinero) {
    	for (CuentaCorriente cuentaLista : cuentas ) {
    		if (cuentaLista.equals(cuenta)) {
    			cuentaLista.ingresarDinero(dinero);
    		}
    	}
    }
    
    public static void retiro(CuentaCorriente cuenta, int dinero) {
    	for (CuentaCorriente cuentaLista : cuentas ) {
    		if (cuentaLista.equals(cuenta)) {
    			cuentaLista.sacarDinero(dinero);
    		}
    	}
    }
    
    public static boolean delete(CuentaCorriente cuenta) {
    	return cuentas.remove(cuenta);
    }
    
}
