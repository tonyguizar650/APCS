/**
 * @author antoniog
 * APCS
 * 3.23.16
 * I received no help
 * This program will do a binary search in for an integer array in reverse order
 */
public class ReverseBinarySearch {
	public static void main(String[] args){
		int[] i= {97, 95, 89, 84, 81, 78, 67, 51, 49, 43, 22, 21, 15, -7};
		int start= 0;
		int end= i.length -1;
		System.out.println(revBinarySearch(i, 22, start, end));
		System.out.println(revBinarySearch(i, 89, start, end));
		System.out.println(revBinarySearch(i, -100, start, end));
		System.out.println(revBinarySearch(i, 72, start, end));
		System.out.println(revBinarySearch(i, 72, start, end));
		System.out.println(revBinarySearch(i, 102, start, end));
		
	}
	
	public static int revBinarySearch(int[] i, int searchVal, int start, int end){
		if (start > end) { return -1; }
		else{
			int mid= (start + end)/2;
			if (i[mid] == searchVal) { return mid; }
			else if (searchVal < i[mid]){
				return revBinarySearch(i, searchVal, mid + 1, end);
			} else{
				return revBinarySearch(i, searchVal, start, mid - 1);
			}		
		}
	}
}
