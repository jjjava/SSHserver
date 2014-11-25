package libs;

import java.io.PrintWriter;

/**
 *
 * @author bp12214
 */
public class Commands {

    public Commands() {
    }

    public static void getHome(PrintWriter writer) {
        writer.println(System.getProperty("user.home"));
    }

    public static void getUserName(PrintWriter writer) {
        writer.println(System.getProperty("user.name"));
    }
    public static void getUserDir(PrintWriter writer) {
        writer.println(System.getProperty("user.dir"));
    }

    public static void getJavaHome(PrintWriter writer) {
        writer.println(System.getProperty("java.home"));
    }

    public static void getJavaVersion(PrintWriter writer) {
        writer.println(System.getProperty("java.version"));
    }

    public static void getOSArc(PrintWriter writer) {
        writer.println(System.getProperty("os.arch"));
    }

    public static void getOSVersion(PrintWriter writer) {
        writer.println(System.getProperty("os.version"));
    }

    public static void getOSName(PrintWriter writer) {
        writer.println(System.getProperty("os.name"));
    }
    public static void getNumberOfProcessors(PrintWriter writer) {
        writer.println(Runtime.getRuntime().availableProcessors());
        
    }
}
