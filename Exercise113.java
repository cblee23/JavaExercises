public class Exercise113
{
	public static void main( String[] args )
	{
		for( int x=2 ; x <= 20 ; x++ )
		{
			if ( isPrime(x) )
				System.out.println(x + " <");
			else
				System.out.println(x);
				
		}
	}
	
	public static boolean isPrime( int n )
	{
		for ( int x = 2; x < n; x++ )
		{
			if ( n % x == 0 )
				return false;
		}
		return true;
	}
}