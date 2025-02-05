package parte1.ejercicio4.OOP;

public class Articulo {
	String nombre;
	double precio;
	double IVA = 1.21;
	int cuantosQuedan;
	
	public Articulo(String nombre, double precio, double IVA, int cuantosQuedan) {
		this.nombre = nombre;
		this.precio = precio;
		this.IVA = IVA;
		this.cuantosQuedan = cuantosQuedan;
	}
}
