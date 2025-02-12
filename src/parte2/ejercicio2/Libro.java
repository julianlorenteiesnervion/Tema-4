package parte2.ejercicio2;

public class Libro {
	// Título del libro
	private String titulo;
	
	// Nombre del autor
	private String autor;
	
	// Cantidad de ejemplares de los que disponemos
	private int ejemplares;
	
	// Cantidad de ejemplares prestados
	private int prestados;

	// Lista con los posibles géneros
	enum Generos {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO
	}

	// Género del libro
	private Generos genero;

	/**
	 * Constructor titulo y autor
	 * @param titulo Guardar el título del libro
	 * @param autor Guardar el nombre del autor del libro
	 */
	public Libro(String titulo, String autor) {
		setTitulo(titulo);
		setAutor(autor);
	}

	/**
	 * Constructor titulo, autor, ejemplares y prestados
	 * @param titulo Guardar el título del libro
	 * @param autor Guardar el nombre del autor del libro
	 * @param ejemplares Guardar la cantidad de ejemplares
	 * @param prestados Guardar la cantidad de ejemplares prestados
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
	}

	/**
	 * Constructor titulo, autor, ejemplares, prestados y género
	 * @param titulo Guardar el título del libro
	 * @param autor Guardar el nombre del autor del libro
	 * @param ejemplares Guardar la cantidad de ejemplares
	 * @param prestados Guardar la cantidad de ejemplares prestados
	 * @param genero Guardar el género del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		setTitulo(titulo);
		setAutor(autor);
		setEjemplares(ejemplares);
		setPrestados(prestados);
		setGenero(genero);
	}
	
	// Getters y setters
	// Título
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank())
			this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	// Autor
	public void setAutor(String autor) {
		if (autor != null && !autor.isBlank())
			this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	// Ejemplares
	public int getEjemplares() {
		return ejemplares;
	}
	
	public void setEjemplares(int ejemplares) {
		if (ejemplares > 0 && ejemplares >= this.prestados)
			this.ejemplares = ejemplares;
	}
	
	// Prestados
	public int getPrestados() {
		return prestados;
	}
		
	public void setPrestados(int prestados) {
		if (prestados > 0 && prestados <= (ejemplares - this.prestados))
			this.prestados = prestados;
	}
	
	// Género
	public Generos getGenero() {
		return genero;
	}
	
	// Podemos hacerlo con este switch o bien con el otro
//	switch (genero.toUpperCase()) {
//	case "NARRATIVO" -> this.genero = Generos.NARRATIVO;
//	case "LÍRICO" -> this.genero = Generos.LÍRICO;
//	case "DRAMÁTICO" -> this.genero = Generos.DRAMÁTICO;
//	case "DIDÁCTICO" -> this.genero = Generos.DIDÁCTICO;
//	case "POÉTICO" -> this.genero = Generos.POÉTICO;
//	}
	public void setGenero(String genero) {
		this.genero = switch (genero.toUpperCase()) {
		case "NARRATIVO" -> {yield Generos.NARRATIVO;}
		case "LÍRICO" -> {yield Generos.LÍRICO;}
		case "DRAMÁTICO" -> {yield Generos.DRAMÁTICO;}
		case "DIDÁCTICO" -> {yield Generos.DIDÁCTICO;}
		case "POÉTICO" -> {yield Generos.POÉTICO;}
		default -> {yield Generos.NARRATIVO;}
		};
	}
	
	// Métodos
	/**
	 * Realizar un préstamo
	 * @return Devuelve true si se ha podido realizar el préstamo y false en caso contrario
	 */
	public boolean prestamo() {
		boolean given = false;
		
		if (ejemplares > prestados) {
			given = true;
			prestados++;
		}
		
		return given;
	}
	
	/**
	 * Realizar una devolución
	 * @return Devuelve true si se ha podido realizar la operación y false en caso contrario
	 */
	public boolean devolucion() {
		boolean returned = false;
		
		if (prestados > 0) {
			returned = true;
			prestados--;
		}
		
		return returned;
	}
	
	@Override
	public String toString() {
		return "Título: " + titulo +
				"\nAutor: " + autor +
				"\nEjemplares: " + ejemplares +
				"\nPrestados: " + prestados +
				"\nGénero: " + genero;
	}

}
