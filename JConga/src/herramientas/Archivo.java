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
                System.out.println("Archivo " +archivo.getCanonicalPath()+" " + archivo.getName() + " ya existe");
                resultado = archivo.getCanonicalPath();
            }
            
        }
        catch(IOException error){
            resultado = "ERROR CrearArchivo: "+ error.getMessage();
        }

        return resultado;
    }
    
    /**
     * Permite leer el contenido de un archivo y pasarlo a una
     * variable de tipo String.
     * @param archivo La ruta completa hacia el archivo a leer.
     * @return El contenido del archivo.
     */
    public String LeerArchivo(Path archivo){
        String resultado = "";
        try {
            resultado = Files.readString(archivo);
        } catch (IOException error) {
            resultado = "ERROR LeerArchivo: " + error.getMessage() + 
                    error.toString();
        }
        return resultado;
    }
    
    //public void 
}
