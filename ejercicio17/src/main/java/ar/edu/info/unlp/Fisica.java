package ar.edu.info.unlp;

import java.time.LocalDateTime;

public class Fisica extends Cliente{
	private int dni;
	
	public Fisica(String unNombre,String unaDireccion,int unDNI, String unNumero) {
		super(unNombre,unaDireccion,unNumero);
		this.setDni(unDNI);
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public double facturarLlamadas(LocalDateTime unaFi,LocalDateTime unaFF) {
		return this.llamadas.stream().filter(Llamada -> Llamada.periodo(unaFi, unaFF)).mapToDouble(Llamada -> Llamada.costo()-(Llamada.costo()*0.1)).sum();
	}
}
