package parte1.ejercicio3.D;

/**
 * Clase que representa un rectángulo mediante sus coordenadas.
 * 
 * Un rectángulo se define por las coordenadas de sus dos vértices 
 * opuestos (x1, y1) y (x2, y2). Esta clase permite acceder y modificar
 * dichas coordenadas, así como representarlas como una cadena de texto.
 */
public class Rectangulo {
    int x1;
    int x2;
    int y1;
    int y2;

    /**
     * Constructor de la clase Rectangulo.
     * 
     * Inicializa un rectángulo con las coordenadas de sus dos vértices
     * opuestos.
     * 
     * @param x1 Coordenada x del primer vértice.
     * @param x2 Coordenada x del segundo vértice.
     * @param y1 Coordenada y del primer vértice.
     * @param y2 Coordenada y del segundo vértice.
     */
    public Rectangulo(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Obtiene la coordenada x del primer vértice.
     * 
     * @return Coordenada x del primer vértice.
     */
    public int getX1() {
        return x1;
    }

    /**
     * Establece la coordenada x del primer vértice.
     * 
     * @param x1 Nueva coordenada x del primer vértice.
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * Obtiene la coordenada x del segundo vértice.
     * 
     * @return Coordenada x del segundo vértice.
     */
    public int getX2() {
        return x2;
    }

    /**
     * Establece la coordenada x del segundo vértice.
     * 
     * @param x2 Nueva coordenada x del segundo vértice.
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Obtiene la coordenada y del primer vértice.
     * 
     * @return Coordenada y del primer vértice.
     */
    public int getY1() {
        return y1;
    }

    /**
     * Establece la coordenada y del primer vértice.
     * 
     * @param y1 Nueva coordenada y del primer vértice.
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * Obtiene la coordenada y del segundo vértice.
     * 
     * @return Coordenada y del segundo vértice.
     */
    public int getY2() {
        return y2;
    }

    /**
     * Establece la coordenada y del segundo vértice.
     * 
     * @param y2 Nueva coordenada y del segundo vértice.
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Establece las coordenadas del primer vértice.
     * 
     * @param x1 Nueva coordenada x del primer vértice.
     * @param y1 Nueva coordenada y del primer vértice.
     */
    public void setX1Y1(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    /**
     * Establece las coordenadas del segundo vértice.
     * 
     * @param x2 Nueva coordenada x del segundo vértice.
     * @param y2 Nueva coordenada y del segundo vértice.
     */
    public void setX2Y2(int x2, int y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Establece todas las coordenadas de los vértices del rectángulo.
     * 
     * @param x1 Coordenada x del primer vértice.
     * @param y1 Coordenada y del primer vértice.
     * @param x2 Coordenada x del segundo vértice.
     * @param y2 Coordenada y del segundo vértice.
     */
    public void setAll(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Devuelve una representación en cadena de texto del rectángulo.
     * 
     * @return Una cadena que representa las coordenadas de los dos vértices.
     */
    public String toString() {
        return x1 + "," + y1 + "\n" + x2 + "," + y2;
    }
}
