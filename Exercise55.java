import java.util.Scanner;

public class Exercise55
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int num, total = 0;
		
		System.out.println( "I will add up the numbers you give me." );
		System.out.println( "I'll stop when you type a zero.");
	
		do
		{
		 System.out.println("Number: ");
		 num = keyboard.nextInt();
		 int newtotal = num + total;
		 total = newtotal;
		 System.out.println("The total so far is " + total );
		 
		
		} while ( num!= 0 );
		
		System.out.println( "The final total is " + total + "." );
		
	}
}