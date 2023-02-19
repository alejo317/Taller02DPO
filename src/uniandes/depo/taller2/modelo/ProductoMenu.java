package uniandes.depo.taller2.modelo;

public class ProductoMenu implements Producto{
	String nombre;
	int precioBase;
	public ProductoMenu(String nombre, int precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
				
	}
	public String getNombre() {
		return nombre;
		
	}
	
	public int getPrecio() {
		return precioBase;
	}

	public String generarTextoFactura() {
		return null;
	}

}
