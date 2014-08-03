import java.util.Scanner;

public class Exercise35
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "TWO MORE QUESTIONS, BRO!" );
		System.out.println();
		System.out.println( "Think of something and I'll try to guess it!" );
		System.out.println();
		
		System.out.print( "Question 1) Does it stay inside or outside or both? " );
		String where = keyboard.next();
		
		System.out.print( "Question 2) Is it a living thing? " );
		String living = keyboard.next();
		
		System.out.println();
		
		if ( where.equals("inside") && living.equals("yes") )
		System.out.println( "Then what else would you be thinking of besides a houseplant?" );
		
		if ( where.equals("inside") && living.equals("no") )
		System.out.println( "Well, it must be a shower curtain!" );
		
		if ( where.equals("outside") && living.equals("yes") )
		System.out.println( "Clearly you are referring to a bison." );
		
		if ( where.equals("outside") && living.equals("no") )
		System.out.println( "It's quite obvious you are thinking of a billboard." );
		
		if ( where.equals("both") && living.equals("yes") )
		System.out.println( "Boy, I love dogs too!" );
		
		if ( where.equals("both") && living.equals("no") )
		System.out.println( "Then what else would you be thinking of besides a cellphone?" );
		
	}
}