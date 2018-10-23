package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Filter {

	public static void main(String[] arg) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine URL ein.");
		String url = sc.nextLine();
		
		System.out.println("Bitte geben Sie ein Muster ein.");
		String muster = sc.nextLine();
		String aktuelleZeile;
		
		URL u = new URL(url);			//https://www.whitehouse.gov/
		FilterInputStream ins = (FilterInputStream) u.openStream();
		InputStreamReader isr = new InputStreamReader(ins);
		BufferedReader website = new BufferedReader(isr);
		
		aktuelleZeile = website.readLine();		//die erste Zeile der Website wird gespeichert
		
		while(aktuelleZeile != null) {				//Solange "noch Zeilen der Website übrig sind" wird überprüft, ob die Zeilen das gesucht Muster enthalten
			if(aktuelleZeile.contains(muster)) {
				System.out.println(aktuelleZeile);
			}
		aktuelleZeile = website.readLine();
		
		}
		sc.close();	
	}

}
