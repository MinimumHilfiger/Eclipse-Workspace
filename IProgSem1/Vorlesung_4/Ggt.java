//@author Philipp Hermann,Sruscht Abdallah
public class Ggt {

	public static void main(String[] args) throws Exception {
		InteractiveIO iIO = new InteractiveIO();

		int zahlx, zahly;
		String eingabe1, eingabe2;
		String ausnahme = "";

		iIO.write("Dieses Programm sucht den größten gemeinsamen Teiler.");

		eingabe1 = iIO.promptAndRead("Bitte geben Sie die erste Zahl ein.");
		eingabe2 = iIO.promptAndRead("Bitte geben Sie die zweite Zahl ein.");

		while (!eingabe1.equals(ausnahme) && !eingabe1.equals(ausnahme)) {

			zahlx = Integer.parseInt(eingabe1);
			zahly = Integer.parseInt(eingabe2);

			iIO.write("Der größte gemeinsame Teiler von " + zahlx + " und " + zahly + "ist " + rechner(zahlx, zahly));

			eingabe1 = iIO.promptAndRead("Bitte geben Sie die erste Zahl ein.");
			if (eingabe1.equals(null))
				break;

			eingabe2 = iIO.promptAndRead("Bitte geben Sie die zweite Zahl ein.");
			if (eingabe2.equals(null))
				break;
		}

	}

	public static int rechner(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		if (x / y == 0) {
			return rechner(y, x);
		}
		return x % y == 0 ? y : rechner(y, x % y);
	}

}
