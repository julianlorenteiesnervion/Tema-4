/**
 * Clase principal que contiene el método main para probar la clase Coordenadas.
 */
package parte1.ejercicio1.C;

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
		
		// Imprimir las coordenadas iniciales de cada punto usando los métodos getters
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
		
		// Modificación de las coordenadas de los puntos usando los métodos setters y getters
		punto1.setX(punto1.getX() + punto3.getY());
		punto1.setY(punto1.getY() + punto1.getX());
		
		punto2.setX(punto2.getX() - punto3.getX());
		punto2.setY(punto2.getY() / punto2.getX());
		
		punto3.setX(punto3.getX() * punto2.getX());
		punto3.setY(punto3.getY() + 1);
		
		// Imprimir las coordenadas después de las modificaciones
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
	}
}
