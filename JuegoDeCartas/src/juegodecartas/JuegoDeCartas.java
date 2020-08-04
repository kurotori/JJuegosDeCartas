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
        
        Baraja b =  new Baraja();
        
        b.Barajar();
        b.MostrarBaraja();
    }
    
}
