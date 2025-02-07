package parte1.ejercicio1.D;

public class PrincipalPunto {

	public static void main(String[] args) {
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);

		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(punto3);
		
		// Desplazamiento
		punto1.desplaza(3, 2);
		punto2.desplaza(-3, 7);
		punto3.desplaza(8, 1);
		
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(punto3);
		
		// Distancia
		System.out.println(punto1.distancia(punto3));
		
	}

}
