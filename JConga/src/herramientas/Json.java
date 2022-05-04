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
    
    public JSONObject LeerJson(Path archivoJson){
        String datosJson = archivo.LeerArchivo(archivoJson);
        JSONObject resultado = new JSONObject(datosJson);
        return resultado;
    }
    
    
    
}
