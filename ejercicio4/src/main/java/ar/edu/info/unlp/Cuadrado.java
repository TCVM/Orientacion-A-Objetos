package ar.edu.info.unlp;

public class Cuadrado implements Figura{
	private int lado;
	
	public Cuadrado() {
	}
	
	public double getArea() {
		return lado*lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double getPerimetro() {
		return lado*4;
	}

	
}
