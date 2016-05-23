/**
 * @author antoniog
 * P15
 * 10.1.15
 * This class will contain the methods to deposit and withdraw money into an account and will be used in a different class
 * MODIFIED ON THURSDAY, JANUARY 14, 2016
 * MODIFIED ON MONDAY, FEBRUARY 1, 2016
 * MODIFIED ON WEDNESDAY, MARCH 30, 2016
 */
public class BankAccount implements Comparable {
	//declare state variables
	private double balance=0;
	private String name;
	
	public BankAccount(double balance, String name){
		//use this balance and name... closest one	
		this.balance = balance;
		this.name = name;
	}
	//deposit is added to the balance
	public void deposit(double numAmount){
		balance += numAmount;
	}
	//withdraw is subtracted from the balance
	public void withdraw(double numAmount){
		balance -= numAmount;
	}
	//returns the account balance
	public double getBalance(){
		return balance;
	}
	//returns the account name
		public String getName(){
			return name;
	}
	//compareTo method compares alphabetically
	@Override
	public int compareTo(Object obj) {
		if (name.equals(((BankAccount)obj).getName())){
			return 0;
		} else if(name.compareTo(((BankAccount)obj).getName()) > 0){
			return 1;
		} else{
			return -1;
		}
	}
}
