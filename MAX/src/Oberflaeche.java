import java.util.concurrent.ThreadLocalRandom;//@author Philipp Hermann

public class Oberflaeche {
	static Feld[][] spielFeldArray = new Feld[8][8];		//Ein zweidimensionales Array für Feld OBjekte wird erstellt

	public static void initialisiereSpielfeld() {		// Methode um Array mit Feld-Instanzen zu füllen

		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				spielFeldArray[x][y] = new Feld(x, y);
			}
		}
	}

	public static void initialisiereSpieler(Spieler eins, Spieler zwei) {	// Methode um Spieler auf Feld zu setzten
		int startPos = ThreadLocalRandom.current().nextInt(1, 5);	// Es wird in 4 Möglichkeiten unterschieden wie die Spieler starten können, 
		switch (startPos) {											// es wird eine zufällige Zahl gebildet und je nach Zahl die Spieler aufgestellt	
		case 1:
			eins.setzeX(3);
			eins.setzeY(3);
			spielFeldArray[3][3].spielerAufFeld("W");
			zwei.setzeX(4);
			zwei.setzeY(4);
			spielFeldArray[4][4].spielerAufFeld("B");
			break;
		case 2:
			eins.setzeX(4);
			eins.setzeY(3);
			spielFeldArray[4][3].spielerAufFeld("W");
			zwei.setzeX(3);
			zwei.setzeY(4);
			spielFeldArray[3][4].spielerAufFeld("B");
			break;
		case 3:
			eins.setzeX(3);
			eins.setzeY(4);
			spielFeldArray[3][4].spielerAufFeld("W");
			zwei.setzeX(4);
			zwei.setzeY(3);
			spielFeldArray[4][3].spielerAufFeld("B");
			break;
		case 4:
			eins.setzeX(4);
			eins.setzeY(4);
			spielFeldArray[4][4].spielerAufFeld("W");
			zwei.setzeX(3);
			zwei.setzeY(3);
			spielFeldArray[3][3].spielerAufFeld("B");
			break;
		}
		aktualisiereSpielfeld();
	}

	public static void aktualisiereSpielfeld() {		// Methode um das Spielfeld darzustellen
		System.out.println("Zug: "+ Steuerung.zugZahl);
		for (int y = 0; y < 8; y++) {
			for (int x = 0; x < 8; x++) {
				if (spielFeldArray[x][y].besetzt == false) {
					System.out.print(spielFeldArray[x][y].darstellen());
				} else {
					System.out.print("  " + spielFeldArray[x][y].aktuelleSpielerFarbe + "   ");
				}
				if (x == 7)		//Nach 8 Brüchen wird eine neue Zeile begonnen
					System.out.println();
			}
		}
		System.out.println("");
	}

	public static void bewegungsVerarbeitung(Spieler spieler1, Spieler spieler2) throws Exception { 	// Methode für einen Schritt eines Spielers
		boolean weiter = true;
		while (weiter) {	//Eingabe wird in einer Schleife geprüft
			
			String Eingabe = IOmax.promptAndRead("Spieler " + spieler1.farbe + ", bitte geben Sie ein, in welche Richtung Sie laufen wollen:  ");
			
			switch (Eingabe.toLowerCase()) {	//Eingabe umgewandelt in lowercase, Switch case für alle möglichen eingaben
			
			case "n":							//Cases für n,o,s,w um den Spieler in eine Richtung zu bewegen
				if (spieler1.yKor != 0) {		//Es wird überprüft ob der Spieler am obersten Rand des Feldes ist
					if (pruefeKollision(spieler1.xKor, spieler1.yKor - 1)) {	// Methode um zu überprüfen ob auf dem Zielfeld ein Spieler steht
						bewegung(spieler1, spieler2,0,-1);
						weiter = false;			//Schleife wird beendet und anderer Spieler ist dran
						
					} else {
						System.out.println("Dort ist bereits ein Spieler. \n");
					}
				} else {
					System.out.println("Ende des Spielfelds.Ungültige Eingabe. \n");
					
				}
				break;
				
			case "o":
				if (spieler1.xKor != 7) {
					if (pruefeKollision(spieler1.xKor + 1, spieler1.yKor)) {

						bewegung(spieler1, spieler2,1,0);
						weiter = false;
					} else {
						System.out.println("Dort ist bereits ein Spieler. \n");
					}
				} else {
					System.out.println("Ende des Spielfelds.Ungültige Eingabe. \n");
				}
				break;
				
			case "s":
				if (spieler1.yKor != 7) {
					if (pruefeKollision(spieler1.xKor, spieler1.yKor + 1)) {

						bewegung(spieler1, spieler2,0,1);
						weiter = false;
					} else {
						System.out.println("Dort ist bereits ein Spieler. \n");
					}
				} else {
					System.out.println("Ende des Spielfelds.Ungültige Eingabe. \n");
				}
				break;
				
			case "w":
				if (spieler1.xKor != 0) {
					if (pruefeKollision(spieler1.xKor - 1, spieler1.yKor)) {

						bewegung(spieler1, spieler2,-1,0);
						weiter = false;
					} else {
						System.out.println("Dort ist bereits ein Spieler. \n");
					}
				} else {
					System.out.println("Ende des Spielfelds.Ungültige Eingabe. \n");
				}
				break;
			case "beenden":			//Spieler kann durch eingabe von beenden das Spiel beenden
				Steuerung.weiterSpielen = false;
				weiter = false;
				System.out.println("Spiel beendet.");
				break;
			default:
				System.out.println("Ungültige Eingabe! \n");
			}
		}
	}

	public static boolean pruefeKollision(int xKor, int yKor) {	//Methode prüft ob ein Spieler auf Feld ist
		if (spielFeldArray[xKor][yKor].besetzt == true) {
			return false;
		} else
			return true;
	}
	public static void bewegung(Spieler spieler1, Spieler spieler2, int xRichtungsWert, int yRichtungsWert) {	//Methode für die eigentliche Bewegung und die Folgen dieser Bewegung
		spielFeldArray[spieler1.xKor+ xRichtungsWert][spieler1.yKor +yRichtungsWert].spielerAufFeld(spieler1.farbe);	//Methoden für Veränderung von den Feldern
		spielFeldArray[spieler1.xKor][spieler1.yKor].spielerVonFeld();
		
		spieler1.xKor = spieler1.xKor + xRichtungsWert; 	// Koordinate von Spieler wird geändert
		spieler1.yKor = spieler1.yKor + yRichtungsWert;	
		
		spieler1.istDran = false;			
		spieler2.istDran = true;
		
		aktualisiereSpielfeld();
		Steuerung.punkteRechner(spieler1, spielFeldArray[spieler1.xKor][spieler1.yKor]);	//Methoden für spielfeld aktualisierung und Punkteberechnung
	}
}
