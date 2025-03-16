package parte4.ejercicio2;

public class Contador {
	private int cont;

    /**
     * @param cont El valor inicial del contador.
     */
    public Contador(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        } else {
            this.cont = 0;  // Valor por defecto si el valor es negativo
        }
    }

    /**
     * @return El valor actual del contador.
     */
    public int getCont() {
        return cont;
    }

    /**
     * Si el valor es negativo, se establece en 0.
     * @param cont El nuevo valor para el contador.
     */
    public void setCont(int cont) {
        if (cont >= 0) {
            this.cont = cont;
        } else {
            this.cont = 0;  // No se permiten valores negativos
        }
    }

    /**
     * Incrementa el contador en uno
     */
    public void incrementar() {
        cont++;
    }

    /**
     * Decrementa el contador en uno.
     * Si el valor que queda es negativo, el contador se establece en 0.
     */
    public void decrementar() {
        if (cont > 0) {
            cont--;
        } else {
            cont = 0;
        }
    }

	@Override
	public String toString() {
		return "Contador " + cont;
	}
}
