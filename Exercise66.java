import java.util.Scanner;

public class Exercise66
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count to: " );
		int num = keyboard.nextInt();
		
		for ( int n = 0 ; n <= num ; n++ )
		{
			System.out.print( "\t" + n );
		}
		
		System.out.println();
	}
}