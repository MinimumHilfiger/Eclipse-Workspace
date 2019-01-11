public class Schnecke { // @author Philipp Hermann,Sruscht Abdallah

	public static void main(String[] args) throws Exception {
		// String Name = IO.promptAndRead("Bitte geben Sie Ihre Name ein: ");
		// String Nachname = IO.promptAndRead("Bitte geben Sie Ihren Nachnamen ein: ");
		String vollname = "SruschtAbdallah";
		// Name + "" + Nachname;
		int gr = IO.readInt("Bitte geben Sie die größe: ");
		String[][] namefeld;
		namefeld = new String[gr][gr];
		int len = vollname.length();
		int von = 0;
		int bis = 1;
		int gr2 = gr - 1;

		int rx = 0;
		int ry = gr;
		int ul = 0;
		int ur = gr;

		int zel1 = 0;
		int zel2 = gr;
		int inn = 0;

		// -------------------------------
		for (int x = 0; gr > x; x++) {
			for (int y = 0; gr > y; y++) {
				namefeld[x][y] = "+";
			}
		}
		// -------------------------------

		// RECHTS
		// while(namefeld[(gr2gr2)/2][(gr2gr2)/2]=="+")
		// {

		for (int x = rx; ry > x; x++) {
			namefeld[rx][x] = vollname.substring(von, bis);
			von = von + 1;
			bis = bis + 1;

			if (bis > len) {
				von = 0;
				bis = 1;
			}
		}
		// RUNTER
		zel2--;
		zel1++;

		for (int y = zel2; ur >= y; y++) {
			namefeld[y][zel2] = vollname.substring(von, bis);
			von = von + 1;
			bis = bis + 1;

			if (bis > len) {
				von = 0;
				bis = 1;
			}
		}

		zel1++;
		zel2--;

		// Links
		for (int x = gr2 - 1; x > 0; x = x - 1) {
			namefeld[gr2][x] = vollname.substring(von, bis);
			von = von + 1;
			bis = bis + 1;

			if (bis > len) {
				von = 0;
				bis = 1;
			}
		}
		// HOCH
		for (int x = gr2; x >= 2; x--) {
			namefeld[x][inn] = vollname.substring(von, bis);
			von = von + 1;
			bis = bis + 1;
			if (bis > len) {
				von = 0;
				bis = 1;
			}
		}
		inn++;

		// }

		IO.writeln("" + zel1 + "  " + zel2 + " " + gr);

		for (int x = 0; gr > x; x++) {
			for (int y = 0; gr > y; y++) {
				IO.write(namefeld[x][y]);
			}
			IO.writeln("");
		}
	}
}