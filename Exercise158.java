import java.util.Scanner;

public class Exercise158
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };
		
		int a;
		int b;
		String first, second;
		
		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			for ( int i=0; i<pokeParty.length; i++ )
				System.out.println("   " + i + ".  " + pokeParty[i]);
				
			System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
			a = kb.nextInt();
			
			if ( a >= 0 )
			{
				System.out.print("Choose a Pokemon to exchange with " + pokeParty[a] + ". => ");
				b = kb.nextInt();
				
				System.out.println("\nExchanging " + pokeParty[a] + " with " + pokeParty[b] + ".\n");
				
				first = pokeParty[a];
				second = pokeParty[b];
				
				pokeParty[a] = second;
				pokeParty[b] = first;
				
			}
		
		} while ( a >= 0 );
	}
}