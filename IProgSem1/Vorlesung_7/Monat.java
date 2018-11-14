import java.lang.String;

public class Monat {
	public enum Month {
		Januar(1), Februar(2), Maerz(3), April(4), Mai(5), Juni(6), Juli(7), August(8), September(9), Oktober(10),
		November(11), Dezember(12);

		private final int mz;

		Month(int mz) {
			this.mz = mz;
		}

		public int getNumber() {
			return mz;
		}

	}

	public static void main(String[] args) {
		IO.writeln("Erste Liste: ");
		for (Month m : Month.values()) {
			if (m.toString().toLowerCase().contains("r") && MathUtil.isOdd(m.getNumber())) //1.Monatsname als String 2.Kleingeschrieben 3.Enthält r 4.Monatsnummer ist ungerade
				System.out.println(m + " " + m.getNumber());
		}
		IO.writeln("");
		IO.writeln("Zweite Liste: ");
		for (Month m : Month.values()) {
			if (m.toString().toLowerCase().contains("a") && MathUtil.isEven(m.getNumber()))
				System.out.println(m + " " + m.getNumber());
		}
	}

}
