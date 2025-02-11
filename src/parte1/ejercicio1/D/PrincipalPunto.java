/**
 * Clase principal que contiene el método main para probar la clase Punto.
 */
package parte1.ejercicio1.D;

public class PrincipalPunto {

	/**
	 * Método principal que crea tres objetos de la clase Punto, los desplaza y calcula la distancia entre ellos.
	 * 
	 * @param args Argumentos pasados por línea de comandos (no se utilizan en este caso).
	 */
	public static void main(String[] args) {
		// Creación de tres objetos Punto con valores iniciales
		Punto punto1 = new Punto(5, 0);
		Punto punto2 = new Punto(10, 10);
		Punto punto3 = new Punto(-3, 7);

		// Imprimir los puntos usando el método toString
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(punto3);
		
		// Desplazar los puntos
		punto1.desplaza(3, 2);
		punto2.desplaza(-3, 7);
		punto3.desplaza(8, 1);
		
		// Imprimir los puntos después del desplazamiento
		System.out.println(punto1);
		System.out.println(punto2);
		System.out.println(punto3);
		
		// Calcular la distancia entre el punto1 y el punto3
		System.out.println(punto1.distancia(punto3));
	}
}
