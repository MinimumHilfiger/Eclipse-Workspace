import java.util.Calendar;	//@author Philipp Hermann,Sruscht Abdallah
import java.util.GregorianCalendar;

public class Person1 {

	String name, vorname, beruf, farbe, tier, alter;
	int geburtsjahr;
	float gehalt;
	float groeße;
	static Calendar cal = new GregorianCalendar();

	public static void main(String[] args) throws Exception {

		Person1 person1 = new Person1();
		IO.write("\n");
		Person1 person2 = new Person1();

		IO.write(person1.toString());
		IO.write("\n");
		IO.write(person2.toString());
		IO.write("\n");
		IO.write("\n");
		person1.gehtAusMit(person2);
		IO.write("\n");
		person1.compareWith(person2);

	}

	public Person1() throws Exception {
		name = IO.promptAndRead("Namen: ");
		vorname = IO.promptAndRead("Vorname: ");
		beruf = IO.promptAndRead("Beruf: ");
		farbe = IO.promptAndRead("Lieblingsfarbe: ");
		tier = IO.promptAndRead("Lieblingstier: ");
		geburtsjahr = IO.readInt("Geburtsjahr: ");
		alter = " " + (cal.get(GregorianCalendar.YEAR) - geburtsjahr);
		groeße = IO.readFloat("Größe in Meter: ");
		gehalt = IO.readFloat("Gehalt in Euro pro Monat: ");
		IO.write("\n");

	}

	public String toString() {
		String kmg;
		String geh;
		if (groeße > 1.55 && groeße < 1.81) {
			kmg = "die Person ist mittelgroß";
		} else if (groeße >= 1.81) {
			kmg = "Die Person ist groß";
		} else {
			kmg = "Die Person ist klein";
		}

		if (gehalt > 1300.00 && gehalt < 3500.00) {
			geh = "Die Person verdient mittelmäßig viel Geld";
		} else if (gehalt >= 3500) {
			geh = "Die Person verdient viel Geld";
		} else {
			geh = "die Person verdient wenig Geld";
		}
		String persondaten = "Name: " + name + "\n" + "Vorname: " + vorname + "\n" + "Beruf: " + beruf + "\n"
				+ "Lieblingsfarbe: " + farbe + "\n" + "Lieblingstier: " + tier + "\n" + "Geburtsjahr: " + geburtsjahr
				+ "\n" + "Alter: " + alter + "\n" + "Größe: " + groeße + " m" + "\n" + kmg + "\n" + "Gehalt: " + gehalt
				+ " € pro Monat" + "\n" + geh + "\n" + "\n";

		return persondaten;
	}

	public void compareWith(Person1 h) {
		if (this.gehalt > h.gehalt) {
			System.out.println(this.vorname + " verdient mehr als " + h.vorname);
		} else if (this.gehalt < h.gehalt) {
			System.out.println(h.vorname + " verdient mehr als " + this.vorname);
		} else {
			System.out.println(this.vorname + " und " + h.vorname + " verdienen gleich viel");
		}

		if (this.geburtsjahr > h.geburtsjahr) {
			System.out.println(this.vorname + " ist jünger als " + h.vorname);
		} else if (this.geburtsjahr < h.geburtsjahr) {
			System.out.println(h.vorname + " ist jünger als " + this.vorname);
		} else {
			System.out.println(this.vorname + " und " + h.vorname + " sind gleich alt");
		}

		if (this.groeße > h.groeße) {
			System.out.println(this.vorname + " ist größer als " + h.vorname);
		} else if (this.groeße < h.groeße) {
			System.out.println(h.vorname + " ist größer als " + this.vorname);
		} else {
			System.out.println(this.vorname + " und " + h.vorname + " sind gleich groß");
		}
	}

	public void gehtAusMit(Person1 h) {
		System.out.println(this.vorname + " geht mit " + h.vorname + " aus. ");

	}
}