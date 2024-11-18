package ObjetosSeptiembre2022;

public abstract class Subsidio {
	private String nombreInvestigador;
	private String plan;
	private String fecha;
	
	public Subsidio(String nombre, String plan, String fecha) {
		this.nombreInvestigador=nombre;
		this.plan=plan;
		this.fecha=fecha;
	}
	
	public abstract double devolverMontoTotal();
	
	public String toString() {
		return "Nombre Investigador: "+ nombreInvestigador+", Plan de trabajo: "+plan+", Fecha de solicitud: "+fecha;
	}
}
