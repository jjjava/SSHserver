package libs;

import java.io.*;

/**
 *
 * @author bp12214
 */
public class Hfiles {

    public static void mkDir(String hs, PrintWriter writer) {
        System.out.println("mkdir: " + hs);
        String data[] = hs.split(" ");
        File file = new File(data[1] + "/" + data[2]);
        file.mkdir();
        writer.println("Diretorio criado.");
    }

    public static void lsDir(String hs, PrintWriter writer) {
        System.out.println("ls: " + hs);
        String data[] = hs.split(" ");
        File file = new File(data[1]);
        if (file.exists()) {
            if (file.isDirectory()) {

                String content[] = file.list();
                for (int k = 0; k < content.length; k++) {
                    writer.println(content[k]);
                }
            } else {
                writer.println("Nao e um diretorio.");
            }

        } else {
            writer.println("Diretorio nao existe.");
        }
    }

    public static void mkFile(String hs, PrintWriter writer) {
        System.out.println("mkfile: " + hs);
        String data[] = hs.split(" ");

        File file = new File(data[1] + ".txt");
        try {
            file.createNewFile();
            writer.println("Arquivo criado.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void readFile(String hs, PrintWriter writer) {
        System.out.println("readfile: " + hs);
        String line = "";
        String data[] = hs.split(" ");

        File file = new File(data[1]);
        System.out.println("Path file: " + file.getPath());
        System.out.println("File name: " + file.getName());

        try {
            FileReader f_reader = new FileReader(file.getAbsolutePath());
            BufferedReader buff_reader = new BufferedReader(f_reader);

            while ((line = buff_reader.readLine()) != null) {

                writer.println(line);

            }
            writer.println("Arquivo lido.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro readFile: " + e.getMessage());
        }
    }

    public static void writeFile(String hs, PrintWriter writer) {
        System.out.println("writefile: " + hs);

        String data[] = hs.split(" ");
        String text = data[2];
    
      
        File file = new File(data[1]);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(file);
            fos.write(text.getBytes());
            fos.close();
            writer.println("Arquivo escrito.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro writeFile: " + e.getMessage());
        }
    }
    
    public static void deleteFile(String hs, PrintWriter writer) {
        System.out.println("deletefile: " + hs);
        String data[] = hs.split(" ");
        File file = new File(data[1]);
        try {
            file.delete();
            writer.println("Arquivo deletado.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
