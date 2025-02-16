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
}
