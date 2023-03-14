package EhnacedForLoop_pkg;

import java.util.ArrayList;

public class EhnacedForLoop {
	
	/* 3 Create a method that returns a boolean and accepts an integer 
	 as a parameter, if the integer is even, return true, 
	 if not then return false.
	 */
			
	static boolean isEven(int number) {
		boolean  message = false;
		if (number % 2 == 0) 
			return !message;
		
		return message;
	}

	public static void main(String[] args) {
		/* 1 Create an array of strings and iterate through it, 
		 printing each value to console, using an enhanced for loop.*/
		// Declare the list
		System.out.println(" << 1 Printing the items of namesList >>");
		ArrayList<String> namesList = new ArrayList<>();
		
		//Populate the list
		namesList.add("Larry");
		namesList.add("Harry");
		namesList.add("Barry");
		namesList.add("Gary");
		namesList.add("Mary");
		
		// Access the items using enhanced for-loop
		for (String name: namesList) {
			System.out.println(name);
		}
		

		/* 2 Create an array of integers 1-20 and iterate through it, 
		using an enhanced for loop, square, and then print each value.*/
		// Declare the list
		ArrayList<Integer> integersList = new ArrayList<>();
		
		//Populate the list
		integersList.add(1);
		integersList.add(2);
		integersList.add(3);
		integersList.add(4);
		integersList.add(5);
		integersList.add(6);
		integersList.add(7);
		integersList.add(8);
		integersList.add(9);
		integersList.add(10);
		integersList.add(11);
		integersList.add(12);
		integersList.add(13);
		integersList.add(14);
		integersList.add(15);
		integersList.add(16);
		integersList.add(17);
		integersList.add(18);
		integersList.add(19);
		integersList.add(20);
		
		// Access the items using for-loop to square
		for (int index = 0; index < integersList.size(); index++) {
			int currentValue = integersList.get(index);
			// replacing the values for its square
			integersList.set(index, currentValue * currentValue);
		}
		
		// Access the items using enhanced for-loop after square
		System.out.println(" << 2 Printing the items of integersList after square each item >>");
		for (int number: integersList) {
			System.out.println(number);
		}
		
		
		/* 4 Using the array of integers from exercise 2 and
		 the method created in exercise 3; 
		 iterate through the array using an enhanced for loop, 
		 calling the method from exercise 3 in the body.
		 */
		System.out.println(" << 4 Calling the isEven() for each item in integersList >>");
		for (int numb: integersList) {
			System.out.println(isEven(numb));
		}
					
		/* 5 If the value is even, cube it, then print it to console.
		If the value is odd, square it, then print it to console.*/
		System.out.println(" << 5 Calling the isEven() and perform an operation >>");
		for (int index = 0; index < integersList.size(); index++) {
			boolean currentValueCheck = isEven(integersList.get(index));
			
			// replacing the values for its square
			if (currentValueCheck) {
				int value = integersList.get(index);
				int newValue = value * value * value;
				integersList.set(index, newValue);
				System.out.println(value + " is even, cube it");
				System.out.println(newValue);
			} else {
				int value = integersList.get(index);
				int newValue = value * value;
				System.out.println(value + " is odd, square it");
				System.out.println(newValue);
			}
		}
		

	}
}
