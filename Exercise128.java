import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercise128
{
	public static void main( String[] args ) throws Exception
	{
		PrintWriter fileout;
		
		fileout = new PrintWriter( new FileWriter("letter.txt") );
		
		fileout.println( "+--------------------------------------------+" );
		fileout.println( "|                                       #### |" );
		fileout.println( "|                                       #### |" );
		fileout.println( "|                                       #### |" );
		fileout.println( "|                                            |" );
		fileout.println( "|                                            |" );
		fileout.println( "|                      Chris Lee             |" );
		fileout.println( "|                      6436 Beckman Glen Ct. |" );
		fileout.println( "|                      Las Vegas, NV 89141   |" );
		fileout.println( "|                                            |" );
		fileout.println( "+--------------------------------------------+" );
		fileout.close();
	}
}