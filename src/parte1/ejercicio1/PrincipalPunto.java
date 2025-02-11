/**
 * Clase principal que contiene el método main para probar la clase Punto.
 */
package parte1.ejercicio1;

public class PrincipalPunto {

	/**
	 * Método principal que crea tres objetos de la clase Punto y realiza 
	 * varias operaciones sobre ellos.
	 * 
	 * @param args Argumentos pasados por línea de comandos (no se utilizan en este caso).
	 */
	public static void main(String[] args) {
		// Creación de tres objetos Punto
		Punto punto1 = new Punto();
		Punto punto2 = new Punto();
		Punto punto3 = new Punto();

		// Asignación de coordenadas a los puntos
		punto1.x = 5;
		punto1.y = 0;
		
		punto2.x = 10;
		punto2.y = 10;
		
		punto3.x = -3;
		punto3.y = 7;
		
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
