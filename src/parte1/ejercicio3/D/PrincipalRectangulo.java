package parte1.ejercicio3.D;

public class PrincipalRectangulo {
	
	// ¿Por qué no funciona sin el static?
//	public static void printRec(int x1, int y1, int x2, int y2) {
//		System.out.println(x1 + "," + y1 + "\n"
//				+ x2 + "," + y2);
//	}

	public static void main(String[] args) {
		Rectangulo rec1;
		
		rec1 = new Rectangulo(0, 5, 0, 5);
		
		rec1.setX1Y1(0, 0);
		rec1.setX2Y2(5, 5);
		
		System.out.println(rec1);
		
		rec1.setAll(1, 1, 7, 6);
		
		System.out.println(rec1);
		
	}
}