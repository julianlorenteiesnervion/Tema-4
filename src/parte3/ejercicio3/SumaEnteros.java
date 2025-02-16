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
		
		int max;
		int min;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else if (num2 > num1) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		
		if (num1)
		
		return suma;
	}
}
