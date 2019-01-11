import java.util.concurrent.ThreadLocalRandom;
import java.math.BigInteger;

public class Test1 {

	public static void main(String[] args) {
		int x = 2;
		switch (x) {
		case 1:
			System.out.println();
			
		case 2:
			System.out.println("yeet");

		default:
			
		}
	System.out.println("sugondese" + ThreadLocalRandom.current().nextInt(1, 4 + 1));
	int randomNum = ThreadLocalRandom.current().nextInt(1, 4 + 1);
	
	BigInteger x1 = new BigInteger("9");
	BigInteger x2 = new BigInteger("4");
	System.out.println(x1.divide(x2));
	}

}
