/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import herramientas.Archivo;

/**
 *
 * @author luiss
 */
public class JConga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        herramientas.Archivo archivo = new Archivo();
        String crearArchivoConf = archivo.CrearArchivo("./", "configuracion.json");
        System.out.println(crearArchivoConf);
        Base b = new Base();
        b.setVisible(true);
    }
    
}
