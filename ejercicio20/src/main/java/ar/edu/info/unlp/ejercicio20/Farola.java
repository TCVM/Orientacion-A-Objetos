package ar.edu.info.unlp.ejercicio20;
import java.util.List;
import java.util.ArrayList;

public class Farola {
	private boolean estado;
	private String empresa;
	private int cantMaxEncendidos;
	private List<Farola> neighbors;
	private int ciclos;
	private boolean vencimiento;
	
	public Farola(int cantMaxEncendidos, String unaEmpresa) {
		this.estado=false;
		this.neighbors= new ArrayList<>();
		this.ciclos=0;
		this.cantMaxEncendidos=cantMaxEncendidos;
		this.empresa=unaEmpresa;
	}
	
	
	public boolean isOn() {
		return estado;
	}
	
	public List getNeighbors() {
		return neighbors;
	} 
	
	public void addFarola(Farola unaFarola) {
		neighbors.add(unaFarola);
	}
	
	public void PairWithNeighbours(Farola unaFarola) {
		neighbors.add(unaFarola);
		unaFarola.addFarola(this);
	}
	public void turnOn() {
		if(!isOn())
				this.estado=true;
				for (Farola farola : neighbors) {
					farola.turnOn();
				}
	}
	public void turnOff(){
		if(isOn())
			this.estado=false;
			for (Farola farola : neighbors) {
				farola.turnOff();
			}
	}
	public void estaVencido() {
		this.vencimiento=true;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
}
//se rompio y no se que tanto se perdio