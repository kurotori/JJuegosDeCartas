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
public class InterfazRed {
    private NetworkInterface interfaz;
    private ArrayList<Inet4Address> direccionesIP =  new ArrayList<>();
    private int ipElegida = 0;
    private boolean esUsable = false;
    
    
    public InterfazRed(NetworkInterface interfaz){
        this.interfaz = interfaz;
        
        try {
            if (!interfaz.isLoopback() && interfaz.isUp()) {
                esUsable = true;
                Enumeration dirsIP = interfaz.getInetAddresses();
                while(dirsIP.hasMoreElements()){
                      InetAddress dir = (InetAddress)dirsIP.nextElement();
                        
                    if(dir instanceof Inet4Address){
                        direccionesIP.add( (Inet4Address)dir );
                    }
                }
            }
            
        } catch (SocketException ex) {
            Logger.getLogger(InterfazRed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene la interfaz de red representada en este objeto
     * @return 
     */
    public NetworkInterface getInterfaz() {
        return interfaz;
    }
     
    
    /**
     * Devuelve el listado de direcciones IP de esta interfaz
     * @return 
     */
    public ArrayList<Inet4Address> getDireccionesIP() {
        return direccionesIP;
    }

    public void agregarIP(Inet4Address direccionIP) {
        this.direccionesIP.add(direccionIP);
    }

    public void elegirIp(int ip_ID) {
        this.ipElegida = ip_ID;
    }
    
    
    
}
