package parte2.ejercicio1;

/**
 * Representa una cuenta corriente con un DNI, nombre, saldo y nacionalidad.
 * Permite realizar operaciones de ingreso y retiro de dinero.
 */
public class CuentaCorriente {
    private String dni;
    private String nombre;
    private double saldo;

    /**
     * Enum que representa las nacionalidades posibles de una cuenta.
     */
    enum Nacionalidad {
        ESPAÑOLA, EXTRANJERA
    }

    // Nacionalidad de la cuenta
    Nacionalidad nacionalidad;

    /**
     * Constructor que inicializa una cuenta corriente con un DNI y un saldo.
     * 
     * @param dni El DNI del titular de la cuenta. Debe ser una cadena no vacía de 9 caracteres.
     * @param saldo El saldo inicial de la cuenta, debe ser mayor a cero.
     */
    public CuentaCorriente(String dni, double saldo) {
        if (dni != null && !dni.isBlank() && dni.length() == 9)
            this.dni = dni;

        if (saldo > 0)
            this.saldo = saldo;
    }

    /**
     * Constructor que inicializa una cuenta corriente con un DNI, nombre y saldo.
     * 
     * @param dni El DNI del titular de la cuenta. Debe ser una cadena no vacía de 9 caracteres.
     * @param nombre El nombre del titular de la cuenta. Debe ser una cadena no vacía.
     * @param saldo El saldo inicial de la cuenta, debe ser mayor a cero.
     */
    public CuentaCorriente(String dni, String nombre, double saldo) {
        if (dni != null && !dni.isBlank() && dni.length() == 9)
            this.dni = dni;

        if (nombre != null && !nombre.isBlank())
            this.nombre = nombre;

        if (saldo > 0)
            this.saldo = saldo;
    }

    /**
     * Constructor que inicializa una cuenta corriente con un DNI, nombre, saldo y nacionalidad.
     * La nacionalidad puede ser "ESPAÑOLA" o "EXTRANJERA", y por defecto será "ESPAÑOLA".
     * 
     * @param dni El DNI del titular de la cuenta. Debe ser una cadena no vacía de 9 caracteres.
     * @param nombre El nombre del titular de la cuenta. Debe ser una cadena no vacía.
     * @param saldo El saldo inicial de la cuenta, debe ser mayor a cero.
     * @param nacionalidad La nacionalidad del titular de la cuenta ("ESPAÑOLA" o "EXTRANJERA").
     */
    public CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
        if (dni != null && !dni.isBlank() && dni.length() == 9)
            this.dni = dni;

        if (nombre != null && !nombre.isBlank())
            this.nombre = nombre;

        if (saldo > 0)
            this.saldo = saldo;

        // Asignar la nacionalidad a partir de la cadena proporcionada
        switch (nacionalidad.toUpperCase()) {
            case "ESPAÑOLA" -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
            case "EXTRANJERA" -> this.nacionalidad = Nacionalidad.EXTRANJERA;
            default -> this.nacionalidad = Nacionalidad.ESPAÑOLA;
        }
    }

    /**
     * Realiza un retiro de dinero de la cuenta corriente si el saldo es suficiente.
     * 
     * @param dinero La cantidad de dinero a retirar, debe ser mayor a cero.
     * @return true si el retiro fue exitoso, false si no hay saldo suficiente o el monto es inválido.
     */
    public boolean sacarDinero(double dinero) {
        boolean retired = false;

        if (((saldo - dinero) > 0) && dinero > 0) {
            saldo -= dinero;
            retired = true;
        }

        return retired;
    }

    /**
     * Realiza un ingreso de dinero en la cuenta corriente.
     * 
     * @param dinero La cantidad de dinero a ingresar, debe ser mayor a cero.
     * @return true si el ingreso fue exitoso, false si el monto es inválido.
     */
    public boolean ingresarDiner(double dinero) {
        boolean incremented = false;

        if (dinero > 0) {
            saldo += dinero;
            incremented = true;
        }

        return incremented;
    }

    /**
     * Devuelve una representación en cadena de texto de la cuenta corriente, mostrando
     * el DNI y el saldo.
     * 
     * @return Una cadena con la información del DNI y saldo de la cuenta.
     */
    public String toString() {
        return "Información de la cuenta\n" +
            "DNI: " + dni + "\n" +
            "Saldo: " + saldo + "\n";
    }
}
