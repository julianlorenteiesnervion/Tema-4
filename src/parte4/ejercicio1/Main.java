package parte4.ejercicio1;

public class Main {
	
	static void mostrarOpciones() {
		System.out.println("ALUMNOS/AS\n"
				+ "===================\n"
				+ "1. Listado.\n"
				+ "2. Nuevo Alumno.\n"
				+ "3. Modificar.\n"
				+ "4. Borrar.\n"
				+ "5. Salir.");
	}

	public static void main(String[] args) {
		
		Crud.create("Julián", 10);
		Crud.create("Samuel", 7);
		Crud.create("Pablo", 8);
		Crud.create("José", 7);
		
		Crud.read();
		
		Crud.update("Julián", 9);
		
		Crud.read();
		
		Crud.remove("Julián");
		
		Crud.read();

	}

}
