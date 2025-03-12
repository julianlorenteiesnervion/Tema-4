package examenRepaso;

import java.util.Objects;

public class Empleado {
	
	private String dni;
	private String nombre;
	private int sueldoBase;
	private int horasExtra;
	private static int importeExtra;
	
	/**
	 * @param dni
	 * @param nombre
	 * @param sueldoBase
	 * @param horasExtra
	 */
	public Empleado(String dni, String nombre, int sueldoBase, int horasExtra) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtra = horasExtra;
	}
	
	// Constructor para la actualización de datos
	public Empleado(String dni) {
		this.dni = dni;
	}

	/**
	 * @return Devuelve las horas extra
	 */
	public int getHorasExtra() {
		return horasExtra;
	}

	/**
	 * @param horasExtra Setter de las horas extra
	 */
	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	/**
	 * @return Devuelve el importe extra
	 */
	public int getImporteExtra() {
		return importeExtra;
	}

	/**
	 * @param importeExtra Setter del importe extra
	 */
	public static void setImporteExtra(int importeExtra) {
		Empleado.importeExtra = importeExtra;
	}

	/**
	 * @return Devuelve el dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return Devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @return Devuelve el resultado de multiplicar el número de horas extras por el importe de la hora extra
	 */
	public int calcularComplemento() {
		return horasExtra * importeExtra;
	}
	
	/**
	 * @return Devuelve el sueldo bruto (el sueldo bruto es igual al sueldo base más el complemento por horas extra)
	 */
	public int sueldoBruto() {
		return sueldoBase + calcularComplemento();
	}

	@Override
	public String toString() {
		return dni + " " + nombre + "\nHoras Extras: " + horasExtra + "\nSueldo bruto: " + sueldoBruto();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		Empleado other = (Empleado) obj;
		return other.dni.equals(this.dni);
	}

}
