package parte1.ejercicio4.OOP;

public class PrincipalArticulo {

	public static void main(String[] args) {
		Articulo articulo;
		
		articulo = new Articulo("Vaso", 2, 1.21, 7);
		
		System.out.println("Artículo: "+ articulo.nombre);
		System.out.println("Precio: " + articulo.precio);
		System.out.println("IVA: " + articulo.IVA);
		System.out.println("PVP: " + articulo.precio * articulo.IVA);
	}

}
