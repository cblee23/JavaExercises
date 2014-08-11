public class Exercise126
{
	public static void main( String[] args )
	{
		for ( int x1 = 1 ; x1 <= 9 ; x1++ )
			for ( int x2 = 0 ; x2 <= 9 ; x2++ )
				for ( int x3 = 0 ; x3 <=9 ; x3++)
					if ( (x1 * x1 * x1) + (x2 * x2 * x2) + (x3 * x3 * x3) == ((x1*100) + (x2*10) + x3) )
						{
							System.out.print(x1 + "" + x2 + "" + x3 + " ");
							System.out.println();
						}
			System.out.println();
	}
}