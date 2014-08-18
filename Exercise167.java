import java.util.Scanner;

class Student
{
	String name;
	int grade;
	double average;
}

public class Exercise167
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		Student[] s = new Student[3];
		
		s[0] = new Student();
		System.out.print("Enter student 1's name: ");
		s[0].name = kb.next();
		System.out.print("Enter student 1's grade: ");
		s[0].grade = kb.nextInt();
		System.out.print("Enter student 1's average: ");
		s[0].average = kb.nextDouble();
		System.out.println();
		
		s[1] = new Student();
		System.out.print("Enter student 2's name: ");
		s[1].name = kb.next();
		System.out.print("Enter student 2's grade: ");
		s[1].grade = kb.nextInt();
		System.out.print("Enter student 2's average: ");
		s[1].average = kb.nextDouble();
		System.out.println();
		
		s[2] = new Student();
		System.out.print("Enter student 3's name: ");
		s[2].name = kb.next();
		System.out.print("Enter student 3's grade: ");
		s[2].grade = kb.nextInt();
		System.out.print("Enter student 3's average; ");
		s[2].average = kb.nextDouble();
		System.out.println();
		
		System.out.println("The names are: " + s[0].name + " " + s[1].name + " " + s[2].name);
		System.out.println("The grades are: " + s[0].grade + " " + s[1].grade + " " + s[2].grade);
		System.out.println("The averages are: " + s[0].average + " " + s[1].average + " " + s[2].average);
	}
}