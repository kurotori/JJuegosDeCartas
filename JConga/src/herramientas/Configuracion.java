/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import java.nio.file.Path;
import org.json.JSONObject;

/**
 *
 * @author luiss
 */
public class Configuracion {
    private Archivo archivos = new Archivo();
    private Json json = new Json();
    
    public void ChequeoInicial(){
        System.out.println("Creando o accediendo al archivo de configuración");
        String crearArchivoConf = archivos.CrearArchivo("./", "configuracion.json");
        System.out.println(crearArchivoConf);
        //System.out.println( System.getProperties() );
        
        String[] estadoConfig = crearArchivoConf.split(";");
        JSONObject config;
        
        switch (estadoConfig[0]) {
            case "S":
                    System.out.println("caso S");
                    System.out.println("Datos del archivo de configuración:");
                    String datosJson = archivos.LeerArchivo(Path.of(estadoConfig[1]));
                    
                    config = json.LeerJson(datosJson);
                    
                    for (String clave : config.keySet()) {
                        System.out.print(clave + ":");
                        System.out.println(config.get(clave));
                    }
                break;
            case "N":
                    System.out.println("Agregando datos básicos al archivo");
                    config = new JSONObject();
                    config.put("servidor", "nombre de ejemplo");
                    config.put("mensaje", "mensaje de ejemplo");
                    System.out.println(config.toString());
                    archivos.StringAArchivo( Path.of(estadoConfig[1]), config.toString());
                break;
            case "E":
                System.out.println("caso E");
                break;
            default:
                throw new AssertionError();
        }
    }
}
