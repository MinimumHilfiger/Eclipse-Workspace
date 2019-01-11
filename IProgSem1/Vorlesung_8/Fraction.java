import java.math.BigInteger;//@author Philipp Hermann,Sruscht Abdallah

public class Fraction extends Number implements Comparable<Fraction> {
	private BigInteger zaehler, nenner;

	public Fraction(BigInteger z, BigInteger n) {
		zaehler = z;
		nenner = n;
	}

	public static void main(String[] args) {
//		Fraction test = new Fraction(new BigInteger("1"), new BigInteger("2"));
//		Fraction test1 = new Fraction(new BigInteger("10"), new BigInteger("40"));
//		Fraction test2 = new Fraction(new BigInteger("20"), new BigInteger("10"));
//		IO.writeln(test.toString());
//		IO.writeln(test1.toString());
//		IO.writeln(test.add(test1).toString());
//		IO.writeln(test.multiply(test1).toString());
//		IO.writeln(test.divide(test1).toString());
//		if(test2.isInteger()) {
//			IO.writeln("ligma");
//		}
		
	}

	@Override
	public int intValue() {
		if (nenner.equals(BigInteger.ONE)) {
            return zaehler.intValue();
        }
        return (int) doubleValue();
	}

	@Override
	public long longValue() {
		if (nenner.equals(BigInteger.ONE)) {
            return zaehler.longValue();
        }
        return (long) doubleValue();
	}

	@Override
	public float floatValue() {
		if (nenner.equals(BigInteger.ONE)) {
            return zaehler.floatValue();
        }
        return (float) doubleValue();
	}

	@Override
	public double doubleValue() {
		if (nenner.equals(BigInteger.ONE)) {
            return zaehler.doubleValue();
        }
        return zaehler.doubleValue() / nenner.doubleValue();
	}

	@Override
	public int compareTo(Fraction o) {
		return zaehler.subtract(o.zaehler).signum();
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if ( !(obj instanceof Fraction || obj == null)) return false;

        Fraction f = (Fraction) obj;

        if (nenner != null ? !nenner.equals(f.nenner) : f.nenner != null) return false;
        return zaehler != null ? zaehler.equals(f.zaehler) : f.zaehler == null;

    }
	
	public String toString() {
		if (this.nenner.equals(BigInteger.ONE) ) {
			return ""+ this.zaehler + " / " + this.nenner+" oder als Ganzzahl: "+this.zaehler;
		}
		else {
		return "" + this.zaehler + " / " + this.nenner;
		}
	}

	public Fraction add(Fraction r) {
		Fraction erg = new Fraction(BigInteger.ZERO, BigInteger.ZERO);
		erg.nenner = this.nenner.multiply(r.nenner);
		erg.zaehler = this.nenner.multiply(r.zaehler);
		erg.zaehler = erg.zaehler.add(r.nenner.multiply(this.zaehler));
		erg.kuerzen();
		return erg;
	}
	public Fraction substract(Fraction r) {
		Fraction erg = new Fraction(BigInteger.ZERO,BigInteger.ZERO);
		erg.nenner = this.nenner.multiply(r.nenner);
		erg.zaehler = this.nenner.multiply(r.zaehler);
		erg.zaehler = erg.zaehler.subtract(r.nenner.multiply(this.zaehler));
		erg.kuerzen();
		return erg;
	}

	public Fraction multiply(Fraction r) {
		Fraction erg = new Fraction(BigInteger.ZERO, BigInteger.ZERO);
		erg.nenner = this.nenner.multiply(r.nenner);
		erg.zaehler = this.zaehler.multiply(r.zaehler);
		erg.kuerzen();
		return erg;
	}

	public Fraction divide(Fraction r) {
		Fraction erg = new Fraction(BigInteger.ZERO, BigInteger.ZERO);
		erg.nenner = this.nenner.multiply(r.zaehler);
		erg.zaehler = this.zaehler.multiply(r.nenner);
		erg.kuerzen();
		return erg;
	}
	public Fraction quadrierer() {
		Fraction erg = new Fraction(BigInteger.ZERO, BigInteger.ZERO);
		erg.nenner = this.nenner.pow(4);
		erg.zaehler = this.zaehler.pow(4);
		erg.kuerzen();
		return erg;
	}

	public void kuerzen() {
		BigInteger ggt = this.zaehler.gcd(nenner);
		this.zaehler = this.zaehler.divide(ggt);
		this.nenner = this.nenner.divide(ggt);
		
	}
	public boolean isInteger() {
		this.kuerzen();
		if (this.nenner.equals(BigInteger.ONE) ) {
			return true;
		}
		else return false;
	}
	public BigInteger getZaehler() {
		return this.zaehler;
	}

	public BigInteger getNenner() {
		return this.nenner;
	}
	
	public Fraction istPrimzahl () {
        double nenner = this.nenner.doubleValue();
        double zaehler = this.zaehler.doubleValue();
        return isPrime(nenner) && isPrime(zaehler) ? this : null;
    }
	
	public boolean isPrime(double zahl) {
		int i = 2;
        boolean isprime;

        if (zahl <= 1) {
            return false;
        } else {
            if (zahl == 2) {
                return true;
            }
            do { 
                isprime = ((zahl % i) != 0); 
                i++; 
            } while (i * i <= zahl && isprime);
            return isprime;
        }
	}
	public int hashCode() {
		return intValue();
	}

}
