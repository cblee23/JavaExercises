import java.util.Scanner;

public class Exercise151
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[] name = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
		double[] grade = { 99.5, 78.5, 95.6, 96.8, 82.7 };
		int[] ID = { 123456, 813225, 823669, 307760, 827131 };
		
		System.out.println("Values:");
		
		for ( int i = 0 ; i < name.length ; i++ )
		{
			System.out.println( name[i] + " " + grade[i] + " " + ID[i] );
		}
		
		System.out.print("ID number to find: ");
		int findID = kb.nextInt();
		
		boolean found = false;
		
		for ( int x = 0 ; x < ID.length ; x++)
		{
			if ( findID == ID[x] )
			{
				System.out.print("Found in slot " + x + "\n\t");
				System.out.print("Name: " + name[x] + "\n\t");
				System.out.print("Average: " + grade[x] + "\n\t");
				System.out.print("ID: " + ID[x]);
				System.out.println();
				found = true;
			}
		}	
			if (found == false)
				System.out.println("That ID number was not found.");
		
	}
}