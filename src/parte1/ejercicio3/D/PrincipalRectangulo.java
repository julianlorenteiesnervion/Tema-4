package parte1.ejercicio3.D;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1;
		Rectangulo rec2;
		
		rec1 = new Rectangulo(0, 5, 0, 5);
		rec2 = new Rectangulo(7, 2, 9, 3);
		
		rec1.setX1(1);
		rec1.setX2(2);
		rec1.setY1(3);
		rec1.setY2(4);
		
		rec2.setX1(5);
		rec2.setX2(6);
		rec2.setY1(7);
		rec2.setY2(8);
		
		System.out.println("Rectángulo\n(" + rec1.x1 + "," + rec1.y1 + ")(" + rec1.x2 + "," + rec1.y2 + ")");
		System.out.println("(" + rec2.x1 + "," + rec2.y1 + ")(" + rec2.x2 + "," + rec2.y2 + ")");
	}
}