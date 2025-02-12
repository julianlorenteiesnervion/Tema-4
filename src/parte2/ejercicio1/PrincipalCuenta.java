package parte2.ejercicio1;

public class PrincipalCuenta {

	public static void main(String[] args) {
		/**
		 * Creamos la cuenta
		 */
		CuentaCorriente cuenta;
		cuenta = new CuentaCorriente("12345678Z", "Julián", 100, "ESPAÑOL");
		
		/**
		 * Creamos otra cuenta para hacer un equals
		 */
		CuentaCorriente cuenta2;
		cuenta2 = new CuentaCorriente("87654321A", "José", 3, "EXTRANJERO");

		// Imprimimos la información de la cuenta
		System.out.println(cuenta);
		
		// Nos debería dejar sacar este dinero
		System.out.println(cuenta.sacarDinero(50));
		
		// Pero este no
		System.out.println(cuenta.sacarDinero(100));
		
		System.out.println(cuenta);
		
		// No nos deja ingresar 0€
		System.out.println(cuenta.ingresarDinero(0));
		
		// Pero sí nos deja 20 €
		System.out.println(cuenta.ingresarDinero(20));
		
		System.out.println(cuenta);
		
		// Devuelve true
		System.out.println(cuenta.equals(cuenta));
		
		// Devuelve false
		System.out.println(cuenta.equals(cuenta2));
	}

}
