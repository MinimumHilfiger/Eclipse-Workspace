import java.io.*; 	//@author Philipp Hermann,Sruscht Abdallah
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
		writeAndFlush(s);
		return br.readLine();
	}

	public static int readInt(String s) throws Exception {
		return Integer.parseInt(promptAndRead(s).trim());
	}

	public static long readLong(String s) throws Exception {
		return Long.parseLong(promptAndRead(s).trim());
	}

	public static float readFloat(String s) throws Exception {
		return Float.parseFloat(promptAndRead(s).trim());
	}

	public static double readDouble(String s) throws Exception {
		return Double.parseDouble(promptAndRead(s).trim());
	}

	public static BigInteger readBigInteger(String s) throws Exception {
		return new BigInteger(IO.promptAndRead(s).trim());
	}

	public static BigDecimal readBigDecimal(String s) throws Exception {
		return new BigDecimal(IO.promptAndRead(s).trim());
	}

	private static void writeAndFlush(String s) {
		System.out.print(s);
		System.out.flush();
	}

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}