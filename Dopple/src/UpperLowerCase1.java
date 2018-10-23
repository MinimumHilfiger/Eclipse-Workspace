//Sruscht Abdallah
//09.10.2018

import java.util.Scanner;

public class UpperLowerCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ihren Text zum verändern ein ein:");
		String wort1  = sc.nextLine();
		wort1=upperlower(wort1);
		System.out.println(wort1);
		sc.close();
	}
public static String upperlower (String x) {
	return  x.length() <= 1 ? x.toUpperCase() : 
			x.length()==0 ? x : 
			x.substring(0, 1).toUpperCase() +
			x.substring(1, 2).toLowerCase() +
			upperlower(x.substring(2));
}}
