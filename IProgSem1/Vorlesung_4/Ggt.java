
public class Ggt {

	public static void main(String[] args) throws Exception {
		InteractiveIO iIO = new InteractiveIO();
		
		int zahlx,zahly,rechnung1,ausgabe;
		
		iIO.write("Dieses Programm sucht den Größten gemeinsamen Nenner.");
		
		zahlx=Integer.parseInt(iIO.promptAndRead("Bitte geben Sie die erste Zahl ein."));
		zahly=Integer.parseInt(iIO.promptAndRead("Bitte geben Sie die zweite Zahl ein."));
		
		
		
		rechnung1 = zahlx/zahly;
		
		if (rechnung1 == 0) {
			ausgabe = zahly;
			System.out.println(Integer.toString(ausgabe));
		}
		else {
			ausgabe = zahly/(zahlx%zahly);
			System.out.println(Integer.toString(ausgabe));
		}
	}

}
