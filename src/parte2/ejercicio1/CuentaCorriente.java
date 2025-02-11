package parte2.ejercicio1;

public class CuentaCorriente {
	private String dni;
	private String nombre;
	private double saldo;

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	};

	Nacionalidad nacionalidad;

	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.isBlank() && dni.length() == 9)
			this.dni = dni;

		if (saldo > 0)
			this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		if (dni != null && !dni.isBlank() && dni.length() == 9)
			this.dni = dni;

		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;

		if (saldo > 0)
			this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
		if (dni != null && !dni.isBlank() && dni.length() == 9)
			this.dni = dni;

		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;

		if (saldo > 0)
			this.saldo = saldo;

		
		switch(nacionalidad.toUpperCase()) {
		case "ESPAÑOLA" -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		case "EXTRANJERA" -> this.nacionalidad = Nacionalidad.EXTRANJERA;
		default -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
		}
	}

	public boolean sacarDinero(double dinero) {
		boolean retired = false;
		
		if (((saldo - dinero) > 0) && dinero > 0) {
			saldo -= dinero;
			retired = true;
		}
		
		return retired;
	}
	
	public boolean ingresarDiner(double dinero) {
		boolean incremented = false;
		
		if (dinero > 0) {
			saldo += dinero;
			incremented = true;
		}
		
		return incremented;
	}
}
