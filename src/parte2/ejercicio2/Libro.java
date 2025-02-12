package parte2.ejercicio2;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;

	enum Generos {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO
	}

	private Generos genero;

	/**
	 * 
	 * @param titulo
	 * @param autor
	 */
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank())
			this.titulo = titulo;

		if (autor != null && !autor.isBlank())
			this.autor = autor;
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank())
			this.titulo = titulo;

		if (autor != null && !autor.isBlank())
			this.autor = autor;

		if (ejemplares != 0)
			this.ejemplares = ejemplares;
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && titulo.isBlank())
			this.titulo = titulo;
		
		if (autor != null && autor.isBlank())
			this.autor = autor;
		
		if (ejemplares != 0)
			this.ejemplares = ejemplares;
		
//		switch (genero.toUpperCase()) {
//		case "NARRATIVO" -> this.genero = Generos.NARRATIVO;
//		case "LÍRICO" -> this.genero = Generos.LÍRICO;
//		case "DRAMÁTICO" -> this.genero = Generos.DRAMÁTICO;
//		case "DIDÁCTICO" -> this.genero = Generos.DIDÁCTICO;
//		case "POÉTICO" -> this.genero = Generos.POÉTICO;
//		}
		
		this.genero = switch (genero.toUpperCase()) {
		case "NARRATIVO" -> {yield Generos.NARRATIVO;}
		case "LÍRICO" -> {yield Generos.LÍRICO;}
		case "DRAMÁTICO" -> {yield Generos.DRAMÁTICO;}
		case "DIDÁCTICO" -> {yield Generos.DIDÁCTICO;}
		case "POÉTICO" -> {yield Generos.POÉTICO;}
		default -> {yield Generos.NARRATIVO;}
		};
	}

}
