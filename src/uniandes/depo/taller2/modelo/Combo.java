package uniandes.depo.taller2.modelo;

public class Combo implements Producto{
	double descuento;
	String nombreCombo;
	public Combo(double descuento, String nombreCombo) {
		this.descuento = descuento;
		this.nombreCombo = nombreCombo;
		
	}
	
	public void agregarItemACombo(Producto itemCombo) {
	}
	
	public int getPrecio() {
		return 0;
	}

	public String getNombre() {
		return null;
	}
	
	public String generarTextoFactura() {
		return null;
	}
}