import java.util.Scanner;

public class Exercise125
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10");
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits");
			System.out.println("3) Quit");
			System.out.println();
			System.out.print(">");
			choice = kb.nextInt();
			System.out.println();
			
			if ( choice == 1 )
			{
				choice1();
				System.out.println();
			}
			
			else if ( choice == 2 )
			{
				choice2();
				System.out.println();
			}
			
			else if ( choice == 3 )
				break;
				
			else
				System.out.println("Error!  This was not an option.  Try again.");
			
		} while ( choice != 3 );
		
	}
	
	public static void choice1()
	{		
		
			for ( int x1 = 1 ; x1 <= 5 ; x1++ )
			{
				for ( int x2 = 0 ; x2 <=9 ; x2++ )
				{
					if ( (x1 + x2) > 10 && ( (x1*10) + x2 <= 56) )
					{
						System.out.print(x1+ "" + x2 + " ");
					}
				}
			}
	}
	
	
	
	
	public static void choice2()
	{
				for ( int x1 = 1 ; x1 <= 9 ; x1++ )
				{
					for ( int x2 = 0 ; x2 <= 9 ; x2++ )
					{
						if ( ((x1*10)+x2) - ((x2*10)+x1) == (x1 + x2) )
						{
							System.out.print(x1 + "" + x2 + " ");
						}
					}
				}
	}
}