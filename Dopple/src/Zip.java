//Sruscht Abdallah und Philipp Hermann
//08.10.2018

import java.util.Scanner;

public class Zip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ihr erstes Wort zum Zippen ein:");
		String wort1 = sc.nextLine();
		System.out.println("Geben Sie ihr zweites Wort zum Zippen ein:");
		String wort2 = sc.nextLine();
		wort1 = Zip.zip(wort1, wort2);
		System.out.println(wort1);

		sc.close();
	}
	
	public static String zip(String x, String y) {
		//System.out.println(x+" "+y);
		return x.length() == 0 ? y
				: y.length() == 0 ? x :
					x.substring(0, 1) + y.substring(0, 1) + zip(x.substring(1), y.substring(1));
	}
}
