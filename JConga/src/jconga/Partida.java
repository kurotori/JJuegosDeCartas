/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jconga;

import java.util.ArrayList;

/**
 *
 * @author sebastian
 */
public class Partida {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    
    private Jugador creador;
    private String nombre;
    private String id;
    
    public Partida(Jugador j, String nombre){
        //this.id = 
        this.jugadores.add(j);
        this.creador = j;
        System.out.println(this.creador.getNombre()+" ha creado la partida ");
    }
    
    public void AgregarJugador(Jugador j){
        jugadores.add(j);
        System.out.println("Se ha agregado a "+j.getNombre()+" a la partida '"+this.nombre+"'");
        System.out.println("Ahora hay "+jugadores.size()+" en la partida '"+this.nombre+"'");
    }
}
