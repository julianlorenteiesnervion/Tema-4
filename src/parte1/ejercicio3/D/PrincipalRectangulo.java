package parte1.ejercicio3.D;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Esta clase crea instancias de la clase {@link Rectangulo} y muestra 
 * las coordenadas de los rectángulos antes y después de modificarlas.
 */
public class PrincipalRectangulo {

    /**
     * Método principal para ejecutar el programa.
     * 
     * Este método crea dos instancias de {@link Rectangulo}, 
     * luego establece las coordenadas de cada rectángulo y las imprime
     * en la consola antes y después de realizar modificaciones en sus
     * posiciones.
     * 
     * @param args Parámetros de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Rectangulo rec1;
        
        // Crear un rectángulo con las coordenadas iniciales (0, 5, 0, 5)
        rec1 = new Rectangulo(0, 5, 0, 5);
        
        // Modificar las coordenadas del rectángulo
        rec1.setX1Y1(0, 0);
        rec1.setX2Y2(5, 5);
        
        // Imprimir las coordenadas del rectángulo
        System.out.println(rec1);
        
        // Establecer nuevas coordenadas para el rectángulo
        rec1.setAll(1, 1, 7, 6);
        
        // Imprimir las nuevas coordenadas del rectángulo
        System.out.println(rec1);
    }
}
