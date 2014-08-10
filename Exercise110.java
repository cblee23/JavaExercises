import java.util.Scanner;

public class Exercise110
{
	public static void main( String[] args )
	{
		
		int choice, keychains = 0;
		double tax = .0825, shipping = 5.00, shipperkc = 1.00, price = 10.00;
		Scanner kb = new Scanner(System.in);

		do
		{
			
			System.out.println("Ye Olde Keychain Shoppe");
			System.out.println();
	
			System.out.println("1.  Add Keychains to Order");
			System.out.println("2.  Remove Keychains from Order");
			System.out.println("3.  View Current Order");
			System.out.println("4.  Checkout");
			System.out.println();
		
			System.out.print("Please enter your choice: ");
			choice = kb.nextInt();
		
			
			if ( choice == 1 )
			{
				keychains = add_keychains(keychains);
			}
		
			else if ( choice == 2 )
			{
				keychains = remove_keychains(keychains);				
			}
				
			else if ( choice == 3 )
				view_order(keychains, price, tax, shipping, shipperkc);
			
			else if ( choice == 4 )
				checkout(keychains, price, tax, shipping, shipperkc);
			
			else
			{
				System.out.println("Error! Select one of the options above!");
				choice = kb.nextInt();
			}
		
		} while (choice != 4);
		
	}
	
	public static int add_keychains(int keychains)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("You have " + keychains + " keychains.  How many to add? ");
		int addkeys = kb.nextInt();
		keychains = keychains + addkeys;
		System.out.println(" You now have " + keychains + " keychains.");
		return keychains;
	}
	
	public static int remove_keychains(int keychains)
	{
		Scanner kb = new Scanner(System.in);
		do
		{
			System.out.print("You have " + keychains + " keychains.  How many to remove? ");
			int removekeys = kb.nextInt();
			keychains = keychains - removekeys;
			
			if ( keychains < 0 )
			{
				System.out.println("You can't have negative keychains!  Try again.");
				keychains = keychains + removekeys;
			}
		} while ( keychains < 0 );
		
		System.out.println("You now have " + keychains + " keychains.");
		System.out.println();
		return keychains;
	}
	
	public static void view_order(int keychains, double price, double tax, double shipping, double shipperkc)
	{
		double subtotal = price * keychains;
		double totaltax = tax * subtotal;
		double totalship = shipping + (keychains * shipperkc);
		double total = subtotal + totaltax + totalship;
		System.out.print("You have " + keychains + " keychains.");
		System.out.println("Keychains cost $" + price + " each.");
		System.out.println("The subtotal is $" + subtotal + "." );
		System.out.println("The cost of tax is $" + totaltax + ".");
		System.out.println("The cost of shipping is $" + totalship + ".");
		System.out.println("The total cost is $" + total + ".");
		System.out.println();
	}
	
	public static void checkout(int keychains, double price, double tax, double shipping, double shipperkc)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = kb.next();
		view_order(keychains, price, tax, shipping, shipperkc);
		System.out.println("Thanks for your order, " + name + "!" );
		System.out.println();
		System.out.println();

	}
}