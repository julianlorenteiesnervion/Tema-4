package parte2.ejercicio4;

public class PrincipalPizza {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(1, "MEDIANA", "Margarita");

		System.out.println(pizza1);
		
		pizza1.setEstado("Servda");
		System.out.println(pizza1); // No cambia ya que está mal escrito
		
		pizza1.setEstado("Servida");
		System.out.println(pizza1); // Ahora sí que cambia
	}

}
