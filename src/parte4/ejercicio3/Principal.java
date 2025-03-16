package parte4.ejercicio3;

public class Principal {

	public static void main(String[] args) {
		// Crear un objeto Fecha
        Fecha fecha = new Fecha(28, 2, 2020);  // Año bisiesto
        System.out.println(fecha);

        // Incrementar al día siguiente
        fecha.diaSiguiente();
        System.out.println(fecha);

        // Incrementar al día siguiente otra vez
        fecha.diaSiguiente();
        System.out.println(fecha);

        // Probar con una fecha no bisiesta
        Fecha fechaNoBisiesta = new Fecha(28, 2, 2021);
        System.out.println(fechaNoBisiesta);

        // Incrementar al día siguiente
        fechaNoBisiesta.diaSiguiente();
        System.out.println(fechaNoBisiesta);
	}

}
