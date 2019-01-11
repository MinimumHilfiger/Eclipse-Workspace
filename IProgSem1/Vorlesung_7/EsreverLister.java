import java.util.*;//@author Philipp Hermann,Sruscht Abdallah

public class EsreverLister {

	public static void main(String[] args) throws Exception {

		boolean weiter = true;

		ArrayList<String> liste = new ArrayList<String>();
		while (weiter == true) {

			String eingabe = IO.promptAndRead("Bitte geben Sie eine Zeichenfolge ein.");

			if (eingabe == null)
				weiter = false;

			else {
				switch (eingabe) {

				case "potS":
					weiter = false;
					break;

				case "^z":
					weiter = false;
					break;

				default:
					eingabe = invert(eingabe);
					liste.add(eingabe);

				}
			}
		}
		Collections.reverse(liste);
		System.out.println(liste);

	}

	public static String invert(String s) {
		return s.length() <= 1 ? s : invert(s.substring(1)) + s.substring(0, 1);
	}

}
