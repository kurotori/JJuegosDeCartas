/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas;

import juegodecartas.baraja.Baraja;
import juegodecartas.baraja.Carta;
import juegodecartas.herramientas.Azar;


/**
 *
 * @author luiss
 */
public class Jugador {
    private String nomUsuario = "";
    
    private Azar utilesAzar =  new Azar();
    
    public Jugador(String nombre){
        this.nomUsuario = nombre;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }
    
    public void Barajar(Baraja baraja){
        System.out.println(this.nomUsuario + " esta barajando...");
        
        for(int idCarta = 0; idCarta<50; idCarta++){
            
            int posicion = utilesAzar.NumeroAlAzar(50);
            
            Carta carta1 = baraja.cartas[idCarta];
            Carta carta2 = baraja.cartas[posicion];
            
            baraja.cartas[idCarta] = carta2;
            baraja.cartas[posicion] = carta1;
        }
    }
    
    
    public void IniciarPartida(Jugador fulano){
        
    }
    
    public void IniciarPartida(){
        
    }
    
    
}
