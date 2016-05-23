/**
 * Tony Guizar & Lesley Godoy
 * APCS
 * 8.24.25
 * Warm Up
 * this program will use the geometry laws to find the length of
 * the side of a triangle and the remaining angles
 */
import java.util.*;
public class Calculator {
	public static void main(String args[]){
		/*
		 * all sides: Side1=a, side2=b, side3=c
		 * all angles: givenAngle=B, x=A, y=C
		 */
		
		// asks the user to input their triangle info
		System.out.println("Input the length of the first side of your tiangle: ");
		Scanner scanner = new Scanner(System.in);
		double side1 = scanner.nextDouble();
		System.out.println("Input the length of the second side of your tiangle: ");
		double side2 = scanner.nextDouble();
		System.out.println("Input the angle measure (in degrees) of the given angle of your tiangle: ");
		double givenAngle = scanner.nextDouble();
		
		// converts degrees to radians
		double inRadians= Math.toRadians(givenAngle);
		double x=(givenAngle*side1)/side2;
		double side3= Math.sqrt(Math.pow(side2,2) + Math.pow(side1, 2) -2 * side2 * side1 * Math.cos(inRadians));
		double y=(givenAngle*side1)/side3;
		
		System.out.println("Side 3 of your triangle is: " + side3);
		System.out.println("The 2 missing angle measures are " + x + " degrees" + " and " + y + " degrees.");

		
		
		
	}
}
