//Sruscht Abdallah
//08.10.2018
//Aufgabe: Die Buchstaben aus einer Eingabe verdoppeln.

import java.util.Scanner;


public class Dopple {
	public static void main(String[] args) {
		System.out.println("Geben Sie Ihren Text zum verdoppeln ein:");
		Scanner sc = new Scanner(System.in);
		
		String wort1  = sc.nextLine();
		wort1 = Dopple.dopple(wort1);		//Die Methode dopple wird mit dem String in wort1 aufgerufen und das Ergebnis in wort 1 gespeichert
		System.out.println(wort1);
		
		sc.close();
		
	}

	public static String dopple (String x) {
		System.out.println(x);
		return x.length()==0 ? x : x.substring(0,1) + x.substring(0,1) + dopple(x.substring(1));		
		}	
}
