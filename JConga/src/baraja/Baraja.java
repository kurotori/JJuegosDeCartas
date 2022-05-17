/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja;

//import herramientas.Azar;
import java.util.ArrayList;

/**
 *
 * @author luiss
 */
public class Baraja {
    
    public ArrayList<Carta> cartas = new ArrayList<>();
    
    /*enum Palos{
        ORO,
        ESPADA,
        COPA,
        BASTO
    }
    */
    
    private String[] palos = {"oro","espada","copa","basto"};
    
    
    
    public Baraja(){
        int idCarta = 0; //Sirve para mostrar la posicion en la
                         // lista
        
        while(idCarta < 50 ){
            if(idCarta <= 47){
                for(int p = 0;p < 4;p++){
                    String palo = palos[p];
                    for(int numero = 1;numero < 13;numero++){
                        Carta nuevaCarta = new Carta(numero,palo);
                        cartas.add(nuevaCarta);
                        //this.cartas[idCarta] = nuevaCarta;
                        idCarta++;
                    }
                }
            }
            else{
                Carta nuevaCarta = new Carta(0,"comodin");
                cartas.add(nuevaCarta);
                //this.cartas[idCarta] = nuevaCarta;
                idCarta++;
            }
        }
    }
    
    
    public void MostrarBaraja(){
        
        System.out.println("Cartas de la baraja:");
        System.out.println("--------------------");
        
        for(int idCarta = 0; idCarta<50; idCarta++){
            
            int numero = this.cartas.get(idCarta).getNumero();
            String palo = this.cartas.get(idCarta).getPalo();
            
            System.out.println(numero + " de " + palo);
        }
        
        System.out.println("--------------------");
    }
    
    
    
}
