//Sruscht Abdallah und Philipp Hermann
//09.10.2018

import java.util.Scanner;

public class Texte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ihren ersten wort zum Zippen ein:");
		String wort1 = sc.nextLine();
		System.out.println("Geben Sie ihren zweiten wort zum Zippen ein:");
		String wort2 = sc.nextLine();
		System.out.println("Geben Sie ihren dritten wort zum Zippen ein:");
		String wort3 = sc.nextLine();
		//---------------zip(zip(a.b),c)-------------------
		String zip_ab = Texte.zip(wort1, wort2);
		String zip_ab_c = Texte.zip(zip_ab, wort3);
		System.out.println("zip(zip(a.b),c)" + zip_ab_c);
		//---------------zip(a, zip(b,c))------------------
		String zip_bc = Texte.zip(wort2, wort3);
		String zip_a_bc = Texte.zip(zip_bc, wort1);
		System.out.println(zip_a_bc);
		//---------------trizip(a,b,c)---------------------
		String trizip = Texte.Trizip(wort1, wort2, wort3);
		System.out.println(trizip);
		//---------------invert(zip(a,b))------------------	
		String invzip_ab = Texte.invert(zip_ab);
		System.out.println(invzip_ab);
		//---------------zip(invert(a),invert(b))----------
		String inv_a = Texte.invert(wort1);
		String inv_b = Texte.invert(wort2);
		String zipinv_ab = Texte.zip(inv_a, inv_b);
		System.out.println(zipinv_ab);
		//---------------zip(a, invert(a))---------------------
		String zip_a_inva = Texte.zip(wort1, inv_a);
		System.out.println(zip_a_inva);
		
		sc.close();
	}

	public static String zip(String x, String y) {
		//System.out.println(x+" "+y);
		return x.length() == 0 ? y
				: y.length() == 0 ? x :
					x.substring(0, 1) + y.substring(0, 1) + zip(x.substring(1), y.substring(1));
	}
	
	public static String Trizip(String x, String y, String z) {
		// System.out.println(x+" "+y);
		return x.length() == 0 ? zip(y, z)
				: y.length() == 0 ? zip(x, z)
						: z.length() == 0 ? zip(x, y)
								: x.substring(0, 1) + y.substring(0, 1) + z.substring(0, 1)
										+ Trizip(x.substring(1), y.substring(1), z.substring(1));
	}
	
	public static String invert(String x)
	{
	return x.length()<= 1 ? x : invert(x.substring(1)) + x.substring(0, 1);
	}
}
