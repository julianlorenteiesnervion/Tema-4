package parte1.ejercicio2.D;

public class Persona {
	private int dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean esMayorEdad() {
		if (edad >= 18)
			return true;
		else
			return false;
	}
	
	public boolean esJubilado() {
		if (edad >= 65)
			return true;
		else
			return false;
	}
	
	public int diferenciaEdad(Persona p) {
		return Math.abs(this.edad - p.edad);
	}
	
	public String toString() {
		return "DNI: " + dni +
				"\nNombre: " + nombre +
				"\nApellidos: " + apellidos +
				"\nEdad: " + edad;
	}
}