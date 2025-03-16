package parte4.ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// Crear un objeto Hora
        Hora horaActual = new Hora(23, 59, 58);
        System.out.println(horaActual);

        // Incrementar segundos
        horaActual.incrementarSegundo();
        System.out.println(horaActual);

        horaActual.incrementarSegundo();
        System.out.println(horaActual);

        // Probar set de hora y minuto
        horaActual.setHora(12);
        horaActual.setMinuto(30);
        System.out.println(horaActual);
	}

}
