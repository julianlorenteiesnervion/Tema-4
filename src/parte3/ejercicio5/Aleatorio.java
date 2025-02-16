package parte3.ejercicio5;

import java.util.*;

public class Aleatorio {

	public void numerosAleatorios(int qty) {
		Random random = new Random();
		
		for (int i = 0; i < qty; i++) {
			System.out.println(random.nextInt(0, 2));
		}
	}
	
	public void numerosAleatorios(int qty, int max) {
		Random random = new Random();
		
		for (int i = 0; i < qty; i++) {
			System.out.println(random.nextInt(0, max + 1));
		}
	}
	
	public void numerosAleatorios(int qty, int min, int max) {
		Random random = new Random();
		
		for (int i = 0; i < qty; i++) {
			System.out.println(random.nextInt(min, max + 1));
		}
	}
}
