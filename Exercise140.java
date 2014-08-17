import java.util.Random;

public class Exercise140
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int arr[] = new int[10];
		int i;
	
		
		for ( i = 0 ; i < arr.length ; i++ )
		{
			arr[i] = 1 + r.nextInt(100);
			System.out.println("Slot " + i + " contains a " + arr[i]);
		}	
	}
}
		