package crud.ejercicio2;

import java.util.Objects;

/**
 * Clase que representa un artículo con información sobre su nombre, precio,
 * IVA y cantidad disponible.
 * 
 * Además, permite calcular el precio con IVA y el precio con descuento.
 */
public class Articulo {
    String nombre;
    double precio;
    double iva = 1.21; // IVA predeterminado
    int cuantosQuedan;

    /**
     * Constructor de la clase Articulo.
     * 
     * Inicializa un artículo con un nombre, precio, IVA y cantidad disponible.
     * 
     * @param nombre Nombre del artículo.
     * @param precio Precio base del artículo sin IVA.
     * @param iva Valor del IVA (por ejemplo, 1.21 para un IVA del 21%).
     * @param cuantosQuedan Cantidad disponible del artículo en stock.
     */
    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }
    
    /**
     * Constructor para poder eliminar artículos con el crud
     * @param nombre Nombre del artículo.
     */
    public Articulo(String nombre) {
    	this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del artículo.
     * 
     * @return El nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del artículo.
     * 
     * @param nombre El nuevo nombre del artículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio base del artículo.
     * 
     * @return El precio base del artículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio base del artículo.
     * 
     * @param precio El nuevo precio base del artículo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el valor del IVA aplicado al artículo.
     * 
     * @return El valor del IVA (por ejemplo, 1.21 para un IVA del 21%).
     */
    public double getIVA() {
        return iva;
    }

    /**
     * Establece el valor del IVA para el artículo.
     * 
     * @param iva El nuevo valor del IVA.
     */
    public void setIVA(double iva) {
        this.iva = iva;
    }

    /**
     * Obtiene la cantidad de unidades del artículo disponibles en stock.
     * 
     * @return La cantidad de unidades disponibles.
     */
    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    /**
     * Establece la cantidad de unidades disponibles del artículo.
     * 
     * @param cuantosQuedan La cantidad de unidades disponibles.
     */
    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    /**
     * Calcula el precio del artículo con IVA.
     * 
     * @return El precio del artículo incluyendo el IVA.
     */
    public double getPVP() {
        return precio * iva;
    }

    /**
     * Calcula el precio del artículo con un descuento aplicado.
     * 
     * @param descuento El porcentaje de descuento (por ejemplo, 20 para un 20% de descuento).
     * @return El precio con descuento.
     */
    public double getPVPDescuento(int descuento) {
        return getPVP() - (getPVP() * (descuento * 0.01));
    }

    /**
     * Devuelve una representación en cadena de texto del artículo.
     * 
     * @return Una cadena con el nombre, precio base, IVA y precio con IVA del artículo.
     */
    @Override
    public String toString() {
        return "Artículo: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Stock: " + cuantosQuedan + "\n"
                + "IVA: " + iva + "\n"
                + "PVP: " + getPVP() + "\n";
    }
}
