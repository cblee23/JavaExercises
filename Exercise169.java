import java.util.Scanner;
import java.io.File;

class Dog
{
	String breed;
	int age;
	double weight;
}

public class Exercise169
{
	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Which file to open: ");
		String file = kb.next();
		
		Scanner inFile = new Scanner(new File(file));
	
		Dog one, two;
		
		one = new Dog();
		one.breed = inFile.next();
		one.age = inFile.nextInt();
		one.weight = inFile.nextDouble();
		System.out.print("First dog: " + one.breed + ", " + one.age + ", " + one.weight);
		System.out.println();
		
		two = new Dog();
		two.breed = inFile.next();
		two.age = inFile.nextInt();
		two.weight = inFile.nextDouble();
		System.out.print("Second dog: " + two.breed + ", " + two.age + ", " + two.weight);
		
		inFile.close();
		
		System.out.println();
	}
}
		