package ar.edu.info.unlp;

import java.time.LocalDateTime;

public class Factura {
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private LocalDateTime fechaFactura;
	private Cliente cliente;
	private double montoTotal;
	
	public Factura(Cliente unCliente,LocalDateTime unaFechaI, LocalDateTime unaFechaF,double monto) {
		this.setFechaFactura(LocalDateTime.now());
		this.setCliente(unCliente);
		this.setFechaInicio(unaFechaI);
		this.setFechaFin(unaFechaF);
		this.setMontoTotal(monto);
	}


	private void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	private void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	private void setFechaFactura(LocalDateTime fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	private void setMontoTotal(double monto) {
		this.montoTotal=monto;
	}
	
	
}
