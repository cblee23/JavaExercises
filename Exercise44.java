import java.util.Random;

public class Exercise44
{
	public static void main( String[] args )
	{
		Random r = new Random();
		
		int fortune = 1 + r.nextInt(6), a, b, c, d, e, f;
		String response = " ";
		
		if ( fortune == 1 )
			response = "You will find happiness with a new love.";
		else if ( fortune == 2 )
			response = "You will eat a McRib leading to a stain on your new shirt.";
		else if ( fortune == 3 ) 
			response = "You will pick up an addiction to pink lemonade.";
		else if ( fortune == 4 )
			response = "In a sad turn of events, you will lose your job.";
		else if ( fortune == 5 )
			response = "You will drop your phone.  The screen will crack.";
		else if ( fortune == 6 )
			response = "You will wash your car.  It will rain 2 hours later.";
		
		System.out.println( "Fortune cookie says: " + response );
		
		a = 1 + r.nextInt(54);
		b = 1 + r.nextInt(54);
		c = 1 + r.nextInt(54);
		d = 1 + r.nextInt(54);
		e = 1 + r.nextInt(54);
		f = 1 + r.nextInt(54);
		
		System.out.println( "\t" + a + " - " + b + " - " + c + " - " + d + " - " + e + " - " + f );
	}
}		