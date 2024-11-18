package ar.edu.info.unlp.ejercicioSimulacro;
import java.time.LocalDate;

public abstract class Pago  {
	private double monto;
	private String destinatario;
	private String originario;
	private LocalDate fechaEmision;
	
	public Pago(double unMonto, String unDestinatario, String unOriginario) {
		this.monto=unMonto;
		this.destinatario=unDestinatario;
		this.originario=unOriginario;
		this.fechaEmision=LocalDate.now();
	}
	
	public abstract boolean estaVencido();
	
	public double getMonto() {
		return this.monto;
	}
	
	public abstract boolean agregarCobro();
	
	public void setMonto(double unMonto) {
		this.monto=unMonto;
	}
	
	public String getDestinatario() {
		return this.destinatario;
	}
	
	public void setDestinatario(String unDestinatario) {
		this.destinatario=unDestinatario;
	}
	
	public String getOriginario() {
		return this.originario;
	}
	
	public void setOriginario(String unOriginario) {
		this.originario=unOriginario;
	}
	
	public LocalDate getFechaEmision() {
		return this.fechaEmision;
	}
	
}
