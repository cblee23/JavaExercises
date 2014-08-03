import java.util.Random;
import java.util.Scanner;

public class Exercise47
{
	public static void main( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "You slide up to Fast Eddie's card table and plop down your cash." );
		System.out.println( "He glances at you out of the corner of his eye and starts shuffling." );
		System.out.println( "He lays down three cards." );
		System.out.println();
		System.out.println( "Which one is the ace?" );
		System.out.println();
		System.out.println( "\t## ## ##" );
		System.out.println( "\t## ## ##" );
		System.out.println( "\t1  2  3 " );
		System.out.println();
		
		int guess = keyboard.nextInt();
		int num = 1 + r.nextInt(3);
		
		if ( num == 1 && guess == 1 )
		{
			System.out.println( "You nailed it!  Fast Eddie reluctantly hands over your winnings." );
			System.out.println();
			System.out.println( "\tAA ## ##" );
			System.out.println( "\tAA ## ##" );
			System.out.println( "\t1  2  3 " );
		}
		
		else if ( num == 1 && guess != 1 )
		{
			System.out.println( "Ha!  Fast Eddie wins again!  The ace was card number 1." );
			System.out.println();
			System.out.println( "\tAA ## ##" );
			System.out.println( "\tAA ## ##" );
			System.out.println( "\t1  2  3 " );			
		}
		
		else if ( num == 2 && guess == 2 )
		{
			System.out.println( "You nailed it!  Fast Eddie reluctantly hands over your winnings." );
			System.out.println();
			System.out.println( "\t## AA ##" );
			System.out.println( "\t## AA ##" );
			System.out.println( "\t1  2  3 " );
		}
		
		else if ( num == 2 && guess != 2 )
		{
			System.out.println( "Ha!  Fast Eddie wins again!  The ace was card number 2." );
			System.out.println();
			System.out.println( "\t## AA ##" );
			System.out.println( "\t## AA ##" );
			System.out.println( "\t1  2  3 " );
		}
		
		else if ( num == 3 && guess == 3 )
		{
			System.out.println( "You nailed it!  Fast Eddie reluctantly hands over your winnings." );
			System.out.println();
			System.out.println( "\t## ## AA" );
			System.out.println( "\t## ## AA" );
			System.out.println( "\t1  2  3 " );
		}
		
		else if ( num == 3 && guess != 3 )
		{
			System.out.println( "Ha!  Fast Eddie wins again!  The ace was card number 3." );
			System.out.println();
			System.out.println( "\t## ## AA" );
			System.out.println( "\t## ## AA" );
			System.out.println( "\t1  2  3 " );
		}
	}
}