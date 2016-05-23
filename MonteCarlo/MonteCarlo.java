/**
 * Tony G. and Dylan B.
 * APCS
 *12.4.15
 * We worked together, and received help from Isabelle on static vs. non static
 * Determines whether a given raindrop falls within a given circle
 */
import java.util.*;
public class MonteCarlo {
	//create instance variables
	public double h,k,r;
	private Random rndm = new Random(); //creates random instance
	public MonteCarlo(double x, double y, double radius){
		h = x;
		k = y;
		r = radius;
	}
	/* This method returns a random x coordinate within given area*/
	public double nextRainDrop_x(){
		double x = (h - r) + (2*r)*rndm.nextDouble(); //creates random x val 
		return x;
	}
	/* This method returns a random y coordinate within given area */
	public double nextRainDrop_y(){
		double y = (k - r) + (2*r)*rndm.nextDouble(); //creates random y val
		return y;
	}
	/* returns true if raindrop is inside circle or on edge of circle, else it is false */
	public boolean insideCircle(double x, double y){
		double dist = Math.sqrt(Math.pow((x - h), 2) + Math.pow((y - k), 2));
		if (dist <= r){ //if the distance from the raindrop to the radius is less than the radius
			return true;
		}
		return false;
	}
}
