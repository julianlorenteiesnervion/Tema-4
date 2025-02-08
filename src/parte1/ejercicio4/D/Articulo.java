package parte1.ejercicio4.D;

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
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getIVA() {
		return IVA;
	}
	
	public void setIVA(double IVA) {
		this.IVA = IVA;
	}
	
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}
	
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}
	
	public double getPVP() {
		return precio * IVA;
	}
	
	public double getPVPDescuento(int descuento) {
		return getPVP() - (getPVP() * (descuento * 0.01));
	}
	
	public String toString() {
		return "Artículo: " + nombre + "\n"
				+ "Precio: " + precio + "\n"
				+ "IVA: " + IVA + "\n"
				+ "PVP: " + getPVP() + "\n";
	}
}
