public class Exercise69
{
	public static void main( String[] args )
	{
		double x, y;
		System.out.println( "x\ty");
		System.out.println( "-----------------" );
		
		for ( x = -10 ; x <= 10 ; x += 0.5 )
		{
		    y = x*x;
			System.out.println( x + "\t" + y );
		}
	}
}