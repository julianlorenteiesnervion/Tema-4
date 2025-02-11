/**
 * Clase que representa una persona con su DNI, nombre, apellidos y edad.
 */
package parte1.ejercicio2;

public class Persona {
	/**
	 * DNI de la persona.
	 */
	int dni;
	
	/**
	 * Nombre de la persona.
	 */
	String nombre;
	
	/**
	 * Apellidos de la persona.
	 */
	String apellidos;
	
	/**
	 * Edad de la persona.
	 */
	int edad;
	
	/**
	 * Constructor que inicializa los atributos de la persona con los valores dados.
	 * 
	 * @param dni DNI de la persona.
	 * @param nombre Nombre de la persona.
	 * @param apellidos Apellidos de la persona.
	 * @param edad Edad de la persona.
	 */
	public Persona (int dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
