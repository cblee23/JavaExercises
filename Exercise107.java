import java.util.Scanner;

public class Exercise107
{
	public static void main( String[] args )
	{
		System.out.println("Here we go.");

		System.out.println();
		System.out.println("Some random numbers, if you please: ");
		int lo, hi, val1 = 0, val2 = 0;
		lo = 1;
		hi = 10;
		val1 = superrand(lo,hi);
		val2 = superrand(lo,hi);
		System.out.println("First: " + val1 );
		System.out.println("Second: " + val2 );
		
		if ( val1 == val2 )
			System.out.println("Hey!  They were the same!");
		else
			System.out.println("They were not the same.");

		System.out.println();
		System.out.print("More counting, but this time not by ones: ");
		stepcount(2, 10, 2);
		stepcount(10, 2, 2);

		System.out.println();
		System.out.println("Let's figure a project grade.");
		int a=4,b=3,c=4,d=5,e=2,f=1, result=999;
		
		System.out.println("434521 -> " + project_grade(a, b, c, d, e, f));

		System.out.println();
		System.out.print("Finally, some easy ones.");

		String nombre = "ERROR";
		nombre = get_name();
		System.out.println("Hi, " + nombre );

		System.out.println();
		System.out.println("Do you feel lucky, punk?");
		crash();
	}

	public static int superrand(int a, int b)
	
	{
		// picks a number between a and b, no matter which is larger
		int c;

		if ( a < b )	
			c = a + (int)(Math.random()*(b-a+1));
		else if ( a > b )	
			c = b + (int)(Math.random()*(a-b+1));
		else
			c = a;	

		return c;
	}

 	public static int stepcount(int first, int last, int step)
	
	{
		int x;

			if ( first < last )
			{
				x = first;
				while ( x <= last )
				{
					System.out.print(x + " ");
					x = x + step;
				}
			}
			else
			{
				x = first;
				while ( x >= last )
				{
					System.out.print(x + " ");
					x = x - step;
				}
			}
		
	return x;

	}

	public static int project_grade(int p1, int p2, int p3, int p4, int p5, int p6)

	{
		int overall_grade;

		overall_grade = p1 * 6;    
		overall_grade = overall_grade + ( p2 * 6 );   
		overall_grade = overall_grade + ( p3 * 4 );   
		overall_grade = overall_grade + ( p4 * 2 );   
		overall_grade = overall_grade + ( p5 * 1 );  
		overall_grade = overall_grade + ( p6 * 1 );  

		return overall_grade;
	}

	public static String get_name()
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		System.out.print("Please enter your name: ");
		name = keyboard.next();

		return name;
	}

	public static void crash()
	{
		String magic_word;

		if ( (int)(Math.random()*10) == 0 )
		{
		
			magic_word = "win";
		}
		else
		{
			magic_word = "lose";
		}

		System.out.println("you " + magic_word);

	}


}