/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas;

import juegodecartas.baraja.Baraja;

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
        Baraja baraja = new Baraja();
        for(int i = 0; i<50;i++){
            System.out.println
        (baraja.cartas[i].palo + " - "+baraja.cartas[i].numero);
        }
    }
    
}
