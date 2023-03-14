package ArrayLits_pkg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercises {
	
	  
  
	public static void main(String[] args) {
		
		// Create an arrayListInt
		ArrayList<Integer> arrayListInt = new ArrayList<>();

		// Add elements to arrayListINt
		arrayListInt.add(20);
		arrayListInt.add(400);
		arrayListInt.add(60);
		arrayListInt.add(8);
		arrayListInt.add(1567);
		arrayListInt.add(120);
		System.out.println("Printing the arrayListInt");
		System.out.println("ArrayList: " + arrayListInt);
		
		// Iterate through the ArrayList and print out each element
		//Using for-loop
		System.out.println("Printing using for-loop");
		for (int item = 0; item < arrayListInt.size(); item++) {
			System.out.println(arrayListInt.get(item));
		}
		
		//Using enhanced for-loop
		System.out.println("Printing using for-each loop");
		for (int item : arrayListInt) {
			System.out.println(item);
		}
		
		// get() specific elements
		int index0 = arrayListInt.get(0);
		System.out.println("Value of index 0: " + index0);
		int index1 = arrayListInt.get(1);
		System.out.println("Value of index 1: " + index1);
		int index2 = arrayListInt.get(2);
		System.out.println("Value of index 2: " + index2);
		
		// set() specific elements -- modify them
		
		arrayListInt.set(0, 24);
		System.out.println("New value of index 0: " + arrayListInt.get(0));
		
		
		arrayListInt.set(2, 250);
		System.out.println("New value of index 0: " + arrayListInt.get(2));
		
		
		// remove() elements
		int removedItem = arrayListInt.remove(arrayListInt.size() -1);
		System.out.println("Removed last value: " + removedItem);
		
		// sort() the ArrayList (try this with several object types)
		System.out.println("Sorting the int list using collections");
		Collections.sort(arrayListInt);
		System.out.println(arrayListInt);
		
		/* sorting an array with strings*/
		System.out.println("Sorting the string list using collections");
		ArrayList<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Swift");
		programmingLanguages.add("JavaScript");
	    System.out.println(programmingLanguages);
	  
		
		// try using the reverse(), swap() and clear() methods
		System.out.println("Reverse the lsit using collections");
		Collections.reverse(arrayListInt);
		System.out.println(arrayListInt);
		System.out.println("Swapping items in the list using collections, after reversing");
		Collections.swap(arrayListInt, 0, 4);
		System.out.println(arrayListInt);
		System.out.println("Clearing items in the list");
		arrayListInt.clear();
		System.out.println(arrayListInt);
	}

}
