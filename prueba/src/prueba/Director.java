/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author ailin
 */
public class Director extends Persona {
    
    private int antiguedad;

    public Director(int antiguedad, String nombre, int dni, int edad) {
        super(nombre, dni, edad);
        setAntiguedad(antiguedad);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    private void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String toString() {
        return  "Director "+ super.toString() + "antiguedad: " + this.getAntiguedad()+ ".";
    }

    
    
}
