package parte1.ejercicio3.OOP;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1;
		Rectangulo rec2;
		
		rec1 = new Rectangulo(0, 5, 0, 5);
		rec2 = new Rectangulo(7, 2, 9, 3);
		
		System.out.println("Rectángulo\n(" + rec1.x1 + "," + rec1.y1 + ")(" + rec1.x2 + "," + rec1.y2 + ")");
		System.out.println("(" + rec2.x1 + "," + rec2.y1 + ")(" + rec2.x2 + "," + rec2.y2 + ")");
	}
}