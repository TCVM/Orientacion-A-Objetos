package ar.edu.info.unlp.ejercicioSimulacro;
import java.time.LocalDate;

public class Pagare extends Pago{
	private LocalDate fechaVencimiento;
	
	public Pagare(double unMonto, String unDestinatario, String unOriginario, LocalDate unaFechaV){
		super(unMonto, unDestinatario, unOriginario);
		this.fechaVencimiento=unaFechaV;
	}
	
	public LocalDate getFechaVencimiento() {
		return this.fechaVencimiento;
	}
	
	public boolean estaVencido() {
		return this.getFechaVencimiento().isBefore(LocalDate.now()) || this.getFechaVencimiento().equals(LocalDate.now()) ;
	}
	
	public boolean agregarCobro() {
		return this.estaVencido()==true;
	}
}
