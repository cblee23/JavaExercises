import java.util.Scanner;

public class Exercise156
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };
		String enemy = "STARMIE";
		
		int choice;
		int pokemon = 0 + (int)(Math.random()* pokeParty.length);
		int pokemon2 = 0 + (int)(Math.random()* pokeParty.length);
		
		System.out.println("Misty sent out " + enemy + "!");
		
		System.out.println("\n" + enemy + "\t\t Lv21");
		System.out.println("    HP [====================]\n");
		
		System.out.println("What will " + pokeParty[pokemon] + " do?");
		System.out.println("\t1.  Fight");
		System.out.println("\t2.  Swap Pokemon");
		System.out.println("\t3.  Run");
		System.out.print("> ");
		choice = kb.nextInt();
		
		if ( choice == 1 )
		{
			System.out.println( pokeParty[pokemon] + " used THUNDERSHOCK!  It's super effective.");
			
			System.out.println("\nSTARMIE\t\t Lv21");
			System.out.println("    HP [============     ]\n");
			
			System.out.println( enemy + " used WATER PULSE!");
			System.out.println( pokeParty[pokemon] + " fainted.");
		}
		
		if ( choice == 2 )
		{
			System.out.println("\n" + pokeParty[pokemon] + " swaps out with " + pokeParty[pokemon2] + "!\n" );
						
			System.out.println( pokeParty[pokemon] + " used BITE! It's super effective.");
			
			System.out.println("\nSTARMIE\t\t Lv21");
			System.out.println("    HP [               ]\n");
			
			System.out.println( enemy + " fainted.\n");
			System.out.println(pokeParty[pokemon] + " gained 155 EXP. Points!");
			System.out.println(pokeParty[pokemon2] + " gained 155 EXP. Points!");
			System.out.println("Received TM03 - WATER PULSE.");
			System.out.println("Received CASCADEBADGE.");
			System.out.println("Received $2100");
		}
		
		if ( choice == 3 )
		{
			System.out.println(pokeParty[pokemon] + " couldn't run.  Skip a turn, coward.");
			
			System.out.println("nSTARMIE\t\t Lv21");
			System.out.println("    HP [=====================]\n");
			
			System.out.println(enemy + " used WATER PULSE!");
			System.out.println(pokeParty[pokemon] + " fainted.");
		}
	}
}