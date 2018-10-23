package v3_Package;		//@author Philipp Hermann,Sruscht Abdallah
import java.util.Scanner;

public class ShiftAll		 
{
	static int i = 0;
	public static void main(String[] args) 
	{
		System.out.println("Bitte geben Sie ein Wort ein");
		
		Scanner sc = new Scanner(System.in);
		
		String eingabe = sc.nextLine();
		i = eingabe.length();
		
		while (i > 0) {							//Die Methode shifter wird der Länge der Eingabe entsprchend oft aufgerufen
		eingabe=ShiftAll.shifter(eingabe);
		System.out.println(eingabe);
		i--;
		}
		
		
		sc.close();
	}
	
	static String shifter(String xy)		//Nimmt den letzten Buchstaben der Eingabe und plaziert in an der ersten Stelle
	{
		
		if (xy.length()==0) 
		{
			return xy;
		} 
		else 
		{
			return xy.substring(xy.length()-1, xy.length()) + xy.substring(0, xy.length() -1) ;
		}
		
		
	}
	
	
}
