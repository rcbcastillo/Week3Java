package Numbers_pkg;

public class Numbers {
	/* 1 Create a method that takes a number 10-99, 
	  adds the two digits together,
	 for example 74 = 7 + 4 = 11*/
	static int addTwoDigits (int number) {
		int sum = 0;
		if (number > 9 && number < 100) {
			
			String numberToString = String.valueOf(number);
			char[] charDigits = numberToString.toCharArray();

	        for(int i = 0; i < charDigits.length; i++) {
	           
	            int soleNumber = Integer.parseInt(String.valueOf(charDigits[i]));            
	            sum += soleNumber;
	     
	        }	        
		}
		return sum;
	}
	
	// I do not think this is the most efficient way 
	static String numberToString (int number) {
		String myNumberRepresentation = "";
		int index = 0;
		String[] myNumbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
				"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighthy", "ninety"}; 
		
		if (number > 0 && number < 100) {			
			
			
			if (number <= 20) {
				index = number;
				myNumberRepresentation = myNumbers[index-1];
				
				
			} else {
				myNumberRepresentation = "I am over 20";
				
				// first I will break the number on its digits
				String numberToString = String.valueOf(number);
			
				int[] myTemporaryList = new int[2];
				int index1;
				int index2;
				
				// Converting numberToString to an array of chars
				char[] charDigits = numberToString.toCharArray();
				
				// Accessing each char to cast them to int
				for (int i = 0; i < charDigits.length; i++) {
					int soleNumber = Integer.parseInt(String.valueOf(charDigits[i]));
					myTemporaryList[i] = soleNumber;
				}
				
				index1 = myTemporaryList[0];
				index2 = myTemporaryList[1];
				
				if (index1 == 2) {
					index = index1 * 10;
					myNumberRepresentation = myNumbers[index -1] +"-"+  myNumbers[index2 -1];
				} else if (index1 == 3) {
					if (index1 == 3 && index2 == 0) {
						myNumberRepresentation = myNumbers[20];
					} else {
						myNumberRepresentation = myNumbers[20] +"-"+  myNumbers[index2 -1];
					}
					
				} else if (index1 == 4) {
					if (index1 == 4 && index2 == 0) {
						myNumberRepresentation = myNumbers[21];
					} else {
						myNumberRepresentation = myNumbers[21] +"-"+ myNumbers[index2 -1];
					}
					
				} else if (index1 == 5) {
					if (index1 == 5 && index2 == 0) {
						myNumberRepresentation = myNumbers[22];
					} else {
						myNumberRepresentation = myNumbers[22] +"-"+  myNumbers[index2 -1];
					}
					
				} else if (index1 == 6) {
					if (index1 == 6 && index2 == 0) {
						myNumberRepresentation = myNumbers[23];
					} else {
						myNumberRepresentation = myNumbers[23] +"-"+  myNumbers[index2 -1];
					}
					
				} else if (index1 == 7) {
					if (index1 == 7 && index2 == 0) {
						myNumberRepresentation = myNumbers[24];
					} else {
						myNumberRepresentation = myNumbers[24] +"-"+  myNumbers[index2 -1];
					}
					
				} else if (index1 == 8) {
					if (index1 == 8 && index2 == 0) {
						myNumberRepresentation = myNumbers[25];
					} else {
						myNumberRepresentation = myNumbers[25] +"-"+  myNumbers[index2 -1];
					}
					
				} else if (index1 == 9) {
					if (index1 == 9 && index2 == 0) {
						myNumberRepresentation = myNumbers[26];
					} else {
						myNumberRepresentation = myNumbers[26] +"-"+  myNumbers[index2 -1];
					}
					
				} 				
			}		
		}
		return myNumberRepresentation;
	}

	public static void main(String[] args) {
		
		System.out.println(addTwoDigits (74));
		System.out.println(numberToString(7));
		System.out.println(numberToString(10));
		System.out.println(numberToString(11));
		System.out.println(numberToString(15));
		System.out.println(numberToString(20));
		System.out.println(numberToString(21));
		System.out.println(numberToString(28));
		System.out.println(numberToString(30));
		System.out.println(numberToString(35));
		System.out.println(numberToString(40));
		System.out.println(numberToString(43));
		System.out.println(numberToString(50));
		System.out.println(numberToString(54));
		System.out.println(numberToString(60));
		System.out.println(numberToString(62));
		System.out.println(numberToString(70));
		System.out.println(numberToString(77));
		System.out.println(numberToString(80));
		System.out.println(numberToString(81));
		System.out.println(numberToString(90));
		System.out.println(numberToString(99));
	}

}
