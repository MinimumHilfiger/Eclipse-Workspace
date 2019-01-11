//@author Philipp Hermann,Sruscht Abdallah
public class Primer extends Thread {
	private int p; // die Primzahl dieses Primers
	private Primer next; // der nächste Primer in der "Pipe"
	private String abstand;

	Primer(int prime, String abs) { // Konstuktor
		super("Primer-" + prime); // Name eintragen
		p = prime; // Primzahl eintragen
		this.abstand = abs;
		this.start(); // Thread sofort starten
	}

// ... weitere Variablen und Methoden ...
	public static void main(String args[]) {
		Primer first = new Primer(2,""); // ersten Primer : 2
		for (int i = 3; i <= 30; first.send(i++))
			; // weitere
		first.send(0); // Abbruchmitteilung
		System.out.println(currentThread() + " main beendet");
	}



	public void run() { // Die Arbeitsmethode des Primers
		// ... ist nicht synchronisiert !
		System.out.println(abstand + p);
		while (true) { // Endlos-Schleife
			int n = receive(); // Lese-Versuch
			if (n == 0) { // wenn n=0: Ende
				if (next != null)
					next.send(n);// auch von next
				break; // Ende while loop
			}
			if (n % p != 0) { // vielleicht prim
				if (next != null)
					next.send(n);// weiter testen
				else
					next = new Primer(n,abstand); // Primzahl!
			} // sonst: n nicht prim
		}
	}

	private int buffer = -1; // Puffer zum Senden & Empfangen
	// wenn < 0: leer

	synchronized void send(int i) { // Sperre erlangen
		try {
			while (buffer >= 0)
				wait();// warten bis Puffer frei
			buffer = i; // Puffer füllen
			notify(); // Empfänger benachrichtigen
		} catch (InterruptedException e) {
		}
	}synchronized int receive() { // Sperre erlangen
		int result = 0;
		try {
		while ((result=buffer)<0) wait(); // warten bis Puffer
		// voll
		buffer = -1; // Puffer leeren
		notify(); // Sender
		// benachrichtigen
		} catch (InterruptedException e) {}
		return result;
		}
}