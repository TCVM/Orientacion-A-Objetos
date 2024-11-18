package ar.edu.info.unlp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String direccion;
	private String numero;
	protected List<Llamada> llamadas;
	private List<Factura> facturas;

	public Cliente(String unNombre,String unaDireccion,String unNumero) {
		this.setDireccion(unaDireccion);
		this.setNombre(unNombre);
		this.setNumero(unNumero);
		llamadas= new ArrayList<>();
		facturas= new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/*public Local registrarLlamadaLocal(double unaDuracion,String unDestino) {
		Local aux=new Local (unaDuracion,unDestino);
		llamadas.add(aux);
		return aux;
	}
	
	public Interurbana registrarLlamadaInterurbana(double unaDuracion,String unDestino,double unKm) {
		Interurbana aux=new Interurbana (unaDuracion,unDestino,unKm);
		llamadas.add(aux);
		return aux;
	}
	
	public Internacional registrarLlamadaInternacional(double unaDuracion,String unDestino,String unOrigen,String unPaisDestino) {
		Internacional aux=new Internacional (unaDuracion,unDestino,unOrigen,unPaisDestino);
		llamadas.add(aux);
		return aux;
	}
	*/
	public Factura facturarCliente(LocalDateTime unaFechaI,LocalDateTime unaFechaF) {
		Factura aux= new Factura(this,unaFechaI,unaFechaF,this.facturarLlamadas(unaFechaI,unaFechaF));
		facturas.add(aux);
		return aux;
	}
	
	public double facturarLlamadas(LocalDateTime unaFi,LocalDateTime unaFF) {
		return this.llamadas.stream().filter(Llamada -> Llamada.periodo(unaFi, unaFF)).mapToDouble(Llamada -> Llamada.costo()).sum();
	}
	
	public Llamada registrarLlamada(Llamada unaLlamada) {
		llamadas.add(unaLlamada);
		return unaLlamada;
	}
}
