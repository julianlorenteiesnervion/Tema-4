package parte2.ejercicio1;

public class CuentaCorriente {
	String dni;
	String nombre;
	double saldo;
	enum nacionalidad {ESPAÑOLA, EXTRANJERA};
	nacionalidad nacionalidad;
	
	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}
	
	public CuentaCorriente(String dni, String nombre, double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public CuentaCorriente(String dni, String nombre, double saldo, nacionalidad nacionalidad) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}
}
