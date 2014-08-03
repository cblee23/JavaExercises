import java.util.Scanner;

public class Exercise32
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		String item, bigger;
		
		System.out.println( "TWO QUESTIONS!" );
		System.out.println( "Think of an object, and I'll try to guess it." );
		System.out.println();
		
		System.out.println( "Question 1) Is it an animal, vegetable, or mineral?" );
		item = keyboard.next();
		
		System.out.println();
		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		bigger = keyboard.next();
		
		System.out.println();
		
		if ( item.equals("animal") && bigger.equals("no") )
		{
			System.out.println( "My guess is that you are thinking of a squirrel." );
		}
		else 
		{
			if ( item.equals("animal") && bigger.equals("yes") )
			{
			System.out.println( "My guess is that you are thinking of a moose." );
			}
		}	
		
		if ( item.equals("vegetable") && bigger.equals("no") )
		{
			System.out.println( "My guess is that you are thinking of a carrot" );
		}
		else
		{
			if ( item.equals("vegetable") && bigger.equals("yes") )
			{
			System.out.println( "My guess is that you are thinking of a watermelon" );
			}
		}	
		
		if ( item.equals("mineral") && bigger.equals("no") )
		{
			System.out.println( "My guess is that you are thinking of a paper clip" );
		}
		else
		{
			if ( item.equals("mineral") && bigger.equals("yes") )
			{
			System.out.println( "My guess is that you are thinking of a Camaro." );
			}
		}
		
		System.out.println( "I would ask you if I'm right, but I don't actually care." );
	}
}