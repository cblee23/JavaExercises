import java.util.Scanner;

public class Exercise62
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int n, tries = 0, largest=0;
		
		System.out.print( "Starting number: " );
		n = keyboard.nextInt();
		
		while ( n != 1 )
		{
			if ( n % 2 == 0 )
			{
				n = n/2;
				System.out.print( "\t" + n );
				tries++;
				largest = Math.max(largest, n);

			}
			else
			{
				n = n*3+1;
				System.out.print( "\t" + n );
				tries++;
				largest = Math.max(largest, n);

			}
		}
		
		System.out.println();
		System.out.println( "Terminated after " + tries + " steps. The largest number is " + largest + "." );
	}
}
			