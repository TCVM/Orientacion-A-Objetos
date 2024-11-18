package ar.edu.info.unlp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item>items;
	
	public Presupuesto(String unNombre) {
		this.cliente=unNombre;
		this.fecha=LocalDate.now();
		this.items= new ArrayList<Item>();
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void agregarItem(Item unItem) {
		this.items.add(unItem);
	}
	
	public double calcularTotal() {
		double aux;
		aux= this.items.stream().mapToDouble(item -> item.costo()).sum();
		return aux;
	}
}
