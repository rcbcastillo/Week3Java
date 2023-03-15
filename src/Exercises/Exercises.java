package Exercises;

public class Exercises {
	/* 2For this task you are to implement 4 methods that manipulate 
	 String objects. For all parts of this section you are only allowed 
	 to use the length(), substring(), and equals() methods. 
	 Avoid using arrays or any methods you have yet to be taught as 
	 this defeats the purpose of the exercise:
	 */

	/*Method 1 - When given a String, count and return 
	 how many words there are in that String. */
	static int returnLengthOfString (String myString) {
		int counter = 0;
		for(int idx =0; idx < myString.length(); idx++) {
            char curentChar = myString.charAt(idx);
            if(curentChar == ' ')
            	counter++;
        }
        return counter + 1;
	}
	
	static int returnLengthOfString2 (String myString) {
		int counter = 0;
		
		for(int idx =0; idx < myString.length(); idx++) {
            String curentSubStr = myString.substring(idx, idx + 1);
            if(curentSubStr.equals(" "));
            	counter++;
        }
        return counter + 1;
	}
	
	/* Method 2 - When given a String, print out this String in a vertical 
	 fashion, each word on a different line.*/
	static void printWordsVertically (String myString) {

		String  wordToPrint= "";		
		int lastIndex = myString.length();
		int numberOfSpaces = returnLengthOfString(myString) -1;
		int seenSpaces = 0;
		int indexOfSeenSpace = 0;
		
		for(int idx = 0; idx < myString.length(); idx++) {
            String curentSubStr = myString.substring(idx, idx + 1);
                        
            if (!curentSubStr.equals(" ")) {
            	wordToPrint += curentSubStr;
            	
            }  else {
            	
            	System.out.println(wordToPrint);
            	seenSpaces++;
            	indexOfSeenSpace = idx;
            	wordToPrint = "";
            	
            	if (seenSpaces == numberOfSpaces){
                	System.out.println(myString.substring(indexOfSeenSpace + 1, lastIndex));
                	 
                }
            	
            } 
            
		}
		
	}
	
	
	/* Method 3 - When given a String, print out this String in a vertical 
	 fashion in reverse order, each word on a different line.*/
	static void printWordsVerticallyReverse (String myString) {

		//String  wordToPrintReversed= "";		
		int lastIndex = myString.length();
		int numberOfSpaces = returnLengthOfString(myString) -1;
		int seenSpaces = 0;
		int indexOfSeenSpace = 0;
		
		for(int idx = myString.length()-1; idx >=0 ; idx--) {
            String curentSubStr = myString.substring(idx, idx + 1);
                        
            if (curentSubStr.equals(" ")) {
            	
            	indexOfSeenSpace = idx;
            	System.out.println(myString.substring(indexOfSeenSpace + 1, lastIndex));            	
            	 
            	lastIndex = indexOfSeenSpace;
            	seenSpaces++;
            	
            	if (seenSpaces == numberOfSpaces){
            		
                	System.out.println(myString.substring(0, lastIndex));
                	 
                }
            } 
        }            	
            
	}
		

	
	/* Method 4 - A find method, which takes 2 Strings; 
	 the first is message and the second is the String you want to find 
	 in the message. A boolean value should be returned to indicate 
	 whether or not the second String has been found in the message.
	 */
	
	@SuppressWarnings("unused")
	static void isSubstringInString (String myString, String mySubStr) {
		System.out.println(mySubStr);
		String  wordToLookUp= "";		

		for(int idx = 0; idx < myString.length(); idx++) {
			String curentSubStr2 = myString.substring(idx, idx + 1);
			for(int item = 0; item < mySubStr.length(); item++) {
				               
                String curentSubStr = mySubStr.substring(item, item + 1);
                
//	            if (curentSubStr.equals(curentSubStr2)) {
//	            	
//	            	 wordToLookUp += curentSubStr;
//	             } 
//	            break;
	        
			}
             
		}
		
		System.out.println( wordToLookUp);
	}

	
	public static void main(String[] args) {
		
		/* 1 Create two Strings where one string has a value of “yesterday
		  it was raining” and the other string with a value of “today it is sunny”
		 Concatenate both values, capitalise both strings and 
		 print out the result.
		 The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING

		Solution
		Now use the substring method to print out: `TODAY IT IS RAINING`
		Solution
		 */
		System.out.println(" << 1 Concatenating two strings >>");
		String phrase1 = "yesterday it was raining";
		String phrase2 = "today it is sunny";
		String concatPhrase = (phrase1 + ", " + phrase2).toUpperCase();
		System.out.println(concatPhrase.length());
		
		System.out.println(" << 2 Number of words in string >>");
		System.out.println(returnLengthOfString(concatPhrase) + " <-- Using charAt()");
		System.out.println(returnLengthOfString(concatPhrase) + " <-- Using substring()");
		
		System.out.println(" << 3 Printing each word in string vertically >>");
		printWordsVertically(concatPhrase);
		
		System.out.println(" << 4 Printing each word in string in reverse >>");
		printWordsVerticallyReverse(concatPhrase);
		
		System.out.println(" << Check if substring is in original message >>");
		isSubstringInString(concatPhrase, "EACH WORD");
		isSubstringInString(concatPhrase, "IT IS SUNNY");
		
	}

}
