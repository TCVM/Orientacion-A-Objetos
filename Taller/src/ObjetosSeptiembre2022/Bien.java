package ObjetosSeptiembre2022;

public class Bien {
	private String descripcion;
	private int cantidad;
	private double costo;
	
	public Bien(String desc,int cant,double cost) {
		this.descripcion=desc;
		this.cantidad=cant;
		this.costo=cost;
	}
	
	public String getDescripcion() {return descripcion;}	
	public double calcularCosto() {
		return cantidad*costo;
	}
}
