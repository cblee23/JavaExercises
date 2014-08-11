public class Exercise123
{
	public static void main( String[] args )
	{
		for ( int n = 10 ; n < 100 ; n++ )
		{
			for ( int x = 10 ; x < 100 ; x++ )
			{
				if ( n + x == 60 && (n - x == 14 || x - n == 14) )
					System.out.println(x + " " + n);
			}
		}	
	}
}