import java.util.Scanner;

public class Exercise117
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		
		System.out.print("What is your name: ");
		String name = kb.next();
		int end = 10;
		
		if ( name.equals("Mitchell") )
			end = 5;
		
		for ( int x = 1; x <= end; x++ )
		{
			System.out.println(name);
				
		}
		
	}
}