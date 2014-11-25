package sshserver;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
//import java.util.Scanner;

/**
 *
 * @author bp12214
 */
public class Session extends Thread {

    private Socket socket = null;

    public Session(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            InputStream inps = socket.getInputStream();
            OutputStream outs = socket.getOutputStream();
            //Scanner in = new Scanner(inps);
            DataInputStream dis = new DataInputStream(inps);
            PrintWriter out = new PrintWriter(outs, true);
            out.println("> Connected to server...");
            boolean done = false;

            while (!done) {
                String line = dis.readUTF();

                if (line.trim().equalsIgnoreCase("exit")) {
                    done = true;
                    try {
                        dis.close();
                        dis = null;
                        inps.close();
                        outs.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (line.trim().startsWith("$")) {
                    out.println("> MS Command line ");
                    String aux = line.substring(2, line.length());
                    Handler.doCMD(aux, out);
                } else {
                    out.println("> Command not found...");
                    System.out.println("Command not found: "+line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
