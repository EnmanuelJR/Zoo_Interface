/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lds
 */
public class Gato extends Felino implements Mascota, Poderes {
    
    @Override
    public void comer(){
        System.out.println("El gato esta comiendo");
    }
    
    @Override
    public void deambular(){
        System.out.println("El gato esta deambulando");
    }

    @Override
    public void SerAmigable() {
        System.out.println("El gato esta siendo Amigable");
    }

    @Override
    public void Jugar() {
        System.out.println("El gato esta Jugando");
    }

    @Override
    public void SerInvisible() {
        System.out.println("El gato esta Siendo Invisible");
    }

    @Override
    public void Volar() {
        System.out.println("El gato esta volando");
    }
    
}
