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
    
    private int numero = 0;
    private String palo = "";
    
    //Método Constructor
    public Carta(int numero,String palo){
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * Devuelve el número de la carta
     * @return el número de la carta
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Devuelve el palo de la carta
     * @return el palo de la carta
     */
    public String getPalo() {
        return palo;
    }
    
    public String RutaImagen(){
        String ruta = "imagen/baraja/"+palo+numero+".png";
        return ruta;
    }
    
    
}
