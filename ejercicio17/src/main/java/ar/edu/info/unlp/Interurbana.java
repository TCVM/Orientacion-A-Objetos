package ar.edu.info.unlp;

import java.time.LocalDateTime;

public class Interurbana extends Llamada {
	private double km;
	
	public Interurbana(double unaDuracion,String unDestino,LocalDateTime unaFecha,double unKm) {
		super(unaDuracion,unDestino,unaFecha);
		this.setKm(unKm);
	}
	
	private void setKm(double km) {
		this.km = km;
	}
	
	public double costo() {
		double monto;
		if(km>500) monto=5+(3*this.getDuracion());
		else if(km<=500 && km>=100) monto=5+(2.5*this.getDuracion());
			 else monto=5+(2*this.getDuracion());
		return monto;
	}
}
