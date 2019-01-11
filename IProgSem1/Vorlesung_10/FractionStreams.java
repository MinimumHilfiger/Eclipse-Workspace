//@author Philipp Hermann,Sruscht Abdallah
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FractionStreams {
	public static void main(String[] args) {

		List<Fraction> list = new ArrayList<>();

		

		for (int n = -12, ne = 12; n <= ne; n++) {
			if (n != 0) {
				for (int z = -12, en = 12; z <= en; z++) {

					list.add(new Fraction(BigInteger.valueOf(z), BigInteger.valueOf(n)));
					

				}
			}
		}

		IO.writeln("alle Elemente sortiert, ohne Doppelte, als floats");
		Stream<Fraction> s1 = list.stream();
		Float[] ar1 = s1.map(Fraction::floatValue).sorted().distinct().toArray(Float[]::new);
		for (Float fraction : ar1) {
			IO.writeln(fraction + " , ");
		}
		IO.writeln("");
		IO.writeln("");

		IO.writeln("alle Elemente quadriert, ohne Doppelte, als Brüche");

		Stream<Fraction> s2 = list.stream();
		Fraction[] ar2 = s2.sorted().distinct().map(Fraction::quadrierer).distinct().toArray(Fraction[]::new);
		for (Fraction fraction : ar2) {
			System.out.print(fraction + " , ");
		}
		IO.writeln("");
		IO.writeln("");

		IO.writeln("alle Elemente in zufälliger Reihenfolge, bei denen Zähler und Nenner Primzahlen sind ");

		Stream<Fraction> s3 = list.parallelStream();
		Fraction[] ar3 = s3.map(Fraction::istPrimzahl).toArray(Fraction[]::new);

		for (Fraction fraction : ar3) {
			if (fraction != null)
				IO.writeln(fraction + " , ");
		}

		IO.writeln("");
		IO.writeln("");

		IO.writeln(" alle Elemente sortiert, die ganze Zahlen (.isInteger()) darstellen");

		Stream<Fraction> s4 = list.stream();
		Fraction[] ar4 = s4.filter(Fraction::isInteger).sorted().toArray(Fraction[]::new);
		for (Fraction fraction : ar4) {
			IO.writeln(fraction + " , ");
		}

		IO.writeln("");
		IO.writeln("");

		IO.writeln("die cos-Werte aller Elemente, als double Werte, sortiert, ohne Doppelte");

		Stream<Fraction> s5 = list.stream();
		Double[] ar5 = s5.map(Fraction::doubleValue).map(Math::cos).sorted().distinct().toArray(Double[]::new);
		for (Double x : ar5) {
			IO.writeln(x + " , ");
		}

	}

}
