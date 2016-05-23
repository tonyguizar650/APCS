/**
 * Tony G. and Dylan B.
 * APCS
 * 12.4.15
 * This class tests the MonteCarlo class
 *
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cirCount = 0;
		int sqrCount = 0;
		MonteCarlo mcObj = new MonteCarlo(5,3,2);//creates MonteCarlo object
		for (int i = 0; i < 100000000; i++){
			double xCord = mcObj.nextRainDrop_x();//sets the variable to a random x coordinate
			double yCord = mcObj.nextRainDrop_y();//sets the variable to a random y coordinate
			if(mcObj.insideCircle(xCord, yCord)){//checks if true
				cirCount++; //increments variable
			}
			sqrCount++; //increments variable
		}
		System.out.print((cirCount * (Math.pow(2* mcObj.r,2))) / (sqrCount * Math.pow(mcObj.r,2))); //approximates PI
	}

}
