/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas;

import juegodecartas.baraja.Baraja;
import juegodecartas.baraja.Carta;
import 

/**
 *
 * @author luiss
 */
public class Jugador {
    private String nomUsuario = "";
    
    public Jugador(String nombre){
        this.nomUsuario = nombre;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }
    
    public void barajar(Baraja baraja){
        Carta barajada;
        for (int i = 0; i < 50; i++) {
            
        }
    }
}
