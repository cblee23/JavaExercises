import java.util.Random;

public class Exercise75
{
	public static void main( String[] args )
	{
		
		Random r = new Random();
		
		System.out.println("Baby Blackjack!");
		System.out.println();
		
		int card1, card2, total, dealertotal;
		
		card1 = 1 + r.nextInt(10);
		card2 = 1 + r.nextInt(10);
		
		total = card1 + card2;
		
		System.out.println("You drew " + card1 + " and " + card2 + ".");
		System.out.println("Your total is " + total);
		
		card1 = 1 + r.nextInt(10);
		card2 = 1 + r.nextInt(10);
		
		dealertotal = card1 + card2;
		
		System.out.println("The dealer has " + card1 + " and " + card2 + ".");
		System.out.println("Dealer's total is " + dealertotal);
		System.out.println();
		
		if ( total > dealertotal )
			System.out.println("You win!");
		else if ( total < dealertotal )
			System.out.println("Dealer wins!");
		else
			System.out.println("It's a draw!  Nobody wins.");
		
	}
}