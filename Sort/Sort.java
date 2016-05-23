/**
 * @author antoniog
 * APCS
 * 3.9.16
 * I received no help
 * This class will implement two functions (1) a selection sort and (2) a backwards insertion sort
 */
public class Sort {

	public static void main (String args[]){
		String[] arr= {"Tony", "Darian", "Marlene", "Tiverio", "Dylan"};
		insertionSort(arr);
		for(String x: arr){
			System.out.println(x);
		}
	}
	
	/**
	 * This method will order a String array in ascending order using the selection sort method
	 * @param array
	 */
	public static String[] selectionSort(String[] array){
		for (int i= 0; i < array.length; i++){
			int minIndex= 1;
			for (int j= i+1; j < array.length; j++){
				if ((array[j].compareToIgnoreCase(array[minIndex])) < 0){
					minIndex= j;
				}
			}
			swap(array, i, minIndex);
		}
		return array;
	}
	/**
	 * This method will order a String array in descending order using the insertion sort method
	 * @param array
	 */
	public static String[] insertionSort(String[] array){
		for (int i= 0; i < array.length; i++){
			String curItem= array[i];
			int j= i;
			while (j > 0 && array[j-1].compareToIgnoreCase(curItem) > 0){
				array[j] = array[j-1];
				j--;
			}
			array[j]= curItem;
		}
		return array;
	}
	/**
	 * This method will swap i1 and i2 
	 * @param array
	 * @param i1
	 * @param i2
	 */
	public static void swap (String[] array, int i1, int i2){
		String temp= array[i1];
		array[i1]= array[i2];
		array[i2]= temp;
	}

}
