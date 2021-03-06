package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class FileMirror2 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr;
		BufferedReader keyboard;
		String pfad1,pfad2;
		isr = new InputStreamReader(System.in);
		keyboard = new BufferedReader(isr);	
		
		System.out.println("Bitte geben Sie den Pfad der zu kopierenden Datei ein."); //E:\\Eclipse Workspace\\Dopple\\Vorlesung_3\\v3_Package\\FileMirror.java
		pfad1 = keyboard.readLine();
		System.out.println("Bitte geben Sie den Pfad ein, wo die Datei hinkopiert werden soll.");
		pfad2 = keyboard.readLine();
		
	String zeile="";
		
	File fileMirror_code = new File (pfad1); 
	File file2 = new File (pfad2);
	
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileMirror_code))); // Alle Notwendigen Objekte zum Lesen von Dateien in einer Zeile erstellt
	//OutputStream outStream = new FileOutputStream(file2);		//Outputstream zum schreiben der ivertierten Datei
	PrintStream writer = new PrintStream(new FileOutputStream(file2));	
	
	while(zeile != null) {
		zeile = reader.readLine();			//Zeile wird gelesen
		String zeileInverted = FileMirror.invert(zeile);	//Zeile wird invertiert
		System.out.println(zeileInverted);					//Invertierte Zeile wird ausgegeben 
		writer.println(zeileInverted);		//Invertierte Zeile wird in  invertedFileMirror.txt geschrieben
		
	}
	reader.close();
	writer.close();
	}
	
	public static String invert(String x)		//Invert Methode
	{
	return x.length()<= 1 ? x : invert(x.substring(1)) + x.substring(0, 1);
	}

}
