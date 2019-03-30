import java.math.BigInteger;//@author Philipp Hermann

public class Spieler {
	public int xKor, yKor;
	BigInteger zaehler, nenner;
	public String farbe;
	public boolean istDran;
	public boolean erstesMal = true;

	public Spieler(String f, boolean istDran) {
		this.farbe = f;
		this.istDran = istDran;
	}

	public void setzeX(int x) {
		this.xKor = x;
	}

	public void setzeY(int y) {
		this.yKor = y;
	}

}
