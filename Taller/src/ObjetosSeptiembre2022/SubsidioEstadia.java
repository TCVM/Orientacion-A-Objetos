package ObjetosSeptiembre2022;

public class SubsidioEstadia extends Subsidio{
	private String destino;
	private double costo;
	private double monto;
	private int dias;
	
	public SubsidioEstadia(String nombre, String plan, String fecha,String destino,double costo,double monto,int dias) {
		super(nombre,plan,fecha);
		this.destino=destino;
		this.costo=costo;
		this.monto=monto;
		this.dias=dias;
	}
	
	public double devolverMontoTotal() {
		return costo+(dias*monto);
	}
	
	public String toString() {
		return super.toString()+", Monto total: "+devolverMontoTotal()+", Lugar de destino: "+destino+", Dias de estadia: "+dias;
	}
	
}
