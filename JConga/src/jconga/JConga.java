/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import herramientas.Archivo;
import herramientas.Configuracion;
import herramientas.Json;
import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import org.json.JSONObject;

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
        
        
        /*
        Base b = new Base();
        b.setVisible(true);
       */
    }
    
}
