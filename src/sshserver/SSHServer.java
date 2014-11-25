package sshserver;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author bp12214
 */
public class SSHServer {

    public static ServerSocket server = null;
    public static Socket incoming = null;

    public SSHServer() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int port = 8080;
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("-port")) {
                if (args[1].length() > 0) {
                    port = Integer.parseInt(args[1]);
                }
            }
        } else {
            try {
                server = new ServerSocket(port);
            } catch (Exception e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    System.out.println("> Server v1.0 running...");
                    System.out.println("> Server listening on port: " + port);
                    incoming = server.accept();
                    System.out.println("Client IP: " + incoming.getInetAddress());
                    new Session(incoming).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}