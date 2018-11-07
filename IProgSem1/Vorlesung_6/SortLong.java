public class SortLong {//@author Philipp Hermann,Sruscht Abdallah
    static int e1,e2,e3;

    public static void main(String[] args) throws Exception {
        IO.writeln("Dieses Programm sortiert drei Zahlen");
        int z1 = IO.readInt("Bitte geben sie die 1. Zahl ein.");
        int z2 = IO.readInt("Bitte geben sie die 2. Zahl ein.");
        int z3 = IO.readInt("Bitte geben sie die 3. Zahl ein.");

        if(z1>z2&&z1>z3)e3=z1;
        if(z2>z1&&z2>z3)e3=z2;
        if(z3>z2&&z3>z1)e3=z3;

        if(z1<z2&&z1<z3)e1=z1;
        if(z2<z1&&z2<z3)e1=z2;
        if(z3<z1&&z3<z2)e1=z3;

        if(z1>e1&&z1<e3)e2=z1;
        if(z2>e1&&z2<e3)e2=z2;
        if(z3>e1&&z3<e3)e2=z3;

        IO.writeln("Die Zahlen sortiert, mit der kleinsten beginnend.");
        IO.writeln(""+e1);
        IO.writeln(""+e2);
        IO.writeln(""+e3);	
    }

}