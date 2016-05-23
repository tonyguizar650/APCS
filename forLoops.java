/**
 * Tony Guizar
 * APCS
 * P11
 * 9.9.15
 * This program has 3 methods: 1) Name Reversal 2) Countdown and 3)Multiplication Table
 */
import java.util.*;

public class forLoops {
	//this main method will be used to call the functions of the program
	public static void main(String args []){
		System.out.println(nameReversal);
	}
	
	//this function will be used to reverse the inputed string (name)
	public static String nameReversal(){
		//ask the user for name and store that in name variable
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your full name?");
		String name = scanner.nextLine();
		
		String newName;
		//for loop to add each character to the end of a new string to reverse the name
		for(int i=0; i<name.length();i++){
			char ch=name.charAt(i);
			newName+=ch;
		}
		return newName.toLowerCase();
	}
	//this function will countdown from 100 to 0 inclusive
	public static void countdown(){
		//use for loop to print the number counting down each time
		for (int i=100; i>=0; i--){
			System.out.println(i);
		}
	}
	//this function will print out a whole multipliaction table
	public static void multTable(){
		
	}
}
