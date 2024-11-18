package ar.edu.info.unlp.ejercicio21;

public abstract class Usuario {
	private String nombre;
	protected double saldo;
	
	
	public Usuario(String unNombre, double unSaldo) {
		this.nombre=unNombre;
		this.saldo=unSaldo;
	}
	
	
	public abstract boolean aplicarRecargo();
	
	public void cargarSaldo(double unSaldo) {
		if (this.aplicarRecargo())this.saldo += unSaldo - unSaldo * 0.01;
		else
			this.saldo += unSaldo - unSaldo * 0.10;
		//?
	}
}
