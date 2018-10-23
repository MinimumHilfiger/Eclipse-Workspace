//Sruscht Abdallah und Philipp Hermann
//09.10.2018

import java.util.Scanner;

public class Zipshift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ihren Text zum verschieben ein:");
		String wort1  = sc.nextLine();
		String wort2 = wort1;
		wort2 = Zipshift.schift(wort2);
		wort1 = Zipshift.zip(wort1, wort2);
		System.out.println(wort1);
		sc.close();
	}
	public static String schift(String x)
	{
		System.out.println(x);
		return x.length()==0 ? x :   x.substring(x.length() - 1 , x.length()) + x.substring(0, x.length() -1)   ;	
		
	}
	public static String zip(String x, String y)
	{
		return x.length() == 0 ? y
				: y.length() == 0 ? x :
					x.substring(0, 1) + y.substring(0, 1) + zip(x.substring(1), y.substring(1));
		
	}
}
