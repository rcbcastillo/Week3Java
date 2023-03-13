package Arrays_pkg;

import java.util.Scanner;

public class Arrays {
	// Create an array that will hold 10 int values
	static int arraysOfNums[] = {1,2,3,4,5,6,7,8,9,10};
	
	// Declare an array of 10 integers 
	static int[] listOfNums = new int[10];
	
	

	public static void main(String[] args) {
		System.out.println("Printing elements in arraysOfNums");
		for (int j=0; j < arraysOfNums.length; j++) {
			 System.out.println(arraysOfNums[j] );
		 }
		
		// Populating the listOfNums array using a for-loop and print the added values
		for (int item = 0; item < listOfNums.length; item++ ) {
			listOfNums[item] += 1;
			System.out.println("index: " + item + "," + "value: " + listOfNums[item]);
		}
		
		/* loop that iterates through the array, 
		   changing the values at each point to equal itself times 10 */
		System.out.println("Printing elements in listOfNums increased by 10");
		for (int element = 0; element < listOfNums.length; element++ ) {
			listOfNums[element] *= 10;
			System.out.println("index: " + element + "," + "value: " + listOfNums[element]);
		}
	}

}
