import java.util.Scanner;

public class Exercise67
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int num1, num2, num3, n;
		
		System.out.print( "Count from: " );
		num1 = keyboard.nextInt();
		
		System.out.print( "Count to: " );
		num2 = keyboard.nextInt();
		
		System.out.print( "Count by: " );
		num3 = keyboard.nextInt();
		
		for ( n = num1 ; n <= num2 ; n += num3 )
		{
			System.out.print( "\t" + n );
		}
			System.out.println();
	}
}