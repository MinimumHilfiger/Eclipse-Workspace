	//@author Philipp Hermann,Sruscht Abdallah
public class KgvXor {

	public static void main(String[] args) throws Exception {

		int x = IO.readInt("Bitte geben sie die erste Zahl ein: ");
		int y = IO.readInt("Bitte geben sie die zweite Zahl ein: ");
		KgvXor.kgvXor(x, y);

	}

	public static long kgv(long x, long y) {
		return x * y / ggt(x, y);
	}

	public static long ggt(long x, long y) {
		return x % y == 0 ? y : ggt(y, x % y);
	}

	public static void kgvXor(int x, int y) {
		long ausgabe = x ^ (x * 2);
		while (x < y) {
			x++;
			ausgabe = kgv(ausgabe, x ^ (x * 2));

		}
		IO.writeln("Das Ergebnis ist: " + ausgabe);
	}

}