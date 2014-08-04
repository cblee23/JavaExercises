import java.util.Scanner;

public class Exercise63
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String choice = "";
		int nextroom = 1;
		
		System.out.println( "MITCHELL'S TINY ADVENTURE 2!" );
		
		while ( nextroom != 0 )
		{
			if ( nextroom == 1 )
			{
				System.out.println( "You are in a creepy house!  Would you like to go" );
				System.out.println( "\"upstairs\" or into the \"kitchen\"? " );
				choice = keyboard.next();
				if ( choice.equals("kitchen") )
					nextroom = 2;
				else if ( choice.equals("upstairs") )
					nextroom = 3;
				else
					System.out.println( "That wasn't a choice!  Try again!" );
			}
			if ( nextroom == 2 )
			{
				System.out.println( "There is a long countertop with dirty dishes everywhere." );
				System.out.println( "Off to one side there is, as you'd expect, a refrigerator." );
				System.out.println( "You may open the \"refrigerator\" or go \"back\"." );
				choice = keyboard.next();
				
				if ( choice.equals("refrigerator") )
					nextroom = 7;
				else if ( choice.equals("back") )
					nextroom = 1;
				else
					System.out.println( "That wasn't a choice!  Try again!" );
			}
			if ( nextroom == 3 )
			{
				System.out.println( "Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\"." );
				System.out.println( "There is also a \"bathroom\" off the hallway.  Or, you can go back \"downstairs\"." );
				System.out.println( "Where would you like to go?" );
				choice = keyboard.next();
				
				if ( choice.equals("bedroom") )
					nextroom = 4;
				else if ( choice.equals("bathroom") )
					nextroom = 5;
				else if ( choice.equals("downstairs") )
					nextroom = 6;
				else
					System.out.println( "That wasn't a choice!  Try again!" );
					
			}
			if ( nextroom == 4 )
			{
				System.out.println( "This is where the magic happens.  You can either enter the \"bathroom\" or go \"back\" " );
				choice = keyboard.next();
				
				if ( choice.equals("bathroom") )
					nextroom = 5;
				else if ( choice.equals("back") )
					nextroom = 3;
				else
					System.out.println( "That wasn't a choice!  Try again!" );
			}
			if ( nextroom == 5 )
			{
				System.out.println( "You have found the bathroom.  Do you need to use it? (\"yes\" or \"no\"?) " );
				choice = keyboard.next();
				
				if ( choice.equals("yes") )
					{
						System.out.println( "You used too much toilet paper, and have clogged the toilet.  The hosts will not be happy!" );
						nextroom = 0;
					}
				else if ( choice.equals("no") )
					{
						System.out.println( "You really should have gone.  On your drive home, you feel the urge, but there is nowhere to pull over." );
						System.out.println( "You are left with the unfortunate decision of just letting it out.  Your pants begin to soak in warm urine." );
						nextroom = 0;
					}
				else
					System.out.println( "That was not a choice!  Try again." );
			}
			if ( nextroom == 6 )
			{
				System.out.println( "You went downstairs, and see a bathroom.  You can choose to go in the \"bathroom\" of go back \"upstairs\"." );
				choice = keyboard.next();
				
				if ( choice.equals("bathroom") )
					nextroom = 5;
				else if ( choice.equals("upstairs") )
					nextroom = 3;
				else
					System.out.println( "That wasn't a choice!  Try again!" );
			}
			if ( nextroom == 7 )
			{
				System.out.println( "Inside the refrigerator you see food and stuff.  It looks pretty nasty." );
				System.out.println( "Would you like to eat some of the food?  (\"yes\" or \"no\"?" );
				choice = keyboard.next();
				
				if ( choice.equals("yes") )
				{
					System.out.println( "The food was shockingly good.  You don't regret your decision." );
					nextroom = 0;
				}
				else if ( choice.equals("no") )
				{
					System.out.println( "You leave the house hungry, and the nearest restaurant is 100 miles away.  Not well planned." );
					nextroom = 0;
				}
				else
					System.out.println( "That wasn't a choice!  Try again." );
			}
		}
		System.out.println();
		System.out.println( "This adventure is in the books!  Hope you had a great time!" );
	}
}
			