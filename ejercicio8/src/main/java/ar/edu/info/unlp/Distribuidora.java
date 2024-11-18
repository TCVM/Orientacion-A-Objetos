package ar.edu.info.unlp;
import java.util.List;
import java.util.ArrayList;


public class Distribuidora {
	private List<Usuario> usuarios;
	private double precioKWh;
	
	public Distribuidora(double unPrecio) {
		usuarios=new ArrayList<Usuario>();
		this.precioKWh=unPrecio;
	}
	
	public double getPrecioKW() {
		return precioKWh;
	}

	public void setPrecioKW(double precioKWh) {
		this.precioKWh = precioKWh;
	}

	public void agregarUsuario(Usuario unUsuario) {
		usuarios.add(unUsuario);
	}
	
	public List getUsuarios() {
		return usuarios;
	}
	
	public List facturar() {
		List aux=new ArrayList<>();
		for (Usuario x : usuarios)
			aux.add(x.getFacturas().getFirst());
		return aux;
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(Usuario->Usuario.ultimoConsumoActiva()).sum();
	}

}
