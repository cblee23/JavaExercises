import java.util.Scanner;

public class Exercise157
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };
		
		int x;
		String first, second;
		
		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			System.out.println("0. " + pokeParty[0]);
			for ( int i = 1; i<pokeParty.length; i++ )
				System.out.println("\t" + i + ". " + pokeParty[i]);
			
			System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.)");
			System.out.print("> ");
			x = kb.nextInt();
			
			first = pokeParty[0];
			second = pokeParty[x];
			
			pokeParty[0] = second;
			pokeParty[x] = first;
			
			
		} while ( x > 0 );
		
	}
}