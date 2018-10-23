package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileMirror {

	public static void main(String[] args) throws IOException {
		
	String zeile="";
		
	File fileMirror_code = new File ("E:\\Eclipse Workspace\\Dopple\\Vorlesung_3\\v3_Package\\FileMirror.java");
	File file2 = new File ("invertedFileMirror.txt");
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileMirror_code))); // Alle Notwendigen Objekte zum Lesen von Dateien in einer Zeile erstellt
	OutputStream outStream = new FileOutputStream(file2);		//Outputstream zum schreiben der ivertierten Datei
		
	while(zeile != null) {
		zeile = reader.readLine();			//Zeile wird gelesen
		String zeileInverted = FileMirror.invert(zeile);	//Zeile wird invertiert
		System.out.println(zeileInverted);					//Invertierte Zeile wird ausgegeben 
		outStream.write(zeileInverted.getBytes());			//Invertierte Zeile wird in  invertedFileMirror.txt geschrieben
		
		
	}
	reader.close();
	outStream.close();
	}
	
	public static String invert(String x)		//Invert Methode
	{
	return x.length()<= 1 ? x : invert(x.substring(1)) + x.substring(0, 1);
	}

}
