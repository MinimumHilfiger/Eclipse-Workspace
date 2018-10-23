//Sruscht Abdallah und Philipp Hermann

//08.10.2018
//Aufgabe: Eingegeben Text nach recht verschieben.
import java.util.Scanner;

public class ShiftRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ihren Text zum verschieben ein:");
		String wort1  = sc.nextLine();
		wort1 = ShiftRight.shiftright(wort1);
		System.out.println(wort1);
		sc.close();
		
	}

	public static String shiftright (String x) {
	    System.out.println(x);
		return x.length()==0 ? x :   x.substring(x.length() - 1 , x.length()) + x.substring(0, x.length() -1)   ;		
		}	

}


