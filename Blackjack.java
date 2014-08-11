import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		int card1, card2, hitcard, total1=0, total2=0, wager, chips = 100;
		
		System.out.println("Welcome to Mitchell's blackjack program!");
		
		do
		{	
		
		
		card1 = 2 + r.nextInt(10);
		card2 = 2 + r.nextInt(10);
		hitcard = 2 + r.nextInt(10);
		total1 = card1 + card2;
		
		System.out.println();
		System.out.print("You have " + chips + " in chips.  How much would you like to wager? ");
		wager = kb.nextInt();
		System.out.println();
		System.out.println("You get a " + card1 + " and a " + card2 + ".");
		System.out.println("Your total is " + total1);
		System.out.println();
		
		card1 = 2 + r.nextInt(10);
		card2 = 2 + r.nextInt(10);
		
		System.out.println("The dealer has a " + card1 + " showing, and a hidden card.");
		System.out.println("His total is hidden, too");		
		System.out.println();
		
		System.out.println("Would you like to \"hit\" or \"stay\"?");
		String hit = kb.next();
		
		if ( chips <= 0 ) 
			{
			System.out.println("You don't have enough chips to play!  Come back later.");
			break;
			}
			
			else
			{
				if ( total1 > 21 )
					System.out.println("Error!  You can't bust on the flop!");
		
				else
				{
			
				while ( total1 <= 21 && hit.equals("hit") )
				{
					hitcard = 2 + r.nextInt(10);
					System.out.println("You drew a " + hitcard);
					total1 = total1 + hitcard;
					if ( total1 < 21 )
					{	
						System.out.println("Your total is " + total1 );
						System.out.println();
						System.out.println("Would you like to \"hit\" or \"stay\"?");
						hit = kb.next();
					}
					else 
					{	
						chips = chips - wager;
						System.out.println("You have busted.  You lose! You now have " + chips + " chips.");
					}
				}
		
				if ( total1 <= 21 )
				{
					total2 = card1 + card2;
					System.out.println();
					System.out.println("Okay, dealer's turn.");
					System.out.println("His hidden card was a " + card2);
					System.out.println("His total was " + total2);
					System.out.println();
			
					if ( total2 >= 17 && total2 < 21 )
					{
						System.out.println("Dealer stays.");
						System.out.println("Dealer total is " + total2);
						System.out.println("Your total is " + total1);
						
						if ( total1 > total2)
						{	
							chips = chips + wager;
							System.out.println("You win! You now have " + chips + " chips.");
						}	
						else if ( total2 > total1 )
						{
							chips = chips - wager;
							System.out.println("You lose!  You now have " + chips + "chips.");
						}
						else 
							System.out.println("It's a push!  Nobody wins.  You still have " + chips + " chips.");
					}
			
					else
					{		
			
						while ( total2 < 17 )
						{
							System.out.println("Dealer hits");
							hitcard = 2 + r.nextInt(10);
							System.out.println("Dealer drew a " + hitcard );
							total2 = total2 + hitcard;
				
							if ( total2 <= 21 && total2 >= 17)
							{
								System.out.println("Dealer stays.");
								System.out.println();
								System.out.println("Dealer total is " + total2);
								System.out.println("Your total is " + total1);
							
								if ( total1 > total2 && total2 >= 17 )
								{
									System.out.println();
									chips = chips + wager;
									System.out.println("You win!  You now have " + chips + " chips.");
									
								}
								else if ( total2 > total1 && total2 >=17 )
								{
									System.out.println();
									chips = chips - wager;
									System.out.println("You lose! You now have " + chips + " chips.");
									
								}
								else if ( total2 == total1 && total2 >=17 )
								{
									System.out.println();
									System.out.println("It's a push!  Nobody wins.  You still have " + chips + " chips.");
								}
							}
					
							else if ( total2 > 21 )
							{
								System.out.println("Dealer's total is " + total2);	
								chips = chips + wager;
								System.out.println("Dealer busts.  You win! You now have " + chips + " chips." );
								
							}
						}
					  } 
					}
				}
				
			 } 
			} while ( chips > 0 );
				System.out.println();	
	}
}
				
			
						