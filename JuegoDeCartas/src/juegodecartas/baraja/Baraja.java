/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas.baraja;

import juegodecartas.herramientas.Azar;

/**
 *
 * @author luiss
 */
public class Baraja {
    public Carta[] cartas = new Carta[50];
    private String[] palos = {"Oro","Espada","Copa","Basto"};
    
    private Azar utilesAzar = new Azar();
    
    public Baraja(){
        int idCarta = 0; //Sirve para mostrar la posicion en la
                         // lista
        
        while(idCarta < 50 ){
            if(idCarta <= 47){
                for(int p = 0;p < 4;p++){
                    String palo = palos[p];
                    for(int numero = 1;numero < 13;numero++){
                        Carta nuevaCarta = new Carta(numero,palo);
                        this.cartas[idCarta] = nuevaCarta;
                        idCarta++;
                    }
                }
            }
            else{
                Carta nuevaCarta = new Carta(0,"Comodín");
                this.cartas[idCarta] = nuevaCarta;
                idCarta++;
            }
        }
    }
    
    
    public void MostrarBaraja(){
        
        System.out.println("Cartas de la baraja:");
        System.out.println("--------------------");
        
        for(int idCarta = 0; idCarta<50; idCarta++){
            
            int numero = this.cartas[idCarta].getNumero();
            String palo = this.cartas[idCarta].getPalo();
            
            System.out.println(numero + " de " + palo);
        }
        
        System.out.println("--------------------");
    }
    
    
    
}
