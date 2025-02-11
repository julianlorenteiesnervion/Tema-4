/**
 * Clase que representa un punto en un plano 2D con coordenadas x e y.
 * Permite el desplazamiento del punto y calcular la distancia entre puntos.
 */
package parte1.ejercicio1.D;

public class Punto {
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
	public Punto (int x, int y) {
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
	
	/**
	 * Establece los valores de las coordenadas x e y del punto.
	 * 
	 * @param x El nuevo valor de x.
	 * @param y El nuevo valor de y.
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Desplaza el punto en el plano sumando un valor a las coordenadas x e y.
	 * 
	 * @param dx Valor a sumar a la coordenada x.
	 * @param dy Valor a sumar a la coordenada y.
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Calcula la distancia euclidiana entre el punto actual y otro punto dado.
	 * 
	 * @param p El punto con el cual calcular la distancia.
	 * @return La distancia entre los dos puntos.
	 */
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
	}
	
	/**
	 * Devuelve una representación en cadena de texto del punto en formato (x, y).
	 * 
	 * @return Una cadena de texto que representa el punto.
	 */
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
}
