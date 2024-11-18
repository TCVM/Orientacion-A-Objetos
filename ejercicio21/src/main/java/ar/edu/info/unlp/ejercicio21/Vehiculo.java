package ar.edu.info.unlp.ejercicio21;
import java.time.LocalDate;

public class Vehiculo {
	private Usuario_Conductor conductor;
	private String descripcion;
	private int capacidad;
	private LocalDate año;
	private double valor;
	
	public Vehiculo(Usuario_Conductor unConductor, String unaDescripcion, int unaCapacidad, LocalDate unAño,double unValor) {
		this.conductor=unConductor;
		this.descripcion=unaDescripcion;
		this.capacidad=unaCapacidad;
		this.año=unAño;
		this.valor=unValor;
	}
	
	public boolean menos5años(){
		if((LocalDate.now().getYear()-año.getYear()) < 5)
			return true;
		else return false;
		}
}
