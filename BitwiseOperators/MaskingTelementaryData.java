/**
 * @author antoniog
 * APCS - Final Project
 * 5.6.16
 * This program will use bitwise operators to read a number and determine whether switches are on or off
 */
import java.util.*;
public class MaskingTelementaryData {

	public static void main(String[] args) { 
		//allow user to input value and read
		Scanner reader= new Scanner(System.in);
		System.out.println("Swithch status for data value: ");
		int input= reader.nextInt();
		//print out all switch values
		int index=0;
		for (int i=56; i<64; i++){
			System.out.println("Switch sw" + i + " is " + isOn(mask(input,index)));
			index++;
		}
	}
	//input will be a 1 or 0 (return true if 1, false if 0)
	public static String isOn(int bit){
		if(bit == 0){
			return "OFF";
		}else{
			return "ON";
		}
	}
	//& the number to the mask to either return 0 or some other number
	public static int mask (int num, int mask){
		return num & (int)Math.pow(2,mask);
	}
}
