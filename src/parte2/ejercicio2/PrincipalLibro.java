package parte2.ejercicio2;

public class PrincipalLibro {

	public static void main(String[] args) {
		Libro libro1;
		
		// Creo un libro
		libro1 = new Libro("Quijote", "Julián");
		System.out.println(libro1);
		
		// Le intento introducir -2 ejemplares (no debería dejar)
		libro1.setEjemplares(-2);
		System.out.println(libro1);
		
		// Le introduzco 10 ejemplares
		libro1.setEjemplares(10);
		System.out.println(libro1);
		
		// Intento devolver un libro prestado (no hay ningún libro prestado, por lo que no debería dejar)
		System.out.println(libro1.devolucion());
		
		// Voy a prestar 1 libro
		libro1.setPrestados(1);
		System.out.println(libro1);
		
		// Devuelvo uno
		System.out.println(libro1.devolucion());
		
		// Voy a prestar 11 (no debería)
		libro1.setPrestados(11);
		System.out.println(libro1);
		
	}

}
