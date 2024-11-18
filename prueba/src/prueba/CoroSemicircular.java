/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author ailin
 */
public class CoroSemicircular extends Coros {
    private Coristas [] corosemi;
    private int cant;
    private int dimL;

    public CoroSemicircular(int cant, String nombre, Director director) {
        super(nombre, director);
        setCant(cant);
        setDimL(0);
        this.corosemi = new Coristas[cant];
    }

    public int getCant() {
        return cant;
    }

    private void setCant(int cant) {
        this.cant = cant;
    }

    public int getDimL() {
        return dimL;
    }

    private void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    
    
    public void agregarCorista(Coristas corista) {
        if(dimL<cant){
        corosemi [dimL] = corista;
        dimL++;
        }
    }
    
    public boolean estaCompleto(){
        boolean comp=false;
        if (dimL== cant)
            comp=true;
        return comp;
    }
    
    public boolean bienFormado(){
        boolean esta=true;
        int tono;
        int i=0;
        while (i<(dimL-1)&& esta){
            tono= corosemi[i].getTono();
            if(tono<this.corosemi[i+1].getTono())
                esta=false;
            i++;
        }
        return esta;
    }

    public String toString() {
        String texto= super.toString();
        for (int i=0; i<this.dimL; i++){
            texto+=corosemi[i].toString();
        }
        return texto;
    }
    
    
}
