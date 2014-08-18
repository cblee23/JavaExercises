import java.util.Scanner;
import java.io.File;

class Car
{
	String make;
	String model;
	int year;
	String license;
}

public class Exercise172
{
	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("From which file do you want to load this information? ");
		String file = kb.next();
		System.out.println("Data loaded.");
		System.out.println();
		
		Scanner inFile = new Scanner(new File(file));
		
		Car[] c = new Car[5];
		
		for ( int i=0; i<c.length; i++ )
		{
			c[i] = new Car();
			
			c[i].make = inFile.next();
			c[i].model = inFile.next();
			c[i].year = inFile.nextInt();
			c[i].license = inFile.next();
		
			System.out.println("Car " + (i+1));
			System.out.println("\tMake: " + c[i].make);
			System.out.println("\tModel: " + c[i].model);
			System.out.println("\tYear: " + c[i].year);
			System.out.println("\tLicense: " + c[i].license);
			System.out.println();
		}
		inFile.close();
	}
}
		