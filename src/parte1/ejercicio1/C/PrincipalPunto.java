package parte1.ejercicio1.C;

public class PrincipalPunto {

	public static void main(String[] args) {
		Coordenadas punto1 = new Coordenadas(5, 0);
		Coordenadas punto2 = new Coordenadas(10, 10);
		Coordenadas punto3 = new Coordenadas(-3, 7);
		
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
		
		punto1.setX(punto1.getX() + punto3.getY());
		punto1.setY(punto1.getY() + punto1.getX());
		
		punto2.setX(punto2.getX() - punto3.getX());
		punto2.setY(punto2.getY() / punto2.getX());
		
		punto3.setX(punto3.getX() * punto2.getX());
		punto3.setY(punto3.getY() + 1);
		
		System.out.println(punto1.getX() + "," + punto1.getY());
		System.out.println(punto2.getX() + "," + punto2.getY());
		System.out.println(punto3.getX() + "," + punto3.getY());
		
	}

}
