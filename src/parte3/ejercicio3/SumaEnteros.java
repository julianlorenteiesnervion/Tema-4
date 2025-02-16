package parte3.ejercicio3;

public class SumaEnteros {
	public int sumaEnteros(int num) {
		int suma;
		
		if (num == 0) {
			suma = 0;
		} else {
			suma = num + sumaEnteros(num - 1);
		}
		
		return suma;
	}
	
	public int sumaEnteros(int num1, int num2) {
		int suma;
		
		if (num1 == num2) {
			suma = num1;
		} else if (num1 < num2) {
			suma = num1 + sumaEnteros(num1 + 1, num2);
		} else {
			suma = num2 + sumaEnteros(num2 + 1, num1);
		}
		
		return suma;
	}
}
