import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercise143
{
	public static void main(String[] args) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		int i;
		
		System.out.print("Name (first last): ");
		String name = kb.nextLine();
		System.out.print("File Name: ");
		String file = kb.next();
		System.out.println();
		
		File in = new File(file);
		
		System.out.println("Here are your randomly-selected grades (hope you pass):");
		
		int[] grades = new int[5];
		
		for ( i = 0 ; i < grades.length ; i++ )
		{
			grades[i] = 1 + r.nextInt(100);
			
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
		}
		
		System.out.println();
		System.out.println("Data saved in \"" + file + "\".");
		
		PrintWriter out = new PrintWriter( new FileWriter(file) );
		out.println(name);
		out.println(grades[i]);
	}
} 