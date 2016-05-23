/**
 * @author antoniog
 * APCS
 * 12.14.15
 * The game will tell the user to enter in as many words from the English language beginning 
 * with a random letter from the alphabet.  The user has 60 seconds to enter as many English 
 * words possible starting with the first letter. The program will read the word and check if 
 * it is in the text file and if it starts with the letter assigned . If it is, then the user’s 
 * score will increment by one point, if it is not, then it won’t increment. The user gets one 
 * point for every correct word they enter within 60 seconds, and in the end of the program, the
 *  user’s score will be printed.
 *  I RECIEVED HELP FROM ISABELLE ONLY
 */
import java.util.*;
import java.io.*;
import java.time.Clock;
public class WordGame{ 
	//state variables
	public String letter= randomLetter();
	public int score=0; //this is the score of the user at the begging of the game
	public static String[] letters= {"a","b","c","d","e","f","g","h",
			   "i","j","k","l","m","n","o","p", // string array containing every letter in the alphabet
			   "q","r","s","t","u","v","w","x",
			   "y","z"};
	public static String[] words= new String[2000000]; //2 million spots just in case
	
	/* This method will return a random letter from the alphabet that the user's word will 
	 * have to start with to receive points */
	public static String randomLetter(){
		Random rndm= new Random(); //create instance of random class
		return letters[rndm.nextInt(26)]; //returns a random letter from the array
		}
	/* This method will read the file of English words and store each word in a String array*/
	public static void sortFile() throws IOException {
		int maxIndx=0; //to keep track of the max index in the words array
		Scanner reader= new Scanner(new File("H:\\APCS\\allEnglishWords.txt")); //reads the file with all English words
		//assigns each word in the words array
		while (reader.hasNext()){
			maxIndx++;
			//initialize all text in the file into a String array
			words[maxIndx]=reader.nextLine();
		}	
		reader.close(); //closes scanner
		}
	/* This method will read the user's input and compare it to the words in the list and random letter to check if it is 
	 * correct and then increment the score by one*/
	public void compare(){
		//create scanner and clock instances
		Scanner reader= new Scanner(System.in);
		Clock clock = Clock.systemUTC();
		long start = clock.millis();
		//check if it has been 30 seconds (30000 milliseconds)
		while ((clock.millis() - start)<30000){
			String input= reader.nextLine();
			System.out.println(clock.millis() - start);
			//check if the input is an English word and starts with the letter given
			for(int i=0; i<words.length;i++){
				if (input.equalsIgnoreCase(words[i]) && input.substring(0,1).equalsIgnoreCase(letter)){
					score ++; //if it is then increment the score by one
					words[i]= null; //make it so user cannot get points for the same word twice
				}
			}
		}
		//print out score and let user know game is over, then close scanner
		System.out.println("Your 60 seconds are up!\nYour got a score of: " + score);
		reader.close();
	}
	
}
