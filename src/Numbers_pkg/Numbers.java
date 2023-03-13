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

	public static void main(String[] args) {
		
		System.out.println(addTwoDigits (74));
		

	}

}
