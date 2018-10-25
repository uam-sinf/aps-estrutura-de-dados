package plataforma.fundos.de.investimento;

//import java.io.IOException;

public final class Utils {
    public static void ClearConsole() {
        /* try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        } */
        
        /* System.out.print("\033[H\033[2J");  
        System.out.flush(); */
        
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }
}
