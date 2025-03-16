package parte4.ejercicio3;

public class Fecha {
	private int dia;
    private int mes;
    private int año;

    /**
     * Constructor que inicializa la fecha con los valores de día, mes y año.
     * @param dia El día de la fecha.
     * @param mes El mes de la fecha.
     * @param año El año de la fecha.
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    /**
     * @return El día de la fecha.
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia El nuevo valor para el día.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return El mes de la fecha.
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes El nuevo valor para el mes.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtiene el año actual.
     * @return El año de la fecha.
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año El nuevo valor para el año.
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Verifica si el año es bisiesto
     * @return true si el año es bisiesto, false en caso contrario.
     */
    public boolean esBisiesto() {
        boolean bisiesto = false;
        if (año % 4 == 0) {
            if (año % 100 != 0 || año % 400 == 0) {
                bisiesto = true;
            }
        }
        return bisiesto;
    }

    /**
     * Verifica si la fecha es correcta.
     * @return true si la fecha es válida, false si no lo es.
     */
    public boolean fechaCorrecta() {
        boolean fechaValida = false;
        if (mes >= 1 && mes <= 12) {
            if (dia >= 1) {
                if (mes == 2) {
                    if (esBisiesto() && dia <= 29) {
                        fechaValida = true;
                    } else if (!esBisiesto() && dia <= 28) {
                        fechaValida = true;
                    }
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) {
                    fechaValida = true;
                } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia <= 31) {
                    fechaValida = true;
                }
            }
        }
        return fechaValida;
    }

    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
    }

    /**
     * @return La fecha en el formato "dd-mm-aaaa"
     */
    @Override
    public String toString() {
        return ((dia < 10 ? "0" : "") + dia) + "-" + ((mes < 10 ? "0" : "") + mes) + "-" + año;
    }
}
