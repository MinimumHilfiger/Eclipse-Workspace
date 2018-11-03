import java.math.BigInteger;	//@author Philipp Hermann,Sruscht Abdallah
public class Kgv {

    public static void main(String[] args) throws Exception{

    BigInteger x = IO.readBigInteger("Bitte geben sie die erste Zahl ein: ");
    BigInteger y = IO.readBigInteger("Bitte geben sie die zweite Zahl ein: ");
    IO.write("Die zahl lautet: " + Kgv.kgV(x, y));

    }
    
    public static BigInteger kgV(BigInteger x, BigInteger y) {
    	BigInteger z = x.multiply(y);
    	return z.divide(x.gcd(y));
    }
}