/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion1;

/**
 *
 * @author Sebastian
 */

import java.util.Scanner;

public class LeerMostrar {
    Scanner teclado;
    
    public String leerTeclado(){
        teclado = new Scanner(System.in);
        String resultado = "";
        resultado = teclado.nextLine();
        return resultado;
    }
    
    public void Mostrar(String texto){
        System.out.println("--> "+texto);
    }
}
