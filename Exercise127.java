public class Exercise127
{
	public static void main( String[] args )
	{
		for ( int num1 = 0 ; num1 <= 45 ; num1++ )
			for ( int num2 = 0 ; num2 <= 45 ; num2++ )
				for ( int num3 = 0 ; num3 <= 45 ; num3++ )
					for ( int num4 = 0 ; num4 <= 45 ; num4++ )
						if ( (num1+2) == (num2-2) && (num2-2) == (num3*2) && (num3*2) == (num4/2) && (num1 + num2 + num3 +num4) == 45 )					
						{
							System.out.print(num1 + " " + num2 + " " + num3 + " " + num4);
						}
				System.out.println();
	}
}