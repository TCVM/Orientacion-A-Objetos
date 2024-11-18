package ar.edu.info.unlp;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		descubierto=0;
	}
	
	public boolean puedeExtraer(double unMonto) {
		return (unMonto <= this.descubierto + this.getSaldo());
	}

	public double getDescubierto() {
		
		return descubierto;
	}
	
	public void setDescubierto(double descubierto){
		this.descubierto=descubierto;
	}
}
