/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jconga.red;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luiss
 */
public class Cliente {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    
    public void ListarInterfacesDeRed(){
        
        try {
            Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
            while(interfaces.hasMoreElements()){
                NetworkInterface interfaz = (NetworkInterface) interfaces.nextElement();
                Enumeration direccionesIP = interfaz.getInetAddresses();
                System.out.println("Interfaz: "+ interfaz.getDisplayName());
                while(direccionesIP.hasMoreElements()){
                    InetAddress dir = (InetAddress) direccionesIP.nextElement();
                    System.out.println("IP: " + dir.getHostAddress());
                }
            }
        } catch (SocketException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void DatosRed() throws SocketException{
        try {
            InetAddress iplocal = InetAddress.getLocalHost();
            //NetworkInterface datoRed = NetworkInterface.getByInetAddress(iplocal);
            //short mascara = datoRed.getInterfaceAddresses().get(0).getNetworkPrefixLength();
            String ip = iplocal.getHostAddress();
            
            System.out.println(ip);//"IP:"+ip+"/"+mascara);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String ipRed() throws SocketException{
        String ip = "";
        try {
            InetAddress iplocal = InetAddress.getLocalHost();
            NetworkInterface datoRed = NetworkInterface.getByInetAddress(iplocal);
            short mascara = datoRed.getInterfaceAddresses().get(0).getNetworkPrefixLength();
            ip = iplocal.getHostAddress();
            
            System.out.println("IP:"+ip+"/"+mascara);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ip;
    }

    
    public void escanearRed(){
        System.out.println("Escaneando red...");
        try {
            String dirIp = ipRed();
            String[] sCompIp = dirIp.split("[.]");
            int compIp = Integer.parseInt(sCompIp[3]);//int[] compIp = {0,0,0,0};
            
            String ipServidor = sCompIp[0]+"."+sCompIp[1]+"."+sCompIp[2]+".";
            
            for(int i = 1; i<255; i++){
                if (i != compIp) {
                    try {
                        iniciarConexion(ipServidor+i, 6666);
                    } catch (IOException e) {
                        System.out.println("Servidor no encontrado en "+ipServidor+i);
                    }
                    
                }
            }
            
            /*
            for (int i = 0; i<4; i++) {
                System.out.println(ip[i]);
                compIp[i] = Integer.parseInt(ip[i]);
                
            }
            String comienzo = 
            */
            
        } catch (SocketException e) {
        }
        
        
        //int[4] componentesIp =  
    }
    
    
    public void iniciarConexion(String ip, int port) throws IOException {
        try {
            
            clientSocket = new Socket(ip, port);
            clientSocket.connect(new InetSocketAddress(ip, port), 500);
            /*out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));*/
            
        } 
        catch (IOException e) {
            System.out.println("ERROR: Sin Conexión en "+ip+" - "+e.getMessage());
        }
        
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
}
