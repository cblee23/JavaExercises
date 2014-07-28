import java.util.Scanner;

public class Exercise17
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String first_name, last_name, login;
		int grade;
		double id, gpa;
		
		System.out.println( "Please enter the following information, so I can sell it for a profit!" );
		System.out.println();
		
		System.out.print( "First name: " );
		first_name = keyboard.next();
		
		System.out.print( "Last name: " );
		last_name = keyboard.next();
		
		System.out.print( "Grade (9-12): " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		id = keyboard.nextDouble();
		
		System.out.print( "Login: " );
		login = keyboard.next();
		
		System.out.print( "GPA (0.0-4.0): " );
		gpa = keyboard.nextDouble();
		System.out.println();
		
		System.out.println( "Your information: ");
		System.out.println( "\tLogin: " + login );
		System.out.println( "\tID: " + id );
		System.out.println( "\tName: " + last_name + ", " + first_name );
		System.out.println( "\tGPA: " + gpa );
		System.out.println( "\tGrade: " + grade );
	}
}