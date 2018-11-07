//@author Philipp Hermann,Sruscht Abdallah
public class FifthRoot {

	public static void main(String[] arg) throws Exception {
		long n = 1, maxIterations = 1000;
		double maxError = 1e-9, xnPlus1, xn = 1, x;
		
		x = IO.readDouble("Woraus soll ich die 5. Wurzel ziehen? ");
		
		xnPlus1 = xn - (xn * xn * xn* xn* xn - x) / (5 * xn * xn* xn* xn);
		
		while (Math.abs((xnPlus1 - xn)) >= maxError && n < maxIterations) {
			xn = xnPlus1;
			xnPlus1 = xn - (xn * xn * xn* xn* xn - x) / (5 * xn * xn* xn* xn);
			IO.writeln("n = " + n + ": " + xnPlus1);
			n = n + 1;
		}
		IO.writeln("Die 5. Wurzel aus " + x + " ist " + xnPlus1);
	}

}
