package FlowchartReplaceWhile;

import java.util.Scanner;

public class ReplaceWhileLoops {
	static void print10Times() {
		System.out.println("Print 10X from 1-10");
		for (int i = 1; i < 11; i++) {
			System.out.println("This is the : " + i + "X" );
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
	
	static void print10TimesWithUserInput() {
		System.out.println("Print xTimes from 1-10");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a number: ");
	    String userInput = myObj.nextLine();
	    int number = Integer.parseInt(userInput);
		for (int i = 1; i < number + 1; i++) {
			System.out.println("This is the : " + i + "X" );
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}
		myObj.close();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Flowchart1:");
		// A1 will start at 100 but if you change it to 1000 will not run
		int A1 = 100;
		for ( int i =A1; i <= 200; i++) {
			System.out.println(i);
		}
		
		System.out.println("Flowchart2:");
		int A2 = 100;
		
		for (int j = A2; j <= 200; j++) {
			if (j % 2 == 0) {
				System.out.println("-");				
				
			}else {
				System.out.println("*");
			}
		}
		
		// calling functions
		print10Times();
		print10TimesWithUserInput();		
	}
}
