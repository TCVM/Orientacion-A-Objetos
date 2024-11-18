package ar.edu.info.unlp;

import java.time.LocalDate;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	private LocalDate fecha;
	
	public Consumo(LocalDate unaFecha,double eActiva, double eReactiva) {
		this.fecha=unaFecha;
		this.energiaActiva=eActiva;
		this.energiaReactiva=eReactiva;
	}

	public double getConsumoDeEnergiaActiva() {
		return energiaActiva;
	}

	public double getConsumoDeEnergiaReactiva() {
		return energiaReactiva;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	
	public double factorDePotencia() {
		double fpe=this.getConsumoDeEnergiaActiva()/Math.sqrt((this.getConsumoDeEnergiaActiva()*this.getConsumoDeEnergiaActiva() + this.getConsumoDeEnergiaReactiva()*this.getConsumoDeEnergiaReactiva()));
		return fpe;
	}
	
	public double costoEnBase(double unPrecio) {
		return this.getConsumoDeEnergiaActiva()*unPrecio;
	}
}
