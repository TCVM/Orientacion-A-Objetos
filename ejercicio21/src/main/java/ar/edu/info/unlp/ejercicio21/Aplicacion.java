package ar.edu.info.unlp.ejercicio21;
import java.util.List;
import java.util.ArrayList;

public class Aplicacion {
	private List<Usuario> usuarios;
	
	public Aplicacion() {
		usuarios= new ArrayList<>();
	}
	
	public Usuario darAltaUsuarioPasajero(String unNombre, double unSaldo){
		Usuario_Pasajero A= new Usuario_Pasajero(unNombre,unSaldo);
		usuarios.add(A);
		return A;
	}
	
	public Usuario darAltaUsuarioConductor(String unNombre, double unSaldo, Vehiculo unVehiculo) {
		Usuario_Conductor A= new Usuario_Conductor(unNombre, unSaldo, unVehiculo);
		usuarios.add(A);
		return A;
	}
}

