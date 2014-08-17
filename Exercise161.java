import java.util.Random;

public class Exercise161
{
	public static void bubble_sort( int[] a )
	{
		boolean swapped = true;
		int x = 0;
		
		
		while (swapped) 
		{
			swapped = false;
			x++;
			
			for( int i = 0; i < a.length - x; i++ )
			{
				if ( a[i] > a[i + 1] )
				{
					swap( a, i, i + 1 );
					swapped = true;
				}	
			}
		}
	}


	public static void swap( int[] a , int i, int j )
	{
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		bubble_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}