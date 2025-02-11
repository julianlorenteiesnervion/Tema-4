/**
 * Clase principal que contiene el método main para probar la clase Coordenadas.
 */
package parte1.ejercicio1.OOP;

public class PrincipalPunto {

	/**
	 * Método principal que crea tres objetos de la clase Coordenadas y realiza 
	 * varias operaciones sobre ellos.
	 * 
	 * @param args Argumentos pasados por línea de comandos (no se utilizan en este caso).
	 */
	public static void main(String[] args) {
		// Creación de tres objetos Coordenadas con valores iniciales
		Coordenadas punto1 = new Coordenadas(5, 0);
		Coordenadas punto2 = new Coordenadas(10, 10);
		Coordenadas punto3 = new Coordenadas(-3, 7);
		
		// Imprimir las coordenadas iniciales de cada punto
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
		
		// Modificación de las coordenadas de los puntos
		punto1.x += punto3.y;
		punto1.y += punto1.x;
		
		punto2.x -= punto3.x;
		punto2.y /= punto2.x;
		
		punto3.x *= punto2.x;
		punto3.y++;
		
		// Imprimir las coordenadas después de las modificaciones
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
	}
}
