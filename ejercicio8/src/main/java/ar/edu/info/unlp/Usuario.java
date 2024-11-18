package ar.edu.info.unlp;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class Usuario {
	private String nombre,domicilio;
	private LinkedList<Factura> facturas;
	private LinkedList<Consumo> consumos;

	public Usuario(String unNombre,String unDomicilio) {
		setNombre(unNombre);
		setDomicilio(unDomicilio);
		facturas=new LinkedList<>();
		consumos=new LinkedList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public LinkedList getFacturas() {
		return facturas;
	}
	
	public double ultimoConsumoActiva() {
		Consumo consumo=this.consumos.stream().max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
		if (consumo!= null)
			return consumo.getConsumoDeEnergiaActiva();
		else return 0;
	}
	
	public void agregarMedicion(Consumo unConsumo) {
		consumos.addFirst(unConsumo);
	}
	public Factura facturarEnBaseA(double unPrecio) {
		double monto= this.consumos.getFirst().costoEnBase(unPrecio);
		double descuento;
		if(consumos.getFirst().factorDePotencia()>0.8)
			descuento=10;
		else
			descuento=0;
		Factura aux= new Factura(monto,descuento,this);
		facturas.add(aux);
		return aux;
	}
}