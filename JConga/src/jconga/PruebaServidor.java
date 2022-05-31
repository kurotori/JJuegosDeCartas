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
        
                System.out.println("Iniciando servidor");
                Servidor servidor = new Servidor(6666);
                servidor.start();
    }
    
}
