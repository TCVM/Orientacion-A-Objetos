package ar.edu.info.unlp.ejercicioSimulacro;

import java.time.LocalDate;

public class Cheque extends Pago{
	
	public Cheque(double unMonto, String unDestinatario, String unOriginario) {
		super(unMonto, unDestinatario, unOriginario);
	}
	
	
	public boolean estaVencido() {
		return LocalDate.now().plusDays(30).isBefore(LocalDate.now()) || LocalDate.now().plusDays(30).equals(LocalDate.now()) ;
	}
	
	public boolean agregarCobro() {
		return this.estaVencido()== false;
	}
}
