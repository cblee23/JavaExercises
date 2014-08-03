import java.util.Scanner;

public class Exercise39
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		
		System.out.print( "What's your last name? " );
		name = keyboard.next();
		
		if ( name.compareTo("Carswell") <= 0 )
			System.out.println( "You don't have to wait long, " + name + "." );
		
		else if ( name.compareTo("Jones") <= 0 )
			System.out.println( "That's not bad, " + name + "." );
			
		else if ( name.compareTo("Smith") <= 0 )
			System.out.println( "Looks like a bit of a wait, " + name + "." );
		
		else if ( name.compareTo("Young") <= 0 )
			System.out.println( "It's gonna be a while, " + name + "." );
		
		else if ( name.compareTo("Young") > 0 )
			System.out.println( "Not going anywhere for a while, " + name +"." );
			
	}
}