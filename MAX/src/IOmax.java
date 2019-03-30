import java.io.*; //@author Philipp Hermann

class IOmax {

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
				writeln("Ungueltige eingabe.");
			}
		}

	}

	private static void writeAndFlush(String s) {
		System.out.print(s);
		System.out.flush();
	}

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}