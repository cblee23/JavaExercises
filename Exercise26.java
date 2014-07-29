import java.util.Scanner;

public class Exercise26
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int planet;
		double weight;
		
		System.out.print( "Please enter your current earth weight: " );
		weight = keyboard.nextDouble();
		System.out.println();
		
		System.out.println( "I have information for the following planets:" );
		System.out.println( "\t1. Venus\t2. Mars\t 3. Jupiter" );
		System.out.println( "\t4. Saturn\t5. Uranus\t6. Neptune" );
		System.out.println();
		
		System.out.print( "Which planet are you visiting? " );
		planet = keyboard.nextInt();
		 
		 if ( planet == 1 )
		 	System.out.println( "Your weight would be " + (weight * .78) + " pounds on that planet. " );
		 
		 else if ( planet == 2 )
		 	System.out.println( "Your weight would be " + (weight * .39) + " pounds on that planet. " );
		 	
		 else if ( planet == 3 )
		 	System.out.println( "Your weight would be " + (weight * 2.65) + " pounds on that planet. " );
		 	
		 else if ( planet == 4 )
		 	System.out.println( "Your weight would be " + (weight * 1.17) + " pounds on that planet. " );
		 
		 else if ( planet == 5 )
		 	System.out.println( "Your weight would be " + (weight * 1.05) + " pounds on that planet. " );
		 	
		 else if ( planet == 6 )
		 	System.out.println( "Your weight would be " + (weight * 1.23) + " pounds on that planet. " );
		 	
		 else
		 	System.out.println( "We don't fight on that planet, Sir!" );
		 	
	}
}