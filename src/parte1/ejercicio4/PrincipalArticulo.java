package parte1.ejercicio4;

public class PrincipalArticulo {

	public static void main(String[] args) {
		Articulo articulo = new Articulo();
		
		articulo.nombre = "Vaso";
		articulo.precio = 2;
		
		System.out.println("Artículo: "+ articulo.nombre);
		System.out.println("Precio: " + articulo.precio);
		System.out.println("IVA: " + articulo.IVA);
		System.out.println("PVP: " + articulo.precio * articulo.IVA);
	}

}
