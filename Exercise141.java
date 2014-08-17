import java.util.Random;

public class Exercise141
{
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int[] arr = new int[1000];
		int i;
		
		for ( i = 0 ; i < arr.length ; i++ )
		{
			arr[i] = 10 + r.nextInt(89);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}