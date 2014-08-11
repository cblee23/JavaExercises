import java.util.Scanner;
import java.io.File;

public class Exercise130
{
	public static void main( String[] args ) throws Exception
	{
		Scanner file = new Scanner(new File("3nums.txt"));
		
		int a, b, c, sum;
		
		System.out.println("Reading numbers from file \"3nums.txt\"...done.");
		System.out.println();
		
		a = file.nextInt();
		b = file.nextInt();
		c = file.nextInt();
		file.close();
		
		sum = a + b + c;
		System.out.println( a + "+" + b + "+" + c + " = " + sum);
	}
}