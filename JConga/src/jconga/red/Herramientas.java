/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jconga.red;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luiss
 */
public class Herramientas {
    
    private ArrayList<InterfazRed> interfacesRed = new ArrayList<>();
    /**
     * Interfaz de red seleccionada para las operaciones
     */
    private int interfazElegida = 0;
    
    
    
    
    /***
     * Permite completar el listado de interfaces de red disponibles en el sistema.
     * Nota: solo agrega las interfaces detectadas como activas y que no sean bucles locales.
     */
    public void ListarInterfacesDeRed(){
        
        try {
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            
            while(interfaces.hasMoreElements()){
                NetworkInterface interfaz = (NetworkInterface) interfaces.nextElement();
                InterfazRed intRed = new InterfazRed(interfaz);
                
                if (intRed.getEsUsable()) {
                    interfacesRed.add(intRed);
                }
            }
            
            if (!interfacesRed.isEmpty()) {
                System.out.println("Se encontraron "+interfacesRed.size()+" interfaces de red:");
                for (InterfazRed intfaz : interfacesRed) {
                    System.out.println( interfacesRed.indexOf(intfaz)+ " - "+intfaz.getInterfaz().getDisplayName());
                }
            } else {
                System.out.println("No hay interfaces de red activas");
            }
        } 
        catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public NetworkInterface obtenerInterfazElegida(){
        return interfacesRed.get(interfazElegida).getInterfaz();
    }
    
    //public 
    
}
