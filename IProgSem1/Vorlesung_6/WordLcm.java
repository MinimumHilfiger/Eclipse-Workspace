public class WordLcm {//@author Philipp Hermann,Sruscht Abdallah

    public static void main(String[] args) throws Exception {
int zeahler=0;
long x=0;
long y=0;


    String i = IO.promptAndRead("Bitte geben Sie die Zahl als Wort ein:  \n");
    i  = i.toLowerCase();
    x = WordLcm.switchcase(i);
    IO.writeln("" + x );

    y = x;
    //---------------------------------------------------------------
    i = IO.promptAndRead("Bitte geben Sie die Zahl als Wort ein: ");
    i  = i.toLowerCase();
    x = WordLcm.switchcase(i);
    //----------------------------------------------------------------
    IO.writeln("" + x );
    long kgvxy = WordLcm.kgv(x, y);
    IO.writeln("Der ZwischenzielkgV von den eingegeben Zahlen ist: " + kgvxy); 


    while(zeahler<1)
    {
        i = IO.promptAndRead("Bitte geben Sie die Zahl als Wort ein: ");
        i  = i.toLowerCase();
        x = WordLcm.switchcase(i);

    if(x==0)
    { 
        IO.writeln("Der kgV von den eingegeben Zahlen ist: " + kgvxy);
        zeahler++;
    }
    else 
    {
    IO.writeln("" + x );
    kgvxy = WordLcm.kgv(kgvxy, x);
    IO.writeln("Der ZwischenzielkgV von den eingegeben Zahlen ist: " + kgvxy); 
    }}}



     public static long kgv(long x, long y) {
            return x * y / ggt(x, y);
        }

        public static long ggt(long x, long y) {
            return x % y == 0 ? y : ggt(y, x % y);
        }
        public static long switchcase (String n) throws Exception
        {
            switch(n) {
            case "eins": return 1; 
            case "zwei": return 2; 
            case "drei": return 3; 
            case "vier": return 4; 
            case "fünf": return 5; 
            case "sechs": return 6; 
            case "sieben": return 7; 
            case "acht": return 8; 
            case "neun": return 9; 
            case "zehn": return 10; 
            case "elf": return 11; 
            case "zwölf": return 12;
            case "dreizehn": return 13; 
            case "vierzehn": return 14; 
            case "fünfzehn": return 15; 
            case "sechszehn": return 16;
            case "siebzehn": return 17; 
            case "achtzehn": return 18; 
            case "neunzehn": return 19; 
            case "zwanzig": return 20;
            case "einundzwanzig": return 21; 
            case "zweiundzwanzig": return 22; 
            case "dreiundzwanzig": return 23; 
            case "hundert": return 100; 
            default: return 0; 

            }}}