/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author ailin
 */
public abstract class Coros {
    private String nombre;
    private Director director;
    

    public Coros(String nombre, Director director) {
        setNombre(nombre);
        setDirector(director);
    }
        
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirector() {
        return director;
    }

    private void setDirector(Director director) {
        this.director = director;
    }

    public abstract void agregarCorista(Coristas corista);
    public abstract boolean estaCompleto();
    public abstract boolean bienFormado();

    public String toString() {
        return "Coro " + "nombre: " + this.getNombre() + ", director: " + this.director.toString() + '.';
    }
    
    
    
}
