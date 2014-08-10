public class Exercise112
{
	public static void main( String[] args )
	{
		for ( int x = 1 ; x <= 20 ; x++ )
		{
			if ( isEven(x) && isDivisibleBy3(x))
				System.out.println(x + " <=");
			
			else if ( isDivisibleBy3(x) )
				System.out.println(x + " =");
				
			else if ( isEven(x) )
				System.out.println(x + " <");
				
			else
				System.out.println(x);
		}
	}
	
	public static boolean isEven( int x )
	{
		return (x%2 == 0);
	}
	
	public static boolean isDivisibleBy3( int x )
	{
		return (x%3 == 0);
	}
}