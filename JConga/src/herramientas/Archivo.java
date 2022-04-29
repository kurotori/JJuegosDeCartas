/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 *
 * @author luiss
 */
public class Archivo {
    
    /**
     * Permite crear un archivo en la ruta y con el nombre indicado, si ya
     * existe no lo sobreescribe.
     * 
     * @param ruta ruta en la cuál se creará el archivo.
     * @param nombre nombre del archivo a crear.
     * @return 
     */
    public String CrearArchivo(String ruta, String nombre){
        String resultado = "";

        try{
            File archivo = new File(ruta+nombre);
            if(!archivo.exists()){
                if(archivo.createNewFile()){
                    resultado = "Archivo created: " + archivo.getName();
                }
                
            }
            else{
                resultado = "Archivo " + archivo.getName() + " ya existe";
            }
            
        }
        catch(IOException error){
            resultado = error.getMessage();
        }

        return resultado;
    }
    
    public String LeerArchivo()
    
}
