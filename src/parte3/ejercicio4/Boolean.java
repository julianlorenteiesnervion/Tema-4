package parte3.ejercicio4;

public class Boolean {
	public boolean parseToBoolean(int num) {
		boolean bl;
		
		bl = num == 1;
		
		return bl;
	}
	
	public boolean parseToBoolean(String phrase) {
		boolean bl;
		
		bl = phrase.equals("true");
		
		return bl;
	}
}
