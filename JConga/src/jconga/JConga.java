/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jconga;

import herramientas.Archivo;
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
        herramientas.Archivo archivo = new Archivo();
        herramientas.Json json = new Json();
        
        System.out.println("Creando o accediendo al archivo de configuración");
        String crearArchivoConf = archivo.CrearArchivo("./", "configuracion.json");
        System.out.println(crearArchivoConf);
        //System.out.println( System.getProperties() );
        
        String[] estadoConfig = crearArchivoConf.split(":");
        switch (estadoConfig[0]) {
            case "S":
                    System.out.println("caso S");
                break;
            case "N":
                    System.out.println("Agregando datos básicos al archivo");
                    JSONObject config = new JSONObject();
                    config.put("servidor", "nombre de ejemplo");
                    config.put("mensaje", "mensaje de ejemplo");
                    System.out.println(config.toString());
                    archivo.StringAArchivo( Path.of(estadoConfig[1]), "algo");
                break;
            case "E":
                System.out.println("caso E");
                break;
            default:
                throw new AssertionError();
        }
        
        /*Path archConfig = Path.of(crearArchivoConf);
        
        JSONObject configuracion = json.LeerJson(archConfig);
        
        System.out.println(configuracion.toString());
        
        
        
        for (String clave : configuracion.keySet()) {
            System.out.print(clave + ":");
            System.out.println(configuracion.get(clave));
        }
        
        Base b = new Base();
        b.setVisible(true);
       */
    }
    
}
