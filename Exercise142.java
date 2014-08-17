import java.util.Random;

public class Exercise142
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int[] arr = new int[10];
		int i;
		
		System.out.print("Array 1: ");
		
		for ( i = 0; i < arr.length; i++)
		{
			if ( i <= 8)
			{
				arr[i] = 1 + r.nextInt(100);
				System.out.print(arr[i] + " ");
			}
			else if (i == 9)
				System.out.print("-7");
		}
		System.out.println();
		
		System.out.print("Array 2: ");
		
		for ( i = 0; i < arr.length; i++ )
		{
			arr[9] = 1 + r.nextInt(100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}