import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age, ft, inches;
		double weight;
		
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		
		System.out.print( "How many feet tall are you? " );
		ft = keyboard.nextInt();
		
		System.out.print( "And how many inches? " );
		inches = keyboard.nextInt();
		
		System.out.print( "How much do you weight? " );
		weight = keyboard.nextDouble();
		
		System.out.println( "So you're " + age + " old, " + ft + "'"+ inches + "\" tall and " + weight + " heavy." );
	}
}