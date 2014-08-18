import java.util.Scanner;

class Student
{
	String name;
	int grade;
	double average;
}

public class Exercise168
{
	public static void main(String[] args)
	{
		Student[] s = new Student[3];
		
		Scanner kb = new Scanner(System.in);
		
		for ( int i = 0 ; i<s.length; i++ )
		{
			s[i] = new Student();
			System.out.print("Enter student " + (i+1) + "'s name: ");
			s[i].name = kb.next();
			System.out.print("Enter student " + (i+1) + "'s grade: ");
			s[i].grade = kb.nextInt();
			System.out.print("Enter student " + (i+1) + "'s average: ");
			s[i].average = kb.nextDouble();
			System.out.println();
		}
		
		
		System.out.println("The names are: " + s[0].name + " " + s[1].name + " " + s[2].name);
		System.out.println("The grades are: " + s[0].grade + " " + s[1].grade + " " + s[2].grade);
		System.out.println("The averages are: " + s[0].average + " " + s[1].average + " " + s[2].average);
		
	}
}