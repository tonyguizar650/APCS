import java.io.*;
import java.util.*; //includes ArrayList
import java.text.*; //for NumberFormat
public class Tester
{
	public static void main(String args[])
	{
		NumberFormat formatter = NumberFormat.getNumberInstance( );
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		//Instantiate an ArrayList object here called aryList
		List aryList= new ArrayList();
		do	
		{
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort)");
			name = kbReader.nextLine( );
			if( !name.equalsIgnoreCase("EXIT") )
			{
				System.out.print("Please enter the amount of the deposit. ");
				double amount = kbReader.nextDouble();
				System.out.println(" "); //gives an eye-pleasing blank line
				// Create a BankAccount object
				BankAccount acc= new BankAccount(amount,name);
				// Add it to the ArrayList object
				 aryList.add(acc);
			}
		}while(!name.equalsIgnoreCase("EXIT"));

		//Search aryList and print out the name and amount of the largest bank account
		BankAccount ba = (BankAccount) aryList.get(0);
		double maxBalance = ba.getBalance();
		String maxName = ba.getName();
		for(int j = 1; j < aryList.size( ); j++)
		{
			if (((BankAccount) aryList.get(j)).getBalance() > maxBalance){
				maxBalance= ((BankAccount) aryList.get(j)).getBalance();
				maxName= ((BankAccount) aryList.get(j)).getName();
			}
		}
		System.out.println("Largest Bank Account: " + maxName + " $" + maxBalance);
	}
}
