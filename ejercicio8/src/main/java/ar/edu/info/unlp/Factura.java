package ar.edu.info.unlp;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private LocalDate fecha;
	private double montoActiva;
	private double descuento;
	private double montoTotal;
	
	public Factura(double unMonto,double unDescuento,Usuario unUsuario) {
		fecha=LocalDate.now();
		usuario=unUsuario;
		montoActiva=unMonto;
		descuento=unDescuento;
		montoTotal=unMonto-unMonto*(descuento/100);
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getMontoEnergiaActiva() {
		return this.montoActiva;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	public Usuario getUsuario() {
		return usuario;
	} 
	
	public double montoTotal() {
		return montoTotal;
	}
}
