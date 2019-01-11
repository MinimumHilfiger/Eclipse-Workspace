import java.math.BigInteger;//@author Philipp Hermann,Sruscht Abdallah

public class PrimeFrac1 {

	public static void main(String[] args) {
		Fraction[] L = new Fraction[9];
		L[0] = new Fraction(new BigInteger("3"), new BigInteger("11"));
		L[1] = new Fraction(new BigInteger("847"), new BigInteger("45"));
		L[2] = new Fraction(new BigInteger("143"), new BigInteger("6"));
		L[3] = new Fraction(new BigInteger("7"), new BigInteger("3"));
		L[4] = new Fraction(new BigInteger("10"), new BigInteger("91"));
		L[5] = new Fraction(new BigInteger("3"), new BigInteger("7"));
		L[6] = new Fraction(new BigInteger("36"), new BigInteger("325"));
		L[7] = new Fraction(new BigInteger("1"), new BigInteger("2"));
		L[8] = new Fraction(new BigInteger("36"), new BigInteger("5"));

		Fraction b = new Fraction(new BigInteger("10"), new BigInteger("1"));
		Fraction z = new Fraction(BigInteger.ZERO, BigInteger.ZERO);
		Fraction grZ = new Fraction(BigInteger.ZERO, BigInteger.ZERO);
		IO.writeln(b.toString());
		
		for (int i = 1; i <= 1429; i++) {
			for (int x = 0; x < L.length; x++) {
				z = b.multiply(L[x]);
				if (z.isInteger()) {
					IO.writeln("Die "+i+" Zahl "+z.toString());
					b = z;
					break;
				}
			}
		}
		
		int counter=1;
		int stelle = 0;
		for(int i=0;i<33333;i++) {
			
			for (int x = 0; x < L.length; x++) {
				z = b.multiply(L[x]);
				if (z.isInteger()) {
					counter= counter+1;
					if(counter==17119)IO.writeln("Die 17719. Zahl ist: "+ z);
					if(counter==33333)IO.writeln("Die 33333. Zahl ist: "+z);
					if(z.getZaehler().compareTo(grZ.getZaehler())==1) {
						grZ=z;
						stelle = counter;
					}
					b = z;
					break;
				}
			}
		}
		IO.write("Die größte Zahl ist: ");IO.write(grZ.toString());IO.write(" an der Stelle "+ stelle);
	}

}
