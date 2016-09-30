/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Perro extends Canino implements Mascota, Poderes {
    
    @Override
    public void comer(){
        System.out.println("El Perro esta comiendo");
    }
    
    @Override
    public void deambular() {
        System.out.println("El Perro esta deambulando");
    }

    @Override
    public void SerAmigable() {
        System.out.println("El Perro esta siendo Amigable");
    }

    @Override
    public void Jugar() {
        System.out.println("El Perro esta jugando");
    }

    @Override
    public void SerInvisible() {
        System.out.println("El perro esta siendo invisible");
    }

    @Override
    public void Volar() {
        System.out.println("El perro esta volando");
    }
    
}
