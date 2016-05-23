/**
 * Tony Guizar
 * APCS
 * P14
 *9.23.15
 *This program will will display a table of bases in binary, hexadecimal, and octal
 */
public class Tester {
	//main function
	public static void main(String args[]){
		//print labels
		System.out.print("Decimal \t Binary \t Octal  \t Hex  \t Char");
		System.out.println();
		//repeat 65-90 times 
		for (int i =65; i<=90; i++) {
	        for (int j = 0; j <1; j++) {
	        	//print all values in one line
	            System.out.print(i + "\t         "+ Integer.toBinaryString(i) + "\t  "+ Integer.toOctalString(i));
	            System.out.print("\t         " + Integer.toHexString(i)+ "\t   "+ (char)i);
	        }
	        //new line
	        System.out.println();
	    }
	}

}
