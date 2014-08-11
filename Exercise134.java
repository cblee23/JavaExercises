import java.util.Scanner;
import java.io.File;

public class Exercise134
{
	public static void main( String[] args ) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		int sum = 0, x;
		
		System.out.print("Which file would you like to read numbers from: " );
		String file = kb.next();
		System.out.println("Reading numbers from " + file );
		System.out.println();
		
		Scanner fileIn = new Scanner(new File(file));
		
		while ( fileIn.hasNextInt() )
		{
			x = fileIn.nextInt();
			System.out.print(x + " ");
			sum = sum + x;	
		}
		System.out.println();
		System.out.println("Total is " + sum);
	}
}