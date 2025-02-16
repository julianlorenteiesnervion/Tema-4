package parte3.ejercicio4;

public class PrincipalBoolean {

	public static void main(String[] args) {
		Boolean boolean1 = new Boolean();
		
		System.out.println(boolean1.parseToBoolean(0));
		System.out.println(boolean1.parseToBoolean(1));
		System.out.println(boolean1.parseToBoolean(2));
		
		System.out.println(); // Salto de línea
		
		System.out.println(boolean1.parseToBoolean("false"));
		System.out.println(boolean1.parseToBoolean("true"));
		System.out.println(boolean1.parseToBoolean("pepe"));
	}

}
