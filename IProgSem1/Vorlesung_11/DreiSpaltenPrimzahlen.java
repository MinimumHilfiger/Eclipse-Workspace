//@author Philipp Hermann,Sruscht Abdallah
public class DreiSpaltenPrimzahlen {

	public static void main(String[] args) {
		Primer pipe1 = new Primer(2,"");
		Primer pipe2 = new Primer(2,"   ");
		Primer pipe3 = new Primer(2,"      ");

		for(int i =3;i<= 5000;i++) {
			pipe1.send(i);
			pipe2.send(i);
			pipe3.send(i);
		}
		pipe1.send(0);
		pipe2.send(0);
		pipe3.send(0);
	}

}
