import java.util.Scanner;

/**
 * TONY G.
 * 10.19.15
 * A simple class to run the Magpie5 class.
 */
public class MagpieRunner5
{

	/**
	 * Create a Magpie, give it user input, and print what its replies.
	 */
	public static void main(String[] args)
	{
		Magpie5 maggie = new Magpie5();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
