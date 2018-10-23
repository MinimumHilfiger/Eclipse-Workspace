package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah
import java.util.Scanner;
import java.io.*;

public class PalindromGenerator {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie Ihr erstes Wort ein:");
        String wort1  = sc.nextLine();
        System.out.println("Geben Sie Ihr zweites Wort ein");
        String wort2  = sc.nextLine();
        sc.close();

        PrintStream Palingen = new PrintStream ( new FileOutputStream(new File("PalimdromGenerator.txt")));

        System.out.println(wort1 + wort2 + invert(wort2) + invert(wort1));		//5 verschiedene Arten aus 2 Wörtern ein Palindrom zu bilden
        Palingen.println(wort1 + wort2 + invert(wort2) + invert(wort1));		

        System.out.println(wort2 + wort1 + invert(wort1) + invert(wort2));
        Palingen.println(wort2 + wort1 + invert(wort1) + invert(wort2));

        System.out.println(wort1 + invert(wort2) + wort2 + invert(wort1));
        Palingen.println(wort1 + invert(wort2) + wort2 + invert(wort1));

        System.out.println(wort2 + invert(wort1) + wort1 + invert(wort2));
        Palingen.print(wort2 + invert(wort1) + wort1 + invert(wort2));

        System.out.println(invert(wort1)+ invert(wort2) + wort2 + wort1);
        Palingen.println(invert(wort1)+ invert(wort2) + wort2 + wort1);
        
        Palingen.close();

    }
     public static String invert(String x)    //Invertierungsmethode
        {
        return x.length()<= 1 ? x : invert(x.substring(1)) + x.substring(0, 1);
        }
}