import java.util.Scanner;
import java.io.File;

public class Exercise131
{
	public static void main( String[] args ) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Which file would you like to read numbers from: ");
		String txtfile = kb.next();
		
		Scanner file = new Scanner(new File(txtfile));
		
		int a, b, c, sum;
		
		System.out.println("Reading numbers from file " + txtfile + "...done.");
		System.out.println();
		
		a = file.nextInt();
		b = file.nextInt();
		c = file.nextInt();
		file.close();
		
		sum = a + b + c;
		System.out.println( a + "+" + b + "+" + c + " = " + sum);
	}
}