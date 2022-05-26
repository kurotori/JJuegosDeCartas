
package jconga.red;

/**
 *
 * @author luiss
 */

import java.io.IOException;
//import javax.websocket.*;
//import javax.websocket.server.*;
import java.net.*;
import java.io.*;


/* Código de la prueba con websocket
@ServerEndpoint(
        value = "/jconga/{id_partida}",
        encoders = MessageEncoder.class,
        decoders = MessageDecoder.class
        )
*/

public class Servidor {
    
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
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

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    
    public static void main(String[] args) throws IOException {
        Servidor server=new Servidor();
        server.start(6666);
    }
    
    /* Código de la prueba con websocket
    @OnOpen
    public void onOpen(Session session) throws IOException {
        // Get session and WebSocket connection
    }

    @OnMessage
    public void onMessage(Session session, Message message) throws IOException {
        // Handle new messages
    }

    @OnClose
    public void onClose(Session session) throws IOException {
        // WebSocket connection closes
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }
*/
    
}
