package ar.edu.info.unlp;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void ponerEnCero() {
		this.setCantidadDeProductos(0);
		this.setPesoTotal(0);
		this.setPrecioTotal(0);
	}
	
	public void agregarProducto(Producto unProducto ) {
		this.setCantidadDeProductos(this.getCantidadDeProductos()+1);
		this.setPesoTotal(this.getPesoTotal()+unProducto.getPeso());
		this.setPrecioTotal(this.getPrecioTotal() + unProducto.getPrecio());
	}
	
	public Ticket emitirTicket() {
		Ticket aux = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(), this.getPrecioTotal());
		return aux;
	}
}
