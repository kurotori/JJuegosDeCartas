/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import herramientas.Configuracion;


/**
 *
 * @author luiss
 */
public class JConga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Inicialización de clases auxiliares.

        herramientas.Configuracion configuracion = new Configuracion();
        configuracion.ChequeoInicial();
        
        
        
        Base b = new Base();
        b.setVisible(true);
       
    }
    
}
