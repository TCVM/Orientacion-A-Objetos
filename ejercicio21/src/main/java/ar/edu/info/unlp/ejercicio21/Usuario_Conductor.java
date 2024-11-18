package ar.edu.info.unlp.ejercicio21;

public class Usuario_Conductor extends Usuario{
	private Vehiculo vehiculo;
	
	public Usuario_Conductor(String unNombre, double unSaldo, Vehiculo unVehiculo){
		super(unNombre,unSaldo);
		this.vehiculo=unVehiculo;
	}
	
	public boolean aplicarRecargo() {
		return vehiculo.menos5años();
	}
	
		//?
}
