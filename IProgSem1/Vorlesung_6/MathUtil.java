//@author Philipp Hermann,Sruscht Abdallah
public class MathUtil {
	public static void main(String[] args) {
		IO.writeln(""+ isPrime(3));			//Test ob 3 Primzahl ist
		IO.writeln(""+ nextPrime(3));		//Test welche Prizmzahl nach 3 folgt
	}

	static int max(int i, int j) {
		return i > j ? i : j;
	}

	static int max(int i, int j, int k) {
		return max(max(i, j), k);
	}

	static int min(int i, int j) {
		return i > j ? j : i;
	}

	static int min(int i, int j, int k) {
		return min(min(i, j), k);
	}

	static int sign(int i) {
		return i > 0 ? 1 : -1;
	}

	static int round(double x) {
		if (x > 0) {
			return (int) (x + 0.5);
		} else {
			return (int) (x - 0.5);
		}
	}

	static boolean isEven(int i) {
		return i % 2 == 0 ? true : false;
	}

	static boolean isOdd(int i) {
		return i % 2 == 1 ? true : false;
	}

	static int abs(int i) {
		return i * sign(i);
	}

	static boolean isPrime(long n) {
		int pz = 2;
		boolean istprimzahl = true;
		while (pz * pz <= n && istprimzahl) {
			istprimzahl = ((n % pz) != 0);
		}
		if (istprimzahl)
			return true;
		else
			return false;
	}

	static long nextPrime(long n) {
		boolean istprimzahl = true;
		while (istprimzahl) {
			n++;
			int pz = 2;
			while (pz * pz <= n && istprimzahl) {
				istprimzahl = ((n % pz) != 0);
				pz++;
			}
			if (istprimzahl)
				break;
			else
				istprimzahl = true;
		}
		return n;
	}
}
