import java.util.Scanner;
import java.util.Random;

public class Exercise53
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int num = 1 + r.nextInt(10), guess;
		int n = 1;
		
		System.out.println( "I have chosen a number between 1 and 10.  Try to guess it." );
		System.out.print( "Your guess: " );
		guess = keyboard.nextInt();
		
		while ( guess != num )
		{
			
			System.out.println( "That is incorrect.  Guess again." );
			guess = keyboard.nextInt();
			n++;
			
		}
			System.out.println( "That's right!  You're a good guesser." );
			System.out.println( "It only took you " + n + " tries." );
	}
}