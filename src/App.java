import java.io.File;
import java.util.Scanner;

public class App {
    public static String[] words;

    public static void main(String[] args) throws Exception {
        f0();
        f1();
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


    public static void f1(){
        String frstwrd = words[1];
        int i=0;
        char onechar;
        int ascii=0;
        while (i<frstwrd.length()){
            onechar = frstwrd.charAt(i);
            ascii =ascii + (int) onechar;
        }
        System.out.println(ascii);
    }


}
