package ar.edu.info.unlp;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo=0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	public void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)==true) {
			
			this.extraerSinControlar(monto);
			return true;
		}
		else
			return false;
	}
	
	protected abstract boolean puedeExtraer(double unMonto);
	
	public boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
			}
		return false;
	}
}
