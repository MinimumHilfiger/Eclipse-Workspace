package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromTest {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr;
		BufferedReader keyboard;
		String inputLine;
		isr = new InputStreamReader(System.in);
		keyboard = new BufferedReader(isr);
		
		System.out.println("Bitte geben Sie ein Wort ein um zu sehen ob es ein Palindrom ist.");
		
		inputLine = keyboard.readLine();	//Eingabe wird gespeichert
		
		inputLine=inputLine.toLowerCase();	//Eingabe wird zu lowercase gemacht
		
		String iLInverted = PalindromTest.invert(inputLine);	//Eingabe wird invertiert und in neuer Variable gespeichert
		System.out.println(iLInverted);
		
		if (inputLine.equals(iLInverted)) {			//If abfrage ob Eingabe und invertierte Eingabe identisch sind
			
			System.out.println("Das eingegebene Wort ist ein Palindrom!");
			
		} else {

			System.out.println("Das eingegebene Wort ist kein Palindrom!");

		}
		
		
	}
	public static String invert(String x)	//Invertierungsmethode
	{
	return x.length()<= 1 ? x : invert(x.substring(1)) + x.substring(0, 1);
	}
}
