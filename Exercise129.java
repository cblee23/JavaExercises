import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercise129
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter file;
		Scanner keyboard = new Scanner(System.in);
		
		int score = 0;
		String name;
		
		file = new PrintWriter( new FileWriter("score.txt"));
		
		System.out.println("You got a high score!");
		System.out.println();
		System.out.print("Please enter your score: ");
		score = keyboard.nextInt();
		System.out.print("Please enter your name: ");
		name = keyboard.next();
		System.out.println("Data stored into score.txt.");
		
		file.println(score);
		file.println(name);
		file.close();
		
	}
}
			
		
		