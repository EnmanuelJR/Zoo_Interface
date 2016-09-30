/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perro p = new Perro();
       p.deambular();
        System.out.println("");
       p.comer();
        System.out.println("");
       p.Jugar();
        System.out.println("");
       p.SerAmigable();
        System.out.println("");
       Gato g = new Gato();
       g.deambular();
        System.out.println("");
       g.comer();
        System.out.println("");
       g.SerAmigable();
        System.out.println("");
       g.Jugar();
        System.out.println("");
       
       p.SerInvisible();
       p.Volar();
        System.out.println("");
        
       g.SerInvisible();
       g.Volar();
        System.out.println("");
        
        Leon l = new Leon();
        l.SerInvisible();
        l.Volar();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Por: Jorge Enmanuel Rodriguez");
       
       
       
    }
    
}
