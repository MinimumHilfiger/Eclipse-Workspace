//@author Philipp Hermann,Sruscht Abdallah
public class PowerTower {

	public static void main(String[] args) throws Exception {
		
		InteractiveIO iIO = new InteractiveIO();
		
		int anzahlexpo;
		double basis,endergebnis;
		
		basis = Double.parseDouble(iIO.promptAndRead("Bitte geben Sie x ein."));
		anzahlexpo = Integer.parseInt(iIO.promptAndRead("Bitte geben Sie n ein."));
		
		endergebnis = PowerTower.powertowerpowertower(basis, anzahlexpo);
		iIO.write("Der Funktionswert von x ist " + endergebnis);
	}
	
	public static double powertowerpowertower(double x, int n) {
		double ergebnis=x;
		if(n==0) {
			ergebnis = 1;
		}
		else {
		for(int u =1; n > u; u++) {
			ergebnis = Math.pow(ergebnis, x);
		}
		}
		return ergebnis;
	}

}
