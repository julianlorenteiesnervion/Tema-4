package parte2.ejercicio3;

public class Alumno {
	private String nombre;
	private double notaMedia;
	
	/**
	 * Constructor del alumno
	 * @param nombre Nombre del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		setNombre(nombre);
		setNotaMedia(notaMedia);
	}
	
	/**
	 * Set del nombre del alumno
	 * @param nombre Nombre del alumno
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Get del nombre del alumno
	 * @return Devuelve el nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set de la nota media del alumno
	 * @param notaMedia Nota media del alumno
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	
	/**
	 * Get de la nota media del alumno
	 * @return Devuelve la nota media del alumno
	 */
	public double getNotaMedia() {
		return notaMedia;
	}
	
	// Devuelve el nombre del alumno con su nota media
	@Override
	public String toString() {
		return nombre + " " + notaMedia;
	}
	
	/**
	 * @return Devuelve true si los nombres de los alumnos son iguales o false si son distintos
	 */
	@Override
	public boolean equals(Object nombre2) {
		boolean same = false;
		
		if (nombre == nombre2) {
			same = true;
		}
		
		return same;
	}
}
