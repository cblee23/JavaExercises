import java.util.Scanner;

public class Exercise33
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Welcome to Chris' Tiny Adventure" );
		System.out.println();
		
		System.out.println( "You have the choice of attending the prestigious University of Oregon \"Ducks\" or lowly Oregon State \"Beavers\".  Which do you choose?" );
		String university = keyboard.next();
		
		if ( university.equals("Ducks") )
		{
			System.out.println( "Your university wins a national football championship!" );
			System.out.println( "Do you celebrate by \"drinking\" or \"rioting\" the streets?" );
			String activity = keyboard.next();	
			
			if ( activity.equals("drinking") )
			{
				System.out.println( "You go out for a night of drinking on the town!" );
				System.out.println( "Do you choose to drink and party at Rennie's or Taylor's" );
				String bar = keyboard.next();
			
				if ( bar.equals("Rennie's") )
				{
					System.out.println( "You have a magical time, and meet the girl of your dreams!" );
				}
				else
				{
					System.out.println( "You are slipped Rufilin by a frat guy, and your night doesn't go according to plan." );
				}
			}
		 	
		
			else
			{
				System.out.println( "During your rioting do you choose to \"loot\" or \"burn cars\"? " );
				String riot = keyboard.next();
			
					if ( riot.equals("loot") )
					{
						System.out.println( "Due to the mass chaos, you are able to escape with a new flat screen TV" );
					}
					else
					{
						System.out.println( "You are receive a heavy dose of pepper spray from an officer.  You spend 2 nights in the pen." );
					}
			}
		}	
		
			else 
			{ 
				System.out.println( "The Beavers are surprising everyone, and are in position to make the Rose Bowl.  They only need to beat the Ducks.  You want to be prepared.  Do you buy plane tickets to \"LA\" in hopes of a victory, or do you play it safe and purchase tickets to \"San Antonio\" for the Alamo Bowl? " );
				String trip = keyboard.next();
			
				if ( trip.equals("LA") )
				{
				System.out.println( "The Beavers have lost yet again.  Do you \"cancel\" your flight, or decide to attend \"Disneyland\" instead? " );
				String attend = keyboard.next();
				
					if ( attend.equals("cancel") )
					{
					System.out.println( "You spend another gloomy winter in Corvallis, Oregon.  You watch the Oregon Ducks win the National Championship from your couch." );
					}
					else
					{
					System.out.println( "Not realizing that the Fast Pass is available at Disneyland, you spend the entire day in line for Space Mountain, angry that Justin Bieber cut you in line by faking an injury in a wheelchair" );
					}
				}
			 	
				
					else
					{ 
					System.out.println( "You're in San Antonio.  Do you visit the \"Alamo\" or attend a \"Spurs game\"? " );
					String fun = keyboard.next();
					
						if ( fun.equals("Alamo") )
						{
						System.out.println( "You scream \"Remember the Alamo!\" at everyone that passes by while in a drunken stupor.  You are eventually pepper sprayed by a frightened woman." );
						}
						else 
						{
						System.out.println( "Gregg Popovich has sat all of the big 3 players, meaning now you will see 2 bad games while in San Antonio.  Enjoy! " );
						}
					}
			}
	}
}
