public class Person {		//@author Philipp Hermann,Sruscht Abdallah

	String name, vorname, beruf, lieblingsFarbe, lieblingsTier;

	public static void main(String[] args) throws Exception {
		InteractiveIO iIO = new InteractiveIO();				//Referenz von InteractiveIO Klasse

		Person testPerson = new Person("Mustermann", "Max", "Kanalreiniger", "Gelb", "Hund");		//Testperson wird erstellt und Methoden
		iIO.write(testPerson.toString());															//werden getestet
		testPerson.gehtAusMit(testPerson);															//

		iIO.write("Bitte geben Sie die Informationen der ersten Personen ein.");		//Eingabe 1 Person		
		Person person1 = new Person(iIO.promptAndRead("Name:"), iIO.promptAndRead("Vorname:"),
				iIO.promptAndRead("Beruf:"), iIO.promptAndRead("Lieblingsfarbe:"), iIO.promptAndRead("Lieblingstier:"));
		iIO.write(person1.toString());

		iIO.write("Bitte geben Sie die Informationen der zweiten Personen ein.");	//Eingabe 2 Person
		Person person2 = new Person(iIO.promptAndRead("Name:"), iIO.promptAndRead("Vorname:"),
				iIO.promptAndRead("Beruf:"), iIO.promptAndRead("Lieblingsfarbe:"), iIO.promptAndRead("Lieblingstier:"));
		iIO.write(person2.toString());

		person1.gehtAusMit(testPerson);
		person2.gehtAusMit(person1);
	}

	public Person(String n, String v, String b, String lF, String lT) {		// Personen Klasse
		name = n;
		vorname = v;
		beruf = b;
		lieblingsFarbe = lF;
		lieblingsTier = lT;

	}

	public String toString() {											//Gibt alle Informationen einer Person in einem String aus
		String Ausgabe = "Name: " + name + ", " + "Vorname: " + vorname + ", " + "Beruf: " + beruf + ", "
				+ "Lieblingsfarbe: " + lieblingsFarbe + ", " + "Lieblingstier: " + lieblingsTier;
		return Ausgabe;
	}

	public void gehtAusMit(Person h) {									//Die Person plus die als Parameter übergebene Person gehen miteinander aus
		System.out.println(this.vorname + " " + this.name + " geht aus mit " + h.vorname + " " + h.name);
	}

}
