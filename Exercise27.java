import java.util.Scanner;

public class Exercise27
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int correct = 0, answer;
		
		System.out.print( "Are you ready for a quiz? " );
		keyboard.next();
		System.out.println( "Okay, here it comes!" );
		
		System.out.println( "What is the capital of Alaska?" );
		System.out.println( "\t1) Melbourne" );
		System.out.println( "\t2) Anchorage" );
		System.out.println( "\t3) Juneau" );
		answer = keyboard.nextInt();
		
		if ( answer == 3 )
		{
			System.out.println( "That's right!" );
			correct += 1;
		}
		else
		{
			System.out.println( "WRONG!" );
		}
		
		System.out.println( "Can you store the value \"cat\" in a variable of type int?" );
		System.out.println( "\t1) yes" );
		System.out.println( "\t2) no" );
		answer = keyboard.nextInt();
		
		if ( answer == 2 )
 		{
 			System.out.println( "That's right!" );
 			correct += 1;
 		}
 		else
 		{
 			System.out.println( "SO WRONG!" );
 		}
 		
 		System.out.println( "What is the result of 9+6/3?" );
 		System.out.println( "\t1) 5" );
 		System.out.println( "\t2) 11" );
 		System.out.println( "\t3) 15/3" );
 		answer = keyboard.nextInt();
 		
 		if ( answer == 2 )
 		{
 			System.out.println( "You got it, dude!" );
			correct += 1;
		}
		else 
		{
			System.out.println( "No way, Jose!" );
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println( "Overall, you got " + correct + " out of 3 correct." );
		System.out.println( "Thanks for playing!" );
	}
}