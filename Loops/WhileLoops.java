/**
 * Tony Guizar
 * APCS
 * P12 while loops
 * 9.11.15
 * This program will implement 3 methods, average, typingTest, and collatz
 */
import java.util.*;
public class WhileLoops {
	//this is the main method responsable for calling the 3 functions
	public static void main(String args[]){
		average();
		typingTest("platypus");
		System.out.println("It took " + (collatz(459)) + " times to get to 1.");
	}

	//this program will take the average of the numbers inputed and print it as well as the amount of numbers entered
	public static void average(){
		//create a sccanner for input
		Scanner scanner = new Scanner(System.in);
		double numInput,numTotal=0;
		int numNums=0;
		//ask the user for a number until they enter 0
		while (true){
			//create ask the user for the amount
			System.out.println("Enter a number (0 to stop): ");
			numInput = scanner.nextDouble();
			if (!(numInput==0)){
				numNums+=1;
				//add together all inputed numbers
				numTotal+=numInput;
			}else{
				//stop the while loop
				break;
			}
		}
		//find the average of the numbers
		double numAverage= numTotal/numNums;
		System.out.println("you entered " + numNums + " numbers and the average is " + numAverage);
		
	}
	
	//this function will create a typing test for a word
	//takes the parameter word that is a string
	public static void typingTest(String word){
		//create a scanner for input
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		//keep asking question until user types it in correctly
		while (true){
			//ask the user to type the word in correctly
			System.out.println("Please type "+ word + ": ");
			String input= scanner.next();
			//if the user enters the word correctly
			if (input.equalsIgnoreCase(word)){
				System.out.println("GOOD JOB!");
				break;
			}
		}
	}
	
	//this function will run the collatz conjecture
	//includes an int parameter that is the starting number
	public static int collatz(int num){
		//create a sccanner for input
		Scanner scanner = new Scanner(System.in);
		//create a variable to track the number of times it takes to reach to one
		int numTimes=0;
		System.out.println("Your starting number is " + num + ".");
		//repeat until the break
		while (num>1){
			//if the number is even
			if (num%2==0){
				num/=2;
				System.out.println(numTimes + ": " + num);
				numTimes+=1;
			}else{
				num=num*3+1;
				System.out.println(numTimes + ": " + num);
				numTimes+=1;
			}
		}
		//remove 1 for the starting int
		numTimes-=1;
		//return number of times taken to get to 1
		return numTimes;
	}
}
