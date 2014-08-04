import java.util.Scanner;

public class Exercise56
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		
		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS";
		
		double minimumTemperature = 79.0; // degrees Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;
		
		System.out.print( "What is the current water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature;
		
		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake..." );
		
		swimTime = 0;
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5;
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}
		
		System.out.println( swimmer1 + " stops swimming.  Total swim time: " + swimTime + " min." );
		
		currentTemperature = savedTemperature;
		
		System.out.println( "\nOkay, so the current water temperature is  " + currentTemperature + "F." );
		System.out.println( swimmer2 + " approaches the lake..." );
		
		swimTime = 0;
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\t The current water temperature is now " + currentTemperature + "F." );
		} while ( currentTemperature >= minimumTemperature );
		
		System.out.println( swimmer2 + " stop swimming.  Total swim time: " + swimTime + "min." );
	}
}