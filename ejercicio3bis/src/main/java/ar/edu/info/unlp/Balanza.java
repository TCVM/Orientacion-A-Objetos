package ar.edu.info.unlp;
import java.util.List;
import java.util.ArrayList;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos= new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(producto->producto.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(producto->producto.getPeso()).sum();
	}

	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto unProducto ) {
		this.productos.add(unProducto);
	}
	
	public Ticket emitirTicket() {
		Ticket aux = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(), this.getPrecioTotal());
		return aux;
	}
}
