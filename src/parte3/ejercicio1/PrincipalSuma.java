package parte3.ejercicio1;

public class PrincipalSuma {

	public static void main(String[] args) {
		Suma suma1 = new Suma();
		
		System.out.println(suma1.suma(1, 2)); // Suma de enteros
		
		System.out.println(suma1.suma(1.5, 2.3)); // Suma de doubles
	}

}
