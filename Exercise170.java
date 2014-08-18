import java.util.Scanner;
import java.io.File;

class Person
{
	String name;
	int age;
}

public class Exercise170
{
	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Which file to open: ");
		String file = kb.next();
		System.out.println("Reading data from " + file);
		System.out.println();
		
		Scanner inFile = new Scanner(new File(file));
		
		Person[] p = new Person[5];
		
		for ( int i = 0; i<p.length; i++ )
		{
			p[i] = new Person();
			p[i].name = inFile.next();
			p[i].age = inFile.nextInt();
			
			System.out.print(p[i].name + " is " + p[i].age);
			System.out.println();
		}
	}
}