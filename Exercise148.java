import java.util.Random;

public class Exercise148
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int high = 0;
		
		int[] arr = new int[10];
		
		System.out.print("Array: ");
		
		for ( int i = 0 ; i < arr.length ; i++ )
		{
			arr[i] = 1 + r.nextInt(100);
			System.out.print(arr[i] + " ");
			
			if ( arr[i] > high )
			high = arr[i];
		}	
		
		System.out.println("The largest value is " + high);
		
	}
}