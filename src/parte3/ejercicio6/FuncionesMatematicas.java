package parte3.ejercicio6;

public class FuncionesMatematicas {
	
	public static int sumatorio(int num) {
		int suma;
		
		if (num == 1) {
			suma = 1;
		} else {
			suma = num + sumatorio(num - 1);
		}
		
		return suma;
	}
	
	public static double potencia(double num, int exponente) {
		return Math.pow(num, exponente);
	}
	
}
