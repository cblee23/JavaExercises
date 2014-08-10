import java.util.Scanner;

public class Exercise118
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Choose a number: ");
		int num = kb.nextInt();
		
		for ( int x = 1; x <=12 ; x++ )
		{
			System.out.println(num + "x" + x + " = " + (num * x) );
		}
	}
} 
			