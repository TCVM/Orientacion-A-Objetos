package ar.edu.info.unlp;

public class Circulo implements Figura{
	private double radio;

	public Circulo() {}
	
	public void setRadio(double unRadio) {
		this.radio=unRadio;
	}
	public double getPerimetro() {
		return Math.PI *radio*2;
	}
	public double getArea() {
		return Math.PI *radio*radio;
	}
	public double getDiametro() {
		return radio*2;
	}
	public double getRadio() {
		return radio;
	}
}
