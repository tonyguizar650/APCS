/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 * Question 1: The problem with this is that the key words are in a different word, but hold a
 * different meaning, so the key word response should not be implemented. 
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	// greet user
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	//return response for inputted key word
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		//ask about pets when they enter cat or dog
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		//comment on teacher if enter Mr. or Ms. 
		}else if (statement.indexOf("Mr.")>=0 ){
			response= "He seems like a nice teacher.";
		}else if(statement.indexOf("Ms.")>=0){
			response= "She seems like a nice teacher.";
		//ask about weather if input rain, sun or cloud
		}else if (statement.indexOf("rain")>=0
				|| statement.indexOf("sun")>=0
				|| statement.indexOf("cloud")>=0){
			response= "Do you like the weather?";
		//ask about feelings when input happy, sad or mad
		}else if(statement.indexOf("sad")>=0
				|| statement.indexOf("happy")>=0
				|| statement.indexOf("mad")>=0){
			response= "Do you always feel that way? ";
		// says to stop mumbling if enter asdfghjkl
		}else if(statement.indexOf("asdfghjkl")>=0){
			response= "STOP MUMBLING !";
		}
		//else return a random response from whichResponse
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	//returns a random response
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		//numbered responses
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
