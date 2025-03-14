package crud.ejercicio3;

public class Pizza {
	// Código del pedido
	private final int codigo;
	
	// Tamaño de la pizza
	enum Tamano {
		MEDIANA, FAMILIAR;
	}
	private Tamano tamano;
	
	// Tipo de la pizza
	enum Tipo {
		MARGARITA, CUATROQUESOS, FUNGHI;
	}
	private Tipo tipo;
	
	// Estado de la pizza
	enum Estado {
		PEDIDA, SERVIDA;
	}
	private Estado estado;
	
	// Constructor de la pizza
	public Pizza(int codigo, String tamano, String tipo) {
		this.codigo = codigo;
		
		switch (tamano) {
		case "MEDIANA", "FAMILIAR" -> {
			this.tamano = Tamano.valueOf(tamano.toUpperCase());
		}
		default -> this.tamano = Tamano.MEDIANA;
		}
		
		switch (tipo) {
		case "MARGARITA", "CUATROQUESOS", "FUNGHI" -> {
			this.tipo = Tipo.valueOf(tipo.toUpperCase());
		}
		default -> this.tipo = Tipo.MARGARITA;
		}
		
		// Al crearla, su estado será "Pedida"
		estado = Estado.PEDIDA;
	}
	
	// Setters
	public void setEstado(String estado) {
		if (estado.equalsIgnoreCase("SERVIDA")) {
			this.estado = Estado.SERVIDA;
		}
	}
	
	// Getters (no usaré más setters ya que una pizza no se puede modificar, sólo modificaremos su estado)
	public Tamano getTamano() {
		return tamano;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public String toString() {
		return codigo + ": " + tamano + " - " + tipo + " - " + estado;
	}
}
