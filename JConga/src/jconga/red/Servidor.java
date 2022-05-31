
package jconga.red;

/**
 *
 * @author luiss
 */

import java.io.IOException;

import java.net.*;
import java.io.*;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;


public class Servidor implements Runnable{
    
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private AtomicBoolean activo = new AtomicBoolean(false);
    private Thread hilo;
    
    
    private int port;
    
    public Servidor(int port){
        this.port = port;
    }
    
    
    public void start() throws IOException{
        hilo = new Thread(this);
        hilo.start();
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Servidor Iniciado. Ingrese 'detener' para cerrarlo");
        while (isActivo()) {            
            String comando = teclado.nextLine();
            if (comando.equals("detener")) {
                hilo.interrupt();
                detener();
            }
            else{
                System.out.println("mal escrito");
            }
        }
    }
    
    @Override
    public void run(){
        activo.set(true);
        try {
            iniciarServidor();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    public void iniciarServidor() throws IOException {
        System.out.println("Entrando a iniciar");
        
        //
        serverSocket = new ServerSocket(port);
        
        while (isActivo()) {
            System.out.println("corriendo");
            clientSocket = serverSocket.accept();
        
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
            String greeting = in.readLine();
            if ("hello server".equals(greeting)) {
                out.println("hello client");
                System.out.println("Se ha recibido un mensaje de:" + clientSocket.getInetAddress());
            }
            else {
                out.println("unrecognised greeting");
            }
        }
        
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    
    

    public void detener() throws IOException {
        System.out.println("Deteniendo...");
        activo.set(false);
       
            
    }
    
    /*public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        Servidor s1 = new Servidor(6666);
        s1.start();
        System.out.println("Servidor Iniciado. Ingrese 'detener' para cerrarlo");
        
        while (s1.isActivo()) {            
            String comando = teclado.nextLine();
            if (comando.equals("detener")) {
                s1.interrupt();
                s1.detener();
            }
            else{
                System.out.println("mal escrito");
            }
        }
    }*/
    

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo.get();
    }
    
}
