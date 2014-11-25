package sshserver;

import java.io.*;
import javax.annotation.processing.Processor;

/**
 *
 * @author bp12214
 */
public class Handler {

    public Handler() {
    }

    public static void doCMD(String cmd, PrintWriter writer) {
        StringBuffer buffer = new StringBuffer();
        String out = null;
        String res[] = null;
       
        
        
        Process processo = null;
        try {
            processo = Runtime.getRuntime().exec(cmd);
            System.out.println("CMD:" + cmd);
            InputStream in = processo.getInputStream();
            BufferedReader entrada = new BufferedReader(new InputStreamReader(in));

            while (entrada.readLine() != null) {
                System.out.println("" + entrada.readLine());
                writer.println(entrada.readLine());
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            processo.destroy();
        } catch (Exception ex) {
            ex.printStackTrace();
            processo.destroy();
        }
    }
}
