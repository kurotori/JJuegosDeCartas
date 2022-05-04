/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import herramientas.Archivo;
import herramientas.Json;
import java.io.File;
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
        // TODO code application logic here
        herramientas.Archivo archivo = new Archivo();
        herramientas.Json json = new Json();
        
        
        
        String crearArchivoConf = archivo.CrearArchivo("./", "configuracion.json");
        Path archConfig = Path.of(crearArchivoConf);
        //System.out.println(archivo.LeerArchivo(archConfig));
        JSONObject configuracion = json.LeerJson(archConfig);
        
        System.out.println(configuracion.toString());
        //System.out.println(crearArchivoConf);
        
        
        for (String clave : configuracion.keySet()) {
            System.out.print(clave + ":");
            System.out.println(configuracion.get(clave));
        }
        
        Base b = new Base();
        b.setVisible(true);
    }
    
}
