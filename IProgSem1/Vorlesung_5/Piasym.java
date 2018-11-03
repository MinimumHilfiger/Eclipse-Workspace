public class Piasym {	//@author Philipp Hermann,Sruscht Abdallah

	public static void main(String[] args) throws Exception {
		Long n = IO.readLong("Bitte geben Sie die Anzahl der druchläufe ein: ");
		Long z1;
		double z2 = 0D;
		double z4;
		for (long x = 1; x <= n; x++) {
			z1 = x * x;
			z4 = (double) 1 / (z1);
			z2 = (double) z2 + z4;
		}
		z2 = z2 * 6;
		IO.writeln("Die Rechnung (1/n*n) ist bei Ihnen " + n + " durchgegangen.");
		double z3 = (double) Math.sqrt(z2);
		IO.writeln("Ihre Zahl lautet: " + z3);
	}

}