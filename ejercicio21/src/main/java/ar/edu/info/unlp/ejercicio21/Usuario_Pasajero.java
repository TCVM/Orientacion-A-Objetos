package ar.edu.info.unlp.ejercicio21;

import java.util.List;
import java.util.ArrayList;


public class Usuario_Pasajero extends Usuario{
	private List <Viaje> viajes; 
	
	public Usuario_Pasajero(String unNombre, double unSaldo) {
		super(unNombre,unSaldo);
		viajes= new ArrayList<>();
	}
	
	public boolean aplicarRecargo() {
		if(viajes.get(viajes.size() - 1).menos30()) return true;
		else return false;
	}

}
