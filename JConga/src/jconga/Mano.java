/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jconga;

import baraja.Carta;
import java.util.ArrayList;

/**
 *
 * @author sebastian
 */
public class Mano {
    private ArrayList<Carta> cartas = new ArrayList<>();
    private ArrayList<ArrayList<Carta>> juegos = new ArrayList<>();
    

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
    
    public void AgregarCartaAMano(Carta carta){
        cartas.add(carta);
    }
    
    public void CrearJuego(ArrayList<Carta> juego){
        juegos.add(juego);
    }
    
    public int CantCartas(){
        return cartas.size();
    }
    
    public Carta TirarCarta(Carta carta){
        int pos = cartas.indexOf(carta);
        return cartas.remove(pos);
    }
}
