package parte4.ejercicio1;

import java.util.Objects;

public class Alumno {
	private String nombre;
	private double media;
	
	public Alumno(String nombre, double media) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}
	
	public Alumno(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
}