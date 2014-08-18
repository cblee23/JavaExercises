import java.util.Scanner;
import java.io.File;

class Address
{
	String street;
	String city;
	String state;
	int zip;
	
	public String toString()
	{
		return (this.street + ", " + this.city + ", " + this.state + " " + this.zip);
	}
}

public class Exercise165
{
	public static void main(String[] args) throws Exception
	{
		Address[] addybook = new Address[5];
		
		Scanner fin = new Scanner(new File("fake-addresses.txt"));
		
		for ( int i = 0; i < 5; i++ )
		{
			addybook[i] = new Address();
			addybook[i].street = fin.nextLine();
			addybook[i].city = fin.nextLine();
			addybook[i].state = fin.next();
			addybook[i].zip = fin.nextInt();
			fin.skip("\n");
		}
		fin.close();
		
		for ( int i=0; i < 5; i++ )
		{
			System.out.println( (i + 1) + ". " + addybook[i] );
		}
	}
}