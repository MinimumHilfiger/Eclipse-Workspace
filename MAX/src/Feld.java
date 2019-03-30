import java.util.concurrent.ThreadLocalRandom;//@author Philipp Hermann

public class Feld {
	private int xKor, yKor;
	public int zaehler, nenner;
	boolean besetzt ;
	public String aktuelleSpielerFarbe;

	public Feld(int xKorWert, int yKorWert) {		//Konstruktor
		xKor = xKorWert;
		yKor = yKorWert;
		bruchErsteller();

	}

	public String darstellen() {					//Methode um den Bruch eines Feldes darzustellen
		String s= zaehler + "/" + nenner + " ";
		int a = s.length();
		switch (a) {
		case 4:
			return zaehler + "/" + nenner + "   " ;
		case 5:
			return zaehler + "/" + nenner + "  " ;
		default:
			return zaehler + "/" + nenner + " ";
		}
	}

	public int zZGenerator() {							//Methode um eine Zufallszahl zu erstellen
		return ThreadLocalRandom.current().nextInt(1, 100);
	}

	public void bruchErsteller() {			//Methode um einen zufaellig generierten Bruch zu erstellen welcher nicht groesser als 10 sein soll
		zaehler = zZGenerator();
		nenner = zZGenerator();
		while (zaehler / nenner > 10) {
			zaehler = zZGenerator();
			nenner = zZGenerator();
		}
	}
	public void spielerAufFeld(String farbe) {	//Methode falls ein Spieler auf ein Feld kommt
		besetzt = true;
		aktuelleSpielerFarbe = farbe;
	}
	public void spielerVonFeld() {				//Methode falls ein Spieler von einem Feld geht
		besetzt = false;
		bruchErsteller();
	}
}
