package uniandes.depo.taller2.modelo;

import java.io.File;

public class Pedido {
	int numeroPedidos;
	int idPedido;
	String nombreCliente;
	String direccionCliente;
	
	public Pedido(String nombreCliente, String direccionCliente) {
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;

	}
	
	public int getIdPedido() {
		return idPedido;
		
	}
	public void agregarProducto(Producto nuevoItem) {
		
	}
	private int getPrecioNetoPedido(){
		return idPedido;
	
	}
	
	private int getPrecioTotalPedido(){
		return idPedido;
	
	}


	private int getPrecioIvaPedido(){
		return idPedido;
	}
	
	private String generarTextoFactura(){
		return null;
	}
	public void guardarFactura(File archivo){
		
	}

	

}
