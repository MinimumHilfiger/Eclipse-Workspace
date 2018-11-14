
public class Matrix {
	int m, n;
	double[][] qMatrix;

	public Matrix(int m, int n) { // Konstruktor
		this.m = m;
		this.n = n;

		qMatrix = new double[m][n];

		for (int x = 0; x < n; x++) {
			for (int i = 0; i < m; i++) {
				qMatrix[i][x] = 0.0;
			}
		}
	}

	public void setValue(int i, int j, double x) { // Setzt Wert an Stelle i,j auf x
		this.qMatrix[i][j] = x;
	}

	public double getValue(int i, int j) { // Gibt Wert an Stelle i,j zurück
		return this.qMatrix[i][j];
	}

	public static void toString(Matrix matrix2) { // Stellt Matrix dar
		int m = matrix2.qMatrix.length;
		System.out.println();
		for (int x = 0; x < m; x++) {
			int n = matrix2.qMatrix[x].length;
			System.out.print("[ ");
			for (int i = 0; i < n; i++)
				System.out.print(matrix2.qMatrix[x][i] + " ");
			System.out.println("]");
		}
	}

	public Matrix add(Matrix mat) { // Addiert Matrix mit Matrix mat
		Matrix ergebnisA = new Matrix(this.qMatrix.length, this.qMatrix[0].length);
		if (this.qMatrix.length == mat.qMatrix.length && this.qMatrix[0].length == mat.qMatrix[0].length) {

			for (int x = 0; x < this.qMatrix.length; x++) {
				for (int i = 0; i < this.qMatrix[0].length; i++) {
					ergebnisA.setValue(x, i, this.getValue(x, i) + mat.getValue(x, i)); // Hier wird der Wert berechnet und eingesetzt
				}
			}

		} else {
			IO.writeln("Diese Matrizen können nicht addiert werden.");
			return null;
		}
		return ergebnisA;
	}

	public Matrix multipy(Matrix mat) {
		Matrix ergebnisM = new Matrix(this.qMatrix.length, this.qMatrix[0].length);
		if (this.qMatrix[0].length == mat.qMatrix.length) {
			for (int x = 0; x < this.qMatrix.length; x++) {
				for (int i = 0; i < this.qMatrix[0].length; i++) {
					ergebnisM.setValue(x, i, nebenRechnung(x,i,mat) );	//Hier wird nur der Wert der Nebenrechnung an der richtigen Stelle eingesetzt
				}
			}
		} else {
			IO.writeln("Diese Matrizen können nicht multipliziert werden.");
			return null;
		}
		return ergebnisM;
	}
	public double nebenRechnung(int i, int j, Matrix mat) {
		double ergebnisNR = 0;
		for (int x = 0 ; x< this.qMatrix.length ; x++) {
			ergebnisNR += this.getValue(i, x) * mat.getValue(x,j);
			
		}
		return ergebnisNR;
	}
	

	public static void main(String[] args) throws Exception {

		Matrix m1 = new Matrix(IO.readInt("Geben Sie die erste Zahl für das Array an."),
				IO.readInt("Geben Sie die zweite Zahl für das Array an."));
		toString(m1);
		m1.setValue(0, 0, 1);
		toString(m1);
		toString(m1.add(m1));
		toString(m1);
		IO.writeln("" + m1.qMatrix.length); // Zeilenanzahl
		IO.writeln("" + m1.qMatrix[0].length); // Spaltenanzahl
		Matrix m2 = new Matrix(2, 2);
		toString(m1.add(m2));
	}

}
