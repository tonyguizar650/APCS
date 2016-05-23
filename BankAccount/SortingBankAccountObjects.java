/**
 * @author antoniog
 * This file will include 3 methods that sort BankAccount objects alphabetically and using comparator
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class SortingBankAccountObjects {
	public static void main (String[] args){
		NumberFormat formatter= NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMinimumFractionDigits(2);
		
		String name;
		int j;
		//create new BankAccount object array
		BankAccount[] ba= new BankAccount[5];
		for(j=0; j<ba.length; j++){
			Scanner kbReader= new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs: ");
			name= kbReader.nextLine();
			
			System.out.print("Please enter the amount of the deposit");
			double amount= kbReader.nextDouble();
			System.out.println(" ");
			//instantiate object by creating new BankAccount
			ba[j]= new BankAccount(amount,name);
		}
		
		//sort array
		Arrays.sort(ba);
		for(int i=0; i<ba.length; i++){
			System.out.println(ba[i].getName() + ">>> " + ba[i].getBalance());
		}
	}
}
