package parte1.ejercicio1.OOP;

public class PrincipalPunto {

	public static void main(String[] args) {
		Coordenadas punto1 = new Coordenadas(5, 0);
		Coordenadas punto2 = new Coordenadas(10, 10);
		Coordenadas punto3 = new Coordenadas(-3, 7);
		
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
		
		punto1.x += punto3.y;
		punto1.y += punto1.x;
		
		punto2.x -= punto3.x;
		punto2.y /= punto2.x;
		
		punto3.x *= punto2.x;
		punto3.y++;
		
		System.out.println(punto1.x + "," + punto1.y);
		System.out.println(punto2.x + "," + punto2.y);
		System.out.println(punto3.x + "," + punto3.y);
		
	}

}
