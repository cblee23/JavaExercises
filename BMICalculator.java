import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		int ft;
		
		System.out.print( "Your height in feet: " );
		ft = keyboard.nextInt();
		
		System.out.print( "Your height in inches: " );
		m = keyboard.nextDouble() * .0254 + ((ft * 12) * .0254);
		
		System.out.print( "Your weight in lbs: " );
		kg = keyboard.nextDouble() *.45;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}