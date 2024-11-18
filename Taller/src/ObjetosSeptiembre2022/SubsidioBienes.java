package ObjetosSeptiembre2022;

import java.util.Iterator;

public class SubsidioBienes extends Subsidio {
	private Bien [] bienesSolicitados;
	private int dl;
	private int N;
	
	public SubsidioBienes(int max,String nombre, String plan, String fecha){
		super(nombre,plan,fecha);
		this.N=max;
		this.dl=0;
		this.bienesSolicitados= new Bien[N];
	}

	public void agregarBien(Bien bien) {
		bienesSolicitados[dl]=bien;
		dl++;
	}
	
	public double devolverMontoTotal() {
		double total=0;
		for (int i = 0; i < dl; i++) {
			total+= bienesSolicitados[i].calcularCosto();
		}
		return total;
	}
	
	public String toString() {
		String aux= super.toString()+", Monto total: "+devolverMontoTotal()+"\n";
		for (int i = 0; i < dl; i++) {
			aux+="Bien"+i+1+": "+bienesSolicitados[i].getDescripcion()+", ";
		}
		return aux;
	}
}
