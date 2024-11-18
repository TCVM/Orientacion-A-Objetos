package ar.edu.info.unlp;

public class Juridica extends Cliente{
	private int cuit;
	private String tipo;
	
	
	public Juridica(String unNombre,String unaDireccion,int unCuit,String unTipo,String unNumero) {
		super(unNombre,unaDireccion,unNumero);
		this.setCuit(unCuit);
		this.setTipo(unTipo);
	}


	public int getCuit() {
		return cuit;
	}


	public void setCuit(int cuit) {
		this.cuit = cuit;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
