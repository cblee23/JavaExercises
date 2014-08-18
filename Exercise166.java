import java.util.Scanner;

class Student
{
	String name;
	int grade;
	double average;
	
}

public class Exercise166
{
	public static void main(String[] args)
	{
		Student one, two, three;
		Scanner kb = new Scanner(System.in);
		
		one = new Student();
		System.out.print("Enter the first student's name: ");
		one.name = kb.next();
		System.out.print("Enter the first student's grade: ");
		one.grade = kb.nextInt();
		System.out.print("Enter the first student's average: ");
		one.average = kb.nextDouble();
		
		two = new Student();
		System.out.print("Enter the 2nd student's name: ");
		two.name = kb.next();
		System.out.print("Enter the 2nd student's grade: ");
		two.grade = kb.nextInt();
		System.out.print("Enter the 2nd student's average: ");
		two.average = kb.nextDouble();
		
		three = new Student();
		System.out.print("Enter the 3rd student's name: ");
		three.name = kb.next();
		System.out.print("Enter the 3rd student's grade: ");
		three.grade = kb.nextInt();
		System.out.print("Enter the 3rd student's average: ");
		three.average = kb.nextDouble();
		
		System.out.print("The names are: " + one.name + " " + two.name + " " + three.name + "\n");
		System.out.print("The grades are: " + one.grade + " " + two.grade + " " + three.grade + "\n");
		System.out.print("The averages are: " + one.average + " " + two.average + " " + three.average + "\n");
		
		double totalavg = (one.average + two.average + three.average) / 3;
		
		System.out.println();
		System.out.println("The average for the three students is: " + totalavg);
	}
}