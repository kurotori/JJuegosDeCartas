/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja;

/**
 *
 * @author luiss
 */
public class Carta implements Comparable<Carta> {
    private int numero = 0;
    private String palo = "";
    
    //Método Constructor
    public Carta(int numero,String palo){
        this.numero = numero;
        this.palo = palo;
    }
    
    public Carta(int numero){
        if(numero == 0){
            this.numero=numero;
            this.palo="vacia";
        }
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
    
    public String rutaImagen(){
        //String ruta = "imagen/baraja/"+palo+numero+"_ch.gif";
        String ruta = "imagen/baraja/"+palo+numero+".png";
        //System.out.println(ruta);
        return ruta;
    }
    
    private int getIntPalo(){
        int valor=0;
        switch(this.palo){
            case "oro": 
                valor = 0;
                break;
            case "espada": 
                valor = 1;
                break;
            case "copa": 
                valor = 2;
                break;
            case "basto": 
                valor = 2;
                break;
        }
        return valor;
    }
    
    @Override
    public int compareTo(Carta otraCarta){
        int comparacion = 0;
        if (this.palo.equals(otraCarta.palo)) {
            comparacion = Integer.compare(this.numero, otraCarta.getNumero());
        }
        else{
            comparacion = Integer.compare(this.getIntPalo(), otraCarta.getIntPalo());
        }
        
        return comparacion;
    }
}
