public class ElseAndIf
{
	public static void main( String [] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		//else if looks at that statement if the if statement is false to determine if this one is true.
		// else determines if all prior statements are false, then the else statements will run.
		
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		if (cars < people ) //removing the else from this else if statement means that the else underneath looks at only this statement to determine whether it should run.
		{
			System.out.println( "We should not take the cars." );
		}
		else 
		{
			System.out.println( "We can't decide." );
		}
		
		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{	
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}
		
		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}
	}
}	