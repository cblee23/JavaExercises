import java.util.Scanner;

public class Exercise73
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int x, y = 0, num, sum=0;
		
		System.out.print( "Number: " );
		num = keyboard.nextInt();
		
		for ( x = 1 ; x <= num ; x++ )
		{
			System.out.print( x + " " );
			sum = x + y;
			y = sum;
			
		}
		
		System.out.println( "The sum is " + sum + "." );
	}
}