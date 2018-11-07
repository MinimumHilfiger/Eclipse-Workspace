//@author Philipp Hermann,Sruscht Abdallah
public class BorderRect {

	public static void main(String[] args) throws Exception {
		int n, m, d;
		n = IO.readInt("Bitte geben Sie eine Zahl zwischen 0 und 33 ein.");
		m = IO.readInt("Bitte geben Sie eine Zahl zwischen 0 und 33 ein.");
		d = IO.readInt("Bitte geben Sie eine Zahl zwischen 0 und 33 ein.");

		for (int i = 0; i < d; i++) {
			for (int x = 0; x < d * 4 + m; x++) {
				IO.write("*");
			}
			IO.writeln("");
		}

		for (int i = 0; i < d; i++) {
			for (int x = 0; x < d; x++) {
				IO.write("*");
			}
			for (int y = 0; y < 2 * d + m; y++) {
				IO.write(" ");
			}
			for (int z = 0; z < d; z++) {
				IO.write("*");
			}
			IO.writeln("");
		}

		for (int i = 0; i < n; i++) {
			for (int x = 0; x < d; x++) {
				IO.write("*");
			}
			for (int y = 0; y < d; y++) {
				IO.write(" ");
			}
			for (int z = 0; z < m; z++) {
				IO.write("*");
			}
			for (int y1 = 0; y1 < d; y1++) {
				IO.write(" ");
			}
			for (int z1 = 0; z1 < d; z1++) {
				IO.write("*");
			}
			
			IO.writeln("");
		}
		
		for (int i = 0; i < d; i++) {
			for (int x = 0; x < d; x++) {
				IO.write("*");
			}
			for (int y = 0; y < 2 * d + m; y++) {
				IO.write(" ");
			}
			for (int z = 0; z < d; z++) {
				IO.write("*");
			}
			IO.writeln("");
		}
		
		for (int i = 0; i < d; i++) {
			for (int x = 0; x < d * 4 + m; x++) {
				IO.write("*");
			}
			IO.writeln("");
		}
	}

}
