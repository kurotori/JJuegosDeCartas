/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author luiss
 */
import java.nio.file.Path;
import org.json.*;



public class Json {
    
    Archivo archivo = new Archivo();
    
    /**
     * Lee el contenido de un archivo en formato JSON y
     * devuelve su contenido en un objeto de clase JSONObject
     * @param archivoJson La ruta al archivo a leer.
     * @return Un objeto JSONObject con los datos del archivo.
     */
    public JSONObject LeerJson(Path archivoJson){
        String datosJson = archivo.LeerArchivo(archivoJson);
        JSONObject resultado = new JSONObject(datosJson);
        return resultado;
    }
    
    
    
}
