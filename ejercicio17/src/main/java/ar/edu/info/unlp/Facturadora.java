package ar.edu.info.unlp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Facturadora {
	private List<String> numeros;
	private List<Cliente> clientes;
	
	public Facturadora() {
		numeros= new ArrayList<String>();
		clientes= new ArrayList<Cliente>();
	}
	
	public void agregarNumero(String unNumero) {
		numeros.add(unNumero);	
	}
	
	public String getNumero() {
		String num=numeros.get(0);
		numeros.remove(0);
		return num;
	}
	/*
	public Fisica darDeAltaFisica(String unNombre, String unaDireccion, int unDNI) {
		Fisica aux;
		aux= new Fisica(unNombre,unaDireccion,unDNI,getNumero());
		clientes.add(aux);
		return aux;
	}
	
	public Juridica darDeAltaJuridica(String unNombre, String unaDireccion, int unCuit, String unTipo) {
		Juridica aux;
		aux= new Juridica(unNombre,unaDireccion,unCuit,unTipo,getNumero());
		return aux;
	}
	*/
	public Cliente darDeAlta(Cliente unCliente) {
		clientes.add(unCliente);
		return unCliente;
	}
	/*
	public Factura facturarCliente(Cliente unCliente,LocalDateTime unaFechaI,LocalDateTime unaFechaF) {
		Factura aux= new Factura(unCliente,unaFechaI,unaFechaF);
		return aux;
	}
	*/
}
