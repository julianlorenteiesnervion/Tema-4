package parte1.ejercicio4.C;

public class PrincipalArticulo {

	public static void main(String[] args) {
		Articulo articulo;
		
		articulo = new Articulo("Vaso", 2, 1.21, 7);
		
		articulo.setNombre("Mesa");
		articulo.setPrecio(20);
		articulo.setIVA(1.21);
		articulo.setCuantosQuedan(30);
		
		System.out.println("Artículo: "+ articulo.getNombre());
		System.out.println("Precio: " + articulo.getPrecio());
		System.out.println("IVA: " + articulo.getIVA());
		System.out.println("PVP: " + articulo.getPrecio() * articulo.getIVA());
	}

}
