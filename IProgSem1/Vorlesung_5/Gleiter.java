public class Gleiter { //@author Philipp Hermann,Sruscht Abdallah
						// Wir konnten diese Aufgabe nicht lösens

    public static void main(String[] args)throws Exception {
  int n = IO.readInt("Bitte geben Sie die Anzahl an Sterne an der Achse an: ");
  String ab = " ";
  String s = "*";
  String Gleiter[][] = new String[11][11];
 
  for(int x=0; x<11 ;x++)
  {for(int y=0; y<11; y++)
  {
    Gleiter[x][y]=ab; 
  }}

  if(n==1)
  {
    Gleiter[0][5]=s;
    Gleiter[1][4]=s;
    Gleiter[1][6]=s;
  }

  if(n==2)
  {
        Gleiter[0][5]=s;
        Gleiter[1][4]=s;
        Gleiter[1][6]=s;
  } 
      for(int x=0; x<11 ;x++)
      {for(int y=0; y<11; y++)
      {
}}}}