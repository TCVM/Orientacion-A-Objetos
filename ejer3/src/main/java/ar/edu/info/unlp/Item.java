package ar.edu.info.unlp;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String unDetalle,int unaCantidad,double unCostoUnitario) {
		this.detalle=unDetalle;
		this.cantidad=unaCantidad;
		this.costoUnitario=unCostoUnitario;
	}
	
	public double costo() {
		double aux=costoUnitario*cantidad;
		return aux;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}
	
}
