import java.math.BigInteger;//@author Philipp Hermann

public class Steuerung {
	static boolean weiterSpielen = true;
	static int zugZahl;

	public static void main(String[] args) throws Exception {

		System.out.println(
				"Steuerung : Norden = n , Osten = o , Sueden = s , Westen = w , zum Beenden des spiels = beenden ");
		System.out.println("Gewinner des Spiels ist der, der zuerst mindestens 65 Punkte hat! ");

		Spieler weiss = new Spieler("W", true); // 2 Objekte der Spieler-Klasse werden erstellt
		Spieler schwarz = new Spieler("B", false);

		Oberflaeche.initialisiereSpielfeld(); // Spielfeld und Spieler werden initialisiert bzw dargestellt
		Oberflaeche.initialisiereSpieler(weiss, schwarz);

		while (weiterSpielen == true) { // Schleife fuer die wiederholende Ausfuehrung der Bewegungsmethode der Spieler
			if (weiss.istDran) { // laeuft solange bis jemand gewonnen hat oder das programm beendet wurde
				zugZahl++;
				Oberflaeche.bewegungsVerarbeitung(weiss, schwarz);
			} else {
				zugZahl++;
				Oberflaeche.bewegungsVerarbeitung(schwarz, weiss);
			}
		}
	}

	public static void punkteRechner(Spieler spieler, Feld feld) { // Methode fuer die Berechnung der Punktzahl

		if (spieler.erstesMal) { // Wenn das erste Mal auf ein Feld gesprungen wird ist die Berechnung der
									// Punktzahl
			spieler.zaehler = BigInteger.valueOf(feld.zaehler); // anders wie danach
			spieler.nenner = BigInteger.valueOf(feld.nenner);

			FractionMax punktZahl = new FractionMax(spieler.zaehler, spieler.nenner);
			punktZahl.kuerzen();
			punkteWiedergabe(punktZahl, spieler);
			spieler.erstesMal = false;

		} else { // Berechnung der Punkte nach dem ersten Zug
			FractionMax punktZahl = new FractionMax(spieler.zaehler, spieler.nenner); // Es wird eine neue Fraction aus
																						// den Werten der vorherigen
																						// Punktzahl gebildet
			FractionMax feldBruch = new FractionMax(BigInteger.valueOf(feld.zaehler), BigInteger.valueOf(feld.nenner));
			// Es wird eine neue Fraction aus den Werten des Feldes gemacht auf das
			// gesprungen wird
			punktZahl = punktZahl.add(feldBruch); // Beide Brueche werden addiert
			punktZahl.kuerzen(); // Brueche werden gekuertzt falls moeglich
			spieler.zaehler = punktZahl.getZaehler(); // Werte der neuen Punktzahl werden in dem jeweiligen Spieler
														// gespeichert
			spieler.nenner = punktZahl.getNenner();

			punkteWiedergabe(punktZahl, spieler); // Methode zur punktWiedergabe wird aufgerufen

		}

	}

	public static void punkteWiedergabe(FractionMax pZ, Spieler spieler) { // Methode welche die Punkte der Spieler
																			// ausgibt und ueberprueft ob jemand gewonnen
																			// hat

		if (pZ.getZaehler().compareTo(pZ.getNenner()) == 1) { // Es wird unterschieden ob der Zaehler der Punktzahl
																// groesser ist als der Nenner

			System.out.println("Spieler " + spieler.farbe + " hat folgende Punktzahl: "
					+ pZ.getZaehler().divide(pZ.getNenner()) + " ganze Punkte und "
					+ pZ.getZaehler().mod(pZ.getNenner()) + "/" + pZ.getNenner() + " Teilpunkte \n");
			pruefeObGewonnen(pZ ,spieler);

		} else {
			System.out.println(
					"Spieler " + spieler.farbe + " hat folgende Punktzahl: " + pZ.getZaehler() + "/" + pZ.getNenner());
			System.out.println("");

		}
	}

	public static void pruefeObGewonnen(FractionMax pZ, Spieler spieler) {
		BigInteger maximum = new BigInteger("65");
		if (pZ.getZaehler().divide(pZ.getNenner()).compareTo(maximum) == 1 ||pZ.getZaehler().divide(pZ.getNenner()).compareTo(maximum) == 0) {
			System.out.println("Spieler " + spieler.farbe + " hat gewonnen!");
				Steuerung.weiterSpielen = false;
		}
	}

}
