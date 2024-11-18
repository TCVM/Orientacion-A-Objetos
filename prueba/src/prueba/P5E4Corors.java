/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author ailin
 */
public class P5E4Corors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Director dir1 = new Director(4,"nn",66,44);
     
        
        Coristas c1= new Coristas(6,"ll", 6,4);
        Coristas c2= new Coristas(5,"eli", 666, 5);
        Coristas c3=new Coristas(3, "eli", 666, 5);
        Coristas c4=new Coristas(2,"kk",5,6);
        
        CoroHileras coro2 = new CoroHileras(2, 2, "ARI", dir1);
        
        coro2.agregarCorista(c1);
        coro2.agregarCorista(c2);
        coro2.agregarCorista(c3);
        coro2.agregarCorista(c4);
        
        System.out.println(coro2.toString());
    }
    
}
