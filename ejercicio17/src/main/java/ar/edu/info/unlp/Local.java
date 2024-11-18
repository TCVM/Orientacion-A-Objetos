package ar.edu.info.unlp;

import java.time.LocalDateTime;

public class Local extends Llamada	{
	
	public Local(double unaDuracion,String unDestino,LocalDateTime unaFecha ) {
		super(unaDuracion,unDestino,unaFecha);
	}
	public double costo() {
		return this.getDuracion();
	}
}
