import java.util.Scanner;
import java.io.File;

public class Exercise133
{
	public static void main( String[] args ) throws Exception
	{
		String file;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Open which file: ");
		file = kb.next();
		
		Scanner fileIn = new Scanner(new File(file));
		
		while ( fileIn.hasNextLine() )
		{
			String line = fileIn.nextLine();
			System.out.println(line);
		}
		
	}
}