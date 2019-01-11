//@author Philipp Hermann,Sruscht Abdallah
public class DoublePrimes extends Thread {
	private int p; // die Primzahl dieses Primers
	private DoublePrimes left, right;

	DoublePrimes(int prime) { // Konstuktor
		super("Primer-" + prime); // Name eintragen
		p = prime; // Primzahl eintragen
		this.start(); // Thread sofort starten
	}

// ... weitere Variablen und Methoden ...
	public static void main(String args[]) {
		DoublePrimes dp = new DoublePrimes(2);
		for (int i = 3; i <=100; dp.send(i++)) {
			
		}
		dp.send(0);
	}

	public void run() { // Die Arbeitsmethode des Primers
		// ... ist nicht synchronisiert !
		System.out.println(currentThread() + " Primzahl: " + p);
		while (true) { // Endlos-Schleife
			int n = receive(); // Lese-Versuch
			if (n == 0) { // wenn n=0: Ende
				if (left != null)
					left.send(n);
				if (right != null)
					right.send(n);
				break;
			}
			if (n % p != 0) { // vielleicht prim
				if (left != null && right != null) {
					left.send(n);
					right.send((2 * n) + p);
				} else {
					left = new DoublePrimes(n);
					right = new DoublePrimes((2 * n) + p);
				}
			} // sonst: n nicht prim
		}
	}

	private int buffer = -1; // Puffer zum Senden & Empfangen
//wenn < 0: leer

	synchronized void send(int i) { // Sperre erlangen
		try {
			while (buffer >= 0)
				wait();// warten bis Puffer frei
			buffer = i; // Puffer füllen
			notify(); // Empfänger benachrichtigen
		} catch (InterruptedException e) {
		}
	}

	synchronized int receive() { // Sperre erlangen
		int result = 0;
		try {
			while ((result = buffer) < 0)
				wait(); // warten bis Puffer
			// voll
			buffer = -1; // Puffer leeren
			notify(); // Sender
			// benachrichtigen
		} catch (InterruptedException e) {
		}
		return result;
	}
}