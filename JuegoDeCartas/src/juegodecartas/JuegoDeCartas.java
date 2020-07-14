/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas;

import juegodecartas.baraja.Baraja;
import juegodecartas.baraja.Carta;

/**
 *
 * @author luiss
 */
public class JuegoDeCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carta carta1 = new Carta(10,"Basto");
        carta1.getNumero();
        System.out.println(carta1.getNumero()+" de "
                +carta1.getPalo());
        
        Baraja b =  new Baraja();
        for(int i = 0; i<50; i++){
            System.out.println(b.cartas[i].getNumero() + " de "+
                    b.cartas[i].getPalo());
        }
    }
    
}
