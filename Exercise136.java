import java.util.Scanner;
import java.io.File;

public class Exercise136
{
	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Open which file: ");
		String file = kb.next();
		System.out.println();
		
		Scanner fileIn = new Scanner(new File(file));
		
		String text = fileIn.nextLine();
		fileIn.close();
		
		for ( int x = 0 ; x < text.length() ; x++ )
		{
			if ( (x+1) % 3 == 0 )
				System.out.print( text.charAt(x));
		}
		System.out.println();
	}
}
		
		