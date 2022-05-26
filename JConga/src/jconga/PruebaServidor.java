/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jconga;

import java.io.IOException;
import jconga.red.Cliente;
import jconga.red.Servidor;

/**
 *
 * @author luiss
 */
public class PruebaServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*        
        switch (args[0]) {
            case "servidor" -> {*/
                System.out.println("Iniciando servidor");
                Servidor servidor = new Servidor();
                servidor.start(6666);
            /*}
            case "cliente" -> {
                System.out.println("Iniciando cliente");
                Cliente client = new Cliente();
                client.startConnection("127.0.0.1", 6666);
                String response = client.sendMessage("hello server");
                System.out.println("Respuesta recibida:" + response);
//assertEquals("hello client", response);
            }
            default -> throw new AssertionError();
        }*/
    }
    
}
