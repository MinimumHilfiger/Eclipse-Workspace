///Sruscht Abdallah und Philipp Hermann
//08.10.2018


import java.util.Scanner;

public class TriZip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ihren ersten wort zum Zippen ein:");
		String wort1 = sc.nextLine();
		System.out.println("Geben Sie ihren zweiten wort zum Zippen ein:");
		String wort2 = sc.nextLine();
		System.out.println("Geben Sie ihren dritten wort zum Zippen ein:");
		String wort3 = sc.nextLine();
		wort1 = TriZip.Trizip(wort1, wort2, wort3);
		System.out.println(wort1);

		sc.close();
	}

	public static String Trizip(String x, String y, String z) {
		// System.out.println(x+" "+y);
		return x.length() == 0 ? zip(y, z)
				: y.length() == 0 ? zip(x, z)
						: z.length() == 0 ? zip(x, y)
								: x.substring(0, 1) + y.substring(0, 1) + z.substring(0, 1)
										+ Trizip(x.substring(1), y.substring(1), z.substring(1));
	}

	public static String zip(String x, String y) {
		// System.out.println(x+" "+y);
		return x.length() == 0 ? y
				: y.length() == 0 ? x : x.substring(0, 1) + y.substring(0, 1) + zip(x.substring(1), y.substring(1));
	}

}
