//@author Philipp Hermann,Sruscht Abdallah
public class MathPlotter {

	private static double beginn, schrittweite, ende, exponent;

	public static void main(String[] args) throws Exception {

		MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
	}

	public static void auswaehler(String eingabe) throws Exception {
		beginn = IO.readDouble("Geben Sie den Zahlenwert für den Beginn ein. ");
		ende = IO.readDouble("Bitte geben Sie den Zahlenwert für das Ende ein. ");
		schrittweite = IO.readDouble("Bitte geben Sie den Zahlenwert für die Schrittweite ein. ");
		exponent = IO.readDouble("Bitte geben Sie den Zahlenwert für den Exponent ein. ");
		
		switch (eingabe) {
		case "sin":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.sin(zahl);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "cos":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.cos(zahl);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "exp":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.exp(zahl);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "log":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.log(zahl);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "sqrt":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.sqrt(zahl);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "tan":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.tan(zahl);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "square":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.pow(zahl,2);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "cube":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.pow(zahl,3);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "quad":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.pow(zahl,4);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "power":
			bereich(new Mathe() {
				public double rechnung(double zahl) {
					return Math.pow(zahl,exponent);
				}
			});
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;
		case "pots":
			break;
		default:
			IO.writeln("Ungültige eingabe.");
			MathPlotter.auswaehler(IO.promptAndRead("Bitte geben Sie eine mathematische Funtkion ein: "));
			break;

		}

	}

	public static void bereich(Mathe m) {
		for (double i = beginn; i <= ende; i += schrittweite) {
			IO.writeln(" "+m.rechnung(i));
		}
	}

	interface Mathe {
		public double rechnung(double zahl);
	}
}
