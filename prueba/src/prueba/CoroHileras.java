/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author ailin
 */
public class CoroHileras extends Coros{
    private Coristas corohile [][];
    private int cantf;
    private int cantc;
    private int dimL;
    private int dimF;

    public CoroHileras(int cantf, int cantc, String nombre, Director director) {
        super(nombre, director);
        setCantf(cantf);
        setCantc(cantc);
        setDimL(0);
        setDimF(cantf*cantc);
        this.corohile = new Coristas[cantf][cantc];
    }

    public int getCantf() {
        return cantf;
    }

    private void setCantf(int cantf) {
        this.cantf = cantf;
    }

    public int getCantc() {
        return cantc;
    }

    private void setCantc(int cantc) {
        this.cantc = cantc;
    }

    public int getDimL() {
        return dimL;
    }

    private void setDimL(int dimL) {
        this.dimL = dimL;
    }

    public int getDimF() {
        return dimF;
    }

    private void setDimF(int dimF) {
        this.dimF = dimF;
    }

    
    
    public void agregarCorista(Coristas corista) {
        this.corohile [dimL/cantc][dimL%cantc]=corista;
        dimL++;
    }

    public boolean estaCompleto(){
        boolean comp=false;
        if (dimL==dimF)
            comp=true;
        return comp;
    }
    
    public boolean bienFormado() {
        boolean esta= true;
        int tono;
        int i=0;
        int j=0;
        while (i<((dimL/cantc)-1)&& esta){
            tono= corohile[i][j].getTono();
            while (j<((dimL%cantc)-1)&& esta){
                if(tono!=this.corohile[i][j+1].getTono())
                    esta=false;
                j++;
            }
            if(tono<this.corohile[i+1][j].getTono())
                esta=false;
            i++;
        }   
        return esta;
    }

    
    public String toString() {
        String texto= super.toString();
        for (int i=0; i<this.cantf; i++){
            for (int j=0; j<this.cantc;j++){
                texto+= corohile[i][j].toString();
            }
        }
        return texto;
    }
    
    

    


    
}
