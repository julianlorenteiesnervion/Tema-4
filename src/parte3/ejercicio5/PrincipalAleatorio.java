package parte3.ejercicio5;

public class PrincipalAleatorio {

	public static void main(String[] args) {
		Aleatorio aleatorio = new Aleatorio();
		
		System.out.println("Binario");
		aleatorio.numerosAleatorios(3);
		
		System.out.println("Aleatorios max");
		aleatorio.numerosAleatorios(5, 10);
		
		System.out.println("Aleatorios min max");
		aleatorio.numerosAleatorios(5, 10, 20);
	}

}
