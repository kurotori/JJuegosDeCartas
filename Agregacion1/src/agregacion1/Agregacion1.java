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
public class Agregacion1 {
    
    static LeerMostrar leerYMostrar = new LeerMostrar();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {            
        String mensaje = leerYMostrar.leerTeclado();
        leerYMostrar.Mostrar(mensaje);
    }
    
}
