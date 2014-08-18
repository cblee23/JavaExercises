import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

class Car
{
	String make;
	String model;
	int year;
	String license;
}

public class Exercise171
{
	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		
		Car[] c = new Car[5];
		
		for ( int i=0; i<c.length; i++ )
		{
			c[i] = new Car();
			
			System.out.println("Car " + (i+1));
			System.out.print("\tMake: ");
			c[i].make = kb.next();
			System.out.print("\tModel: ");
			c[i].model = kb.next();
			System.out.print("\tYear: ");
			c[i].year = kb.nextInt();
			System.out.print("\tLicense: ");
			c[i].license = kb.next();
			System.out.println();
		}
		
		System.out.print("To which file do you want to save this information? ");
		String file = kb.next();
		
		File in = new File(file);
		
		PrintWriter out = new PrintWriter(new FileWriter(file));
		
		for ( int i = 0; i<c.length; i++ )
		{
			out.println(c[i].make);
			out.println(c[i].model);
			out.println(c[i].year);
			out.println(c[i].license);
		}
		
		out.close();
		
	}
}