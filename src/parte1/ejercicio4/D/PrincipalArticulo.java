package parte1.ejercicio4.D;

public class PrincipalArticulo {

	public static void main(String[] args) {
		Articulo articulo;
		
		articulo = new Articulo("Vaso", 2, 1.21, 7);
		
		articulo.setNombre("Mesa");
		articulo.setPrecio(20);
		articulo.setCuantosQuedan(30);
		
		System.out.println(articulo);
		System.out.println("Descuento: " + articulo.getPVPDescuento(20));
	}

}
