import java.util.Random;

public class Exercise50
{
	public static void main( String[] args )
	{
		Random r = new Random();
		
		System.out.println( "HERE COMES THE DICE" );
		System.out.println();
	
		int dice1 = 1 + r.nextInt(6), dice2 = 1 + r.nextInt(6);
		
		while ( dice1 != dice2 )
		{	
		System.out.println( "Roll #1: " + dice1 );
		System.out.println( "Roll #2: " + dice2 );
		System.out.println( "The total is " + (dice1 + dice2) );
		
		dice1 = 1 + r.nextInt(6);
		dice2 = 1 + r.nextInt(6);
		}
		
		System.out.println( "Roll #1: " + dice1 );
		System.out.println( "Roll #2: " + dice2 );
		System.out.println( "The total is " + (dice1 + dice2) );
		
	}
}