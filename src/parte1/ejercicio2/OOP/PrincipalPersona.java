/**
 * Clase principal que contiene el método main para probar la clase Persona.
 * Se solicitan datos de dos personas por consola y se determina si son mayores de edad.
 */
package parte1.ejercicio2.OOP;

import java.util.Scanner;

public class PrincipalPersona {

    /**
     * Método principal que recoge los datos de dos personas por consola y muestra si son mayores de edad.
     * 
     * @param args Argumentos pasados por línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Creación de dos objetos Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        // Solicitud de datos para la primera persona
        System.out.print("Introduce tu dni: ");
        persona1.dni = reader.nextInt();
        reader.nextLine(); // Consumir el salto de línea
        System.out.print("Introduce tu nombre: ");
        persona1.nombre = reader.nextLine();
        System.out.print("Introduce tus apellidos: ");
        persona1.apellidos = reader.nextLine();
        System.out.print("Introduce tu edad: ");
        persona1.edad = reader.nextInt();
        reader.nextLine(); // Consumir el salto de línea
        
        // Solicitud de datos para la segunda persona
        System.out.print("Introduce tu dni: ");
        persona2.dni = reader.nextInt();
        reader.nextLine(); // Consumir el salto de línea
        System.out.print("Introduce tu nombre: ");
        persona2.nombre = reader.nextLine();
        System.out.print("Introduce tus apellidos: ");
        persona2.apellidos = reader.nextLine();
        System.out.print("Introduce tu edad: ");
        persona2.edad = reader.nextInt();
        reader.nextLine(); // Consumir el salto de línea
        
        // Mostrar si las personas son mayores de edad
        System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni + (persona1.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
        System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni + (persona2.edad >= 18 ? " es mayor de edad." : " no es mayor de edad."));
    }
}
