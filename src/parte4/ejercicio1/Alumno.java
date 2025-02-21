package parte4.ejercicio1;

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
}