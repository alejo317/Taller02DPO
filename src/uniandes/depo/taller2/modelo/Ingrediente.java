package uniandes.depo.taller2.modelo;

public class Ingrediente {
	int costoAdicional;
	String nombre;
	public Ingrediente(String nombre, int costoAdicional) {
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	public String getNombre() {
		return nombre;
		
	}
	public int getCostoAdicional() {
		return costoAdicional;
		
	}

}
