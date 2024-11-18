package ar.edu.info.unlp;
import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	
	public Mamifero() {};
	
	public Mamifero(String unIdentificador) {
		this.identificador=unIdentificador;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		if ((madre != null)&&(madre.getPadre() != null))
			return madre.getPadre();
		else
			return null;
	}
	public Mamifero getAbuelaMaterna() {
		if((madre != null)&&(madre.getMadre() != null))	
			return madre.getMadre();
		else
			return null;
	}
	public Mamifero getAbueloPaterno() {
		if((padre != null)&&(padre.getPadre() != null))
			return padre.getPadre();
		else
			return null;
	}
	public Mamifero getAbuelaPaterna() {
		if((madre != null)&&(padre.getMadre() != null))	
			return padre.getMadre();
		else
			return null;
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if ((unMamifero == null)||(unMamifero == this))
			return false;
		else 
			return tieneComoAncestroA2(unMamifero);
	}
	private boolean tieneComoAncestroA2(Mamifero unMamifero) {
		if (unMamifero != this) {
				return (((this.madre != null && madre.tieneComoAncestroA2(unMamifero)) || (this.padre != null && padre.tieneComoAncestroA2(unMamifero))));
		}
		else 
			return true;
	}
}

