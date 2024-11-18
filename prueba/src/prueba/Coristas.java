/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author ailin
 */
public class Coristas extends Persona{
    private int tono;

    public Coristas(int tono, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        setTono(tono);
    }

    public int getTono() {
        return tono;
    }

    private void setTono(int tono) {
        this.tono = tono;
    }

    
    public String toString() {
        return "Coristas " + super.toString()+ "tono fundamental: " + this.getTono()+ '.';
    }

 
  
}
