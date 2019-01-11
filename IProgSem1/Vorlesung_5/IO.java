import java.io.*; //@author Philipp Hermann,Sruscht Abdallah
import java.math.BigDecimal;
import java.math.BigInteger;

class IO {

	public static void write(String s) {
		writeAndFlush(s);
	}

	public static void writeln(String s) {
		writeAndFlush(s + "\n");
	}

	public static String promptAndRead(String s) throws Exception {
		while (true) {
			try {
				writeAndFlush(s);
				return br.readLine();
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}

	private static void writeAndFlush(String s) {
		System.out.print(s);
		System.out.flush();
	}

	public static int readInt(String s) throws Exception {
		while (true) {
			try {
				return Integer.parseInt(promptAndRead(s).trim());
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}

	public static long readLong(String s) throws Exception {
		while (true) {
			try {
				return Long.parseLong(promptAndRead(s).trim());
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}

	public static float readFloat(String s) throws Exception {
		while (true) {
			try {
				return Float.parseFloat(promptAndRead(s).trim());
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}

	public static double readDouble(String s) throws Exception {
		while (true) {
			try {
				return Double.parseDouble(promptAndRead(s).trim());
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}

	public static BigInteger readBigInteger(String s) throws Exception {
		while (true) {
			try {
				return new BigInteger(IO.promptAndRead(s).trim());
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}

	public static BigDecimal readBigDecimal(String s) throws Exception {
		while (true) {
			try {
				return new BigDecimal(IO.promptAndRead(s).trim());
			} catch (Exception e) {
				writeln("Ungültige eingabe.");
			}
		}

	}
	 public static Fraction readFraction(String s, String t) {
	        while (true) {
	            try {
	                return new Fraction(readBigInteger(s), readBigInteger(t));
	            } catch (Exception e) {
	                System.out.println("That was not a valid integer, please try again.");
	            }
	        }
	    }

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}