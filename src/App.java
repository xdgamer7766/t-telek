import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static String[] words;

    public static void main(String[] args) throws FileNotFoundException {
        f0(); //TODO: handle null pointer expection
        f1();
        f2();
        f3();
        f5();
    }

    public static void f0() throws FileNotFoundException {
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


    public static void f2(){
        int ewrd=0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(1) == 'e'){
                ewrd++;
            }
        }
        System.out.println(ewrd);
    }


    public static void f3(){
        boolean a=true;
        int i=0;
        String wrd;
        while(a){
            wrd = words[i];
            if(wrd == "ostor") {
                System.out.println("Az ostor szó szerepel a fájlban \n Hányadik elem a fájlban :");
                System.out.println(i);
                a=false;
            }
            if(wrd == "ostoros") {
                System.out.println("Az ostor szó szerepel a fájlban \n Hányadik elem a fájlban :");
                System.out.println(i);
                a=false;
            }
            i++;
        }
        if(a){
            System.out.println("Egyik szó sem található meg");
        }
    }


    public static void f5(){
        try {
            File f = new File("masolat.txt");
            f.createNewFile();
            
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          for (int i = 0; i < words.length; i++) {
              String wrd = "";
              
              wrd = wrd.substring(0,1).toUpperCase() + wrd.substring(1).toLowerCase();
              try {
                  FileWriter wrtr = new FileWriter("masolat.txt");
                  wrtr.write(wrd);
              } catch (Exception e){}
          }
    }


}
