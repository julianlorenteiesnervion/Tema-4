package crud.ejercicio4;

public class Disco {
	private final int codigo;
	private String autor;
	private String titulo;
	private int duracion;
	
	enum Genero {
		ROCK, POP, JAZZ, BLUES
	}
	
	private Genero genero;

	/**
	 * @param codigo Código único del disco
	 * @param autor Autor del disco
	 * @param titulo Título del disco
	 * @param duracion Duración del disco
	 * @param genero Género del disco
	 */
	public Disco(int codigo, String autor, String titulo, int duracion, String genero) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.duracion = duracion;
		
		switch (genero.toUpperCase()) {
		case "ROCK" -> this.genero = Genero.ROCK;
		case "POP" -> this.genero = Genero.POP;
		case "JAZZ" -> this.genero = Genero.JAZZ;
		case "BLUES" -> this.genero = Genero.BLUES;
		default -> this.genero = Genero.POP;
		}
	}
	
	/**
	 * Constructor para el delete
	 * @param codigo
	 */
	public Disco(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return Devuelve el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @return Devuelve el titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return Devuelve la duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @return Devuelve el genero
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * 
	 * @return Devuelve el código
	 */
	public int getCodigo() {
		return codigo;
	}

	@Override
	public boolean equals(Object obj) {
		Disco other = (Disco) obj;
		
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + "\nautor: " + autor + "\ntitulo: " + titulo + "\nduracion: " + duracion
				+ "\ngenero: " + genero;
	}
}
