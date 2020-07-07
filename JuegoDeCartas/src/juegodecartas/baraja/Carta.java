/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas.baraja;

/**
 *
 * @author luiss
 */
public class Carta {
    
    public int numero = 0;
    public String palo = "";
    
    //Método Constructor
    public Carta(int numero,String palo){
        this.numero = numero;
        this.palo = palo;
    }
}
