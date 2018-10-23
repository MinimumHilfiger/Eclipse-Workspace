package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah

import java.io.*;

public class Janus {

	public static void main(String[] args) throws IOException {
		
		String zeile="";	// Variable in der die Zeile des Codes gespeichert wird
		
		File janus_code = new File("E:\\Eclipse Workspace\\Dopple\\Vorlesung_3\\v3_Package\\Janus.java");	//File Object für die Datei Janus.java wird erstellt
		
		System.out.println("Existiert diese Datei? " + janus_code.exists());		// Es wird geprüft ob diese Datei existiert
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(janus_code))); 	// Alle Notwendigen Objekte zum Lesen von Dateien in einer Zeile erstellt
		
		
		while(zeile != null) {
			zeile = reader.readLine();			//Zeile wird gelesen
			System.out.println(zeile);			//Zeile wird ausgegeben
		}
		reader.close();							//Reader wird geschlossen
}
}
