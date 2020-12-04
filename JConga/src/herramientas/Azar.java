/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;
import java.util.Random;

/**
 *
 * @author luiss
 */
public class Azar {
    
    private Random alAzar = new Random();

    public int NumeroAlAzar(int limite){
        int numero = alAzar.nextInt(limite);
        
        return numero;
    }
    
}
