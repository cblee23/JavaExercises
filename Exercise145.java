import java.util.Scanner;
import java.util.Random;

public class Exercise145
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Random r = new Random();
		
		int[] arr = new int[10];
		
		int toFind;
		
		System.out.print("Array: ");
		
		for ( int i = 0 ; i < arr.length ; i++ )
		{
			arr[i] = 1 + r.nextInt(50);
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("Value to find: ");
		toFind = kb.nextInt();
		System.out.println();
		
		int times = 0;
		
		for ( int num : arr )
		{
			if ( num == toFind )
			{
				times++;	
			}
		}
		System.out.println(toFind + " was found " + times + " time(s)." );
	}
}
		
	