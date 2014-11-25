
package libs;

import java.io.PrintWriter;

/**
 *
 * @author bp12214
 */
public class Help {
    
    public static void getHelp(PrintWriter writer){
        
        writer.println("$ para comandos MSDOS");
        writer.println("! para comandos HS");
        writer.println("--------------------------------------------------------");
        writer.println("--------------------USUARIO-----------------------------");
        writer.println("--------------------------------------------------------");
        writer.println("username - Nome do usuario logado.");
        writer.println("userhome - Caminho do diretorio do usuario logado.");
        writer.println("userdir  - Caminho do diretorio de trabalho.");
        writer.println("--------------------------------------------------------");
        writer.println("-----------------------JAVA-----------------------------");
        writer.println("--------------------------------------------------------");
        writer.println("javahome - Caminho do diretorio de instalcao do JAVA.");
        writer.println("javaversion - Versao do JAVA.");
        writer.println("--------------------------------------------------------");
        writer.println("-------------------------OS-----------------------------");
        writer.println("--------------------------------------------------------");
        writer.println("osname    - Nome do sistema operacional.");
        writer.println("osversion - Versao do sistema operacional.");
        writer.println("osarch    - Arquiterura do sistema operacional.");
        writer.println("osproc    - Processadores disponiveis.");
    }
}
