import java.io.File;
import java.util.Scanner;

public class App {
    public static String[] words;

    public static void main(String[] args) throws Exception {
        f0();
    }


    public static void f0() throws Exception{
        File f = new File("szavak.txt");
        Scanner scr = new Scanner(f);
        int i = 0;
        while (scr.hasNextLine()){
            words[i] = scr.nextLine();
            i++;
        }
        scr.close();  
    }


}
