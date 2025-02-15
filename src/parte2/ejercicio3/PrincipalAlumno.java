package parte2.ejercicio3;

public class PrincipalAlumno {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Julián", 9);
		Alumno alumno2 = new Alumno("Samuel", 8);
		Alumno alumno3 = new Alumno("José", -2);
		Alumno alumno4 = new Alumno("Julián", 10);
		
		System.out.println(alumno1);
		System.out.println(alumno2);
		System.out.println(alumno3);
		System.out.println(alumno4);
		
		System.out.println(alumno1.getNotaMedia());
		alumno1.setNotaMedia(8);
		System.out.println(alumno1.getNotaMedia());
		
		System.out.println(alumno2.getNombre());
		
		System.out.println("¿Son iguales? " + alumno1.equals(alumno4));

	}

}
