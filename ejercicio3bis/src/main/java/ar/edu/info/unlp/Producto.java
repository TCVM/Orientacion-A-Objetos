package ar.edu.info.unlp;

public class Producto {
	private double peso;
	private double precio;
	private String descripcion;
	
	public void setPrecioPorKilo(double unPrecio) {
		precio=unPrecio;
	}
	public double getPrecioPorKilo() {
		return this.precio;
	}
	
	public double getPrecio() {
		double aux=this.getPrecioPorKilo()*this.peso;
		return aux;
	}
	public void setPeso(double unPeso) {
		peso=unPeso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String unaDescripcion) {
		this.descripcion=unaDescripcion;
	}
}
