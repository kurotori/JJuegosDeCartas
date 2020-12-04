/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import baraja.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author luiss
 */
public class JuegoDeCartas {
    
    private ArrayList<Carta> juego = new ArrayList<>();
    
    public JuegoDeCartas(ArrayList<Carta> cartas){
        
    }
    
    private void OrdenarCartas(){
        Collections.sort(juego);
    }
}
