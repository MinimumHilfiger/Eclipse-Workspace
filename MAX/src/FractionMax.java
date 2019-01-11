import java.math.BigInteger;//@author Philipp Hermann

public class FractionMax {
	private BigInteger zaehler, nenner;

	public FractionMax(BigInteger z, BigInteger n) {
		zaehler = z;
		nenner = n;
	}

	public String toString() {
		if (this.nenner.equals(BigInteger.ONE)) {
			return "" + this.zaehler + " / " + this.nenner + " oder als Ganzzahl: " + this.zaehler;
		} else {
			return "" + this.zaehler + " / " + this.nenner;
		}
	}

	public FractionMax add(FractionMax r) {
		FractionMax erg = new FractionMax(BigInteger.ZERO, BigInteger.ZERO);
		erg.nenner = this.nenner.multiply(r.nenner);
		erg.zaehler = this.nenner.multiply(r.zaehler);
		erg.zaehler = erg.zaehler.add(r.nenner.multiply(this.zaehler));
		erg.kuerzen();
		return erg;
	}
	public void kuerzen() {
		BigInteger ggt = this.zaehler.gcd(nenner);
		this.zaehler = this.zaehler.divide(ggt);
		this.nenner = this.nenner.divide(ggt);

	}
	public BigInteger getZaehler() {
		return this.zaehler;
	}

	public BigInteger getNenner() {
		return this.nenner;
	}

	

}
