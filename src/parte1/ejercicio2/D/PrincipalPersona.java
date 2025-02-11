/**
 * Clase principal que contiene el método main para probar la clase Persona.
 * Se solicitan datos de dos personas por consola y se muestran los detalles de cada una.
 */
package parte1.ejercicio2.D;

import java.util.Scanner;

public class PrincipalPersona {

    /**
     * Método principal que recoge los datos de dos personas por consola y los muestra por pantalla.
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
        persona1.setDni(reader.nextInt());
        reader.nextLine(); // Consumir el salto de línea
        System.out.print("Introduce tu nombre: ");
        persona1.setNombre(reader.nextLine());
        System.out.print("Introduce tus apellidos: ");
        persona1.setApellidos(reader.nextLine());
        System.out.print("Introduce tu edad: ");
        persona1.setEdad(reader.nextInt());
        reader.nextLine(); // Consumir el salto de línea
        
        // Solicitud de datos para la segunda persona
        System.out.print("Introduce tu dni: ");
        persona2.setDni(reader.nextInt());
        reader.nextLine(); // Consumir el salto de línea
        System.out.print("Introduce tu nombre: ");
        persona2.setNombre(reader.nextLine());
        System.out.print("Introduce tus apellidos: ");
        persona2.setApellidos(reader.nextLine());
        System.out.print("Introduce tu edad: ");
        persona2.setEdad(reader.nextInt());
        reader.nextLine(); // Consumir el salto de línea
        
        // Mostrar los detalles de cada persona
        System.out.println(persona1);
        System.out.println(persona2);
    }
}
