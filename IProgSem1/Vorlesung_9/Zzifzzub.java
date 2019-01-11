//@author Philipp Hermann,Sruscht Abdallah

public class Zzifzzub {
	
	public static void main(String[] args)throws Exception {

		int n = IO.readInt("Bitte geben Sie eine positive Zahl ein: ");
	
	
		for(int z=0;z<=n;z++)
		{

		if((z%3)==0 && (z%5)==0  || (z%3)==0 && (z%7)==0 || (z%5)==0 && (z%7)==0  )
		{
		IO.writeln("Zzifzzub");	
		}
		else
		if ((z%3)==0){
		IO.writeln("Fizz");
		}
		else 
		if ((z%5)==0){
		IO.writeln("Buzz");
	    }
		else
	    if ((z%7)==0){
	    IO.writeln("Snub");
	    }
	    else{IO.writeln(""+z);}
		}
		}}
