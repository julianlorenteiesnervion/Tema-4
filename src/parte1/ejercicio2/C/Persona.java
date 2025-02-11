/**
 * Clase que representa a una persona con su DNI, nombre, apellidos y edad.
 * Proporciona métodos para obtener y modificar sus atributos.
 */
package parte1.ejercicio2.C;

public class Persona {
    
    /**
     * DNI de la persona.
     */
    private int dni;
    
    /**
     * Nombre de la persona.
     */
    private String nombre;
    
    /**
     * Apellidos de la persona.
     */
    private String apellidos;
    
    /**
     * Edad de la persona.
     */
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
}
