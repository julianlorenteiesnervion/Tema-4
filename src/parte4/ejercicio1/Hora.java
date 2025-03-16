package parte4.ejercicio1;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Constructor que inicializa la hora, los minutos y los segundos.
     * Si los valores están fuera de rango, se inicializan a 0
     * @param hora La hora en formato 24 horas (0-23).
     * @param minuto Los minutos (0-59).
     * @param segundo Los segundos (0-59).
     */
    public Hora(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            this.hora = 0;  // Valor por defecto si está fuera de rango
        }
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;  // Valor por defecto si está fuera de rango
        }
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;  // Valor por defecto si está fuera de rango
        }
    }

    /**
     * Obtiene la hora actual.
     * @return La hora (0-23).
     */
    public int getHora() {
        return hora;
    }

    /**
     * Establece una nueva hora, si está dentro del rango permitido (0-23).
     * @param hora La nueva hora.
     */
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    /**
     * Obtiene el valor actual de los minutos.
     * @return Los minutos (0-59).
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Establece un nuevo valor de minutos, si está dentro del rango permitido (0-59).
     * @param minuto Los nuevos minutos.
     */
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    /**
     * Obtiene el valor actual de los segundos.
     * @return Los segundos (0-59).
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Establece un nuevo valor de segundos, si está dentro del rango permitido (0-59).
     * @param segundo Los nuevos segundos.
     */
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public void incrementarSegundo() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }

    /**
     * Muestra la hora actual en formato HH:MM:SS utilizando concatenación de strings.
     * @return La hora formateada como un string "HH:MM:SS".
     */
    @Override
    public String toString() {
        return (hora < 10 ? "0" : "") + hora + ":" +
                                (minuto < 10 ? "0" : "") + minuto + ":" +
                                (segundo < 10 ? "0" : "") + segundo;
    }
}
