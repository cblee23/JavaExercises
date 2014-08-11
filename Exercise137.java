import java.util.Scanner;
import java.io.File;

public class Exercise137
{
	public static void main(String[] args) throws Exception
	{
	
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Open which file: ");
		String file = kb.next();
		System.out.println();
		
		Scanner fileIn = new Scanner(new File(file));
		
		
		while ( fileIn.hasNextLine() )
		{
			String line = fileIn.nextLine();
		
			for ( int x = 0 ; x < line.length() ; x++ )
			{
				char c = line.charAt(x);
			
				if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
					System.out.print( Character.toUpperCase(c) );
				else
					System.out.print(c);
			}
			System.out.println();
		}
	}
}
		
		