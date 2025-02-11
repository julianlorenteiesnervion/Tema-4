package parte1.ejercicio4.D;

/**
 * Clase principal que contiene el método `main` para ejecutar el programa.
 * Esta clase crea una instancia de la clase {@link Articulo}, establece sus
 * valores y muestra información sobre el artículo, incluido el precio con descuento.
 */
public class PrincipalArticulo {

    /**
     * Método principal para ejecutar el programa.
     * 
     * Este método crea una instancia de {@link Articulo}, luego establece
     * sus propiedades y calcula el precio con descuento, mostrando toda la
     * información en la consola.
     * 
     * @param args Parámetros de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Articulo articulo;
        
        // Crear un artículo con los valores iniciales
        articulo = new Articulo("Vaso", 2, 1.21, 7);
        
        // Modificar las propiedades del artículo
        articulo.setNombre("Mesa");
        articulo.setPrecio(20);
        articulo.setCuantosQuedan(30);
        
        // Imprimir los detalles del artículo
        System.out.println(articulo);
        
        // Calcular y mostrar el precio con descuento del artículo
        System.out.println("Descuento: " + articulo.getPVPDescuento(20));
    }
}
