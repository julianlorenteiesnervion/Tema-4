package parte4.ejercicio2;

public class Main {

	public static void main(String[] args) {
		// Objeto contador con valor inicial 10
        Contador contador = new Contador(10);
        System.out.println(contador);

        // Incrementar el contador
        contador.incrementar();
        System.out.println(contador);

        // Decrementar el contador varias veces
        contador.decrementar();
        System.out.println(contador);

        // Probar el límite de no permitir valores negativos
        for (int i = 0; i < 15; i++) {
            contador.decrementar();
            System.out.println(contador);
        }

	}

}
