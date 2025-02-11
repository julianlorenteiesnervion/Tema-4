/**
 * Clase que representa a una persona con su DNI, nombre, apellidos y edad.
 * Proporciona métodos para determinar si es mayor de edad, si es jubilado, 
 * la diferencia de edad con otra persona y la representación en forma de cadena.
 */
package parte1.ejercicio2.D;

public class Persona {
    
    /** DNI de la persona. */
    private int dni;
    
    /** Nombre de la persona. */
    private String nombre;
    
    /** Apellidos de la persona. */
    private String apellidos;
    
    /** Edad de la persona. */
    private int edad;
    
    /**
     * Devuelve el DNI de la persona.
     * 
     * @return el DNI de la persona.
     */
    public int getDni() {
        return dni;
    }
    
    /**
     * Establece el DNI de la persona.
     * 
     * @param dni El nuevo DNI de la persona.
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    /**
     * Devuelve el nombre de la persona.
     * 
     * @return el nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve los apellidos de la persona.
     * 
     * @return los apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     * Establece los apellidos de la persona.
     * 
     * @param apellidos Los nuevos apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     * Devuelve la edad de la persona.
     * 
     * @return la edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Establece la edad de la persona.
     * 
     * @param edad La nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Determina si la persona es mayor de edad.
     * 
     * @return true si la persona tiene 18 años o más, false en caso contrario.
     */
    public boolean esMayorEdad() {
        return edad >= 18;
    }
    
    /**
     * Determina si la persona es jubilada.
     * 
     * @return true si la persona tiene 65 años o más, false en caso contrario.
     */
    public boolean esJubilado() {
        return edad >= 65;
    }
    
    /**
     * Calcula la diferencia de edad entre esta persona y otra.
     * 
     * @param p La otra persona con la que se comparará la edad.
     * @return La diferencia de edad en años entre las dos personas.
     */
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }
    
    /**
     * Devuelve una representación en forma de cadena de la persona.
     * 
     * @return Una cadena que contiene los datos de la persona (DNI, nombre, apellidos y edad).
     */
    @Override
    public String toString() {
        return "DNI: " + dni +
               "\nNombre: " + nombre +
               "\nApellidos: " + apellidos +
               "\nEdad: " + edad;
    }
}
