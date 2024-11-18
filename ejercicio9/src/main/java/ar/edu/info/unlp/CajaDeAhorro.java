package ar.edu.info.unlp;

public class CajaDeAhorro extends Cuenta{
	public CajaDeAhorro() {
		
	}
	
	public boolean puedeExtraer(double unMonto) {
		double aux=unMonto*1.02;
		//System.out.println(aux);
		//System.out.println(this.getSaldo());
		if((aux)<=this.getSaldo())
			return true;
		else
			return false;
	}
	
}
