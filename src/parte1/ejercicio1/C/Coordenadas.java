/**
 * Clase que representa un punto en un plano 2D con coordenadas x e y.
 * Las coordenadas están encapsuladas y se acceden a través de métodos getters y setters.
 */
package parte1.ejercicio1.C;

public class Coordenadas {
	/**
	 * Coordenada x del punto.
	 */
	private int x;

	/**
	 * Coordenada y del punto.
	 */
	private int y;
	
	/**
	 * Constructor que inicializa las coordenadas x e y del punto.
	 * 
	 * @param x Coordenada x del punto.
	 * @param y Coordenada y del punto.
	 */
	public Coordenadas (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Obtiene el valor de la coordenada x.
	 * 
	 * @return El valor actual de x.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Establece el valor de la coordenada x.
	 * 
	 * @param x El nuevo valor de x.
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Obtiene el valor de la coordenada y.
	 * 
	 * @return El valor actual de y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Establece el valor de la coordenada y.
	 * 
	 * @param y El nuevo valor de y.
	 */
	public void setY(int y) {
		this.y = y;
	}
}
