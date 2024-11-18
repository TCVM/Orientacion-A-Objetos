package ar.edu.info.unlp;

import java.time.LocalDateTime;

public class Internacional extends Llamada{

	private String origen;
	private String paisDestino;
	
	public Internacional(double unaDuracion,String unDestino,LocalDateTime unaFecha,String unOrigen,String unPaisDestino) {
		super(unaDuracion,unDestino,unaFecha);
		this.setOrigen(unOrigen);
		this.setPaisDestino(unPaisDestino);
	}

	private void setOrigen(String origen) {
		this.origen = origen;
	}

	private void setPaisDestino(String paisDestino) {
		this.paisDestino = paisDestino;
	}

	public double costo() {
		double monto;
		if(this.getFecha().getHour()>=8 && this.getFecha().getHour()<=20) monto= this.getDuracion()*4;
		else monto= this.getDuracion()*3;
		return monto;
	}
}
