/**
 * @author antoniog
 * APCS
 * 3.31.16
 * This program will sort BankAccount objects by balance using the comparator interface
 */
import java.util.*;

public class CompareBA implements Comparator{
	public int compare (Object obj1, Object obj2){
		BankAccount ba1= (BankAccount)obj1;
		BankAccount ba2= (BankAccount)obj2;
		return (int)ba1.getBalance() - (int)ba2.getBalance();
	}
}
