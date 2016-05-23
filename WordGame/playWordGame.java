import java.io.IOException;

/**
 * @author antoniog
 * APCS
 * 12.14.15
 * This class implements the game in WordGame.java
 * I ONLY RECIEVED HELP FROM ISABELLE
 */
public class playWordGame {
	/** This main method will implement the Word Game/call the play() method in order to do that*/
	public static void main(String[] args) throws IOException {
		play();

	}
	/** This method calls all methods in the WordGame.java class in order to play the game */
	public static void play() throws IOException {
		//create an instance of the class
		WordGame game= new WordGame();
		//give user directions
		System.out.println("You have 60 seconds to enter as many English words that start with the letter "
				+ game.letter + ": ");
		//sort word file into array
		WordGame.sortFile();
		//compare input to conditions to give user points
		game.compare();
	}

}
