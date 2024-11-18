package ar.edu.info.unlp;

import java.time.LocalDateTime;

public abstract class Llamada {
	private LocalDateTime fecha;
	private double duracion;
	private String destino;
	
	
	public Llamada(double unaDuracion,String unDestino,LocalDateTime unaFecha) {
		this.setFecha(unaFecha);
		this.setDestino(unDestino);
		this.setDuracion(unaDuracion);
	}
	public abstract double costo();

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public boolean periodo(LocalDateTime unaFi, LocalDateTime unaFF) {
		return this.getFecha().isAfter(unaFi) && this.getFecha().isBefore(unaFF) || this.getFecha().isEqual(unaFi)|| this.getFecha().isEqual(unaFF);
	}
}


