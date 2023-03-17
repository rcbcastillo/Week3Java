package mavenfactorial;

public class Factorial {
	
	public int returnFactorial(int num) {

		int counter = 1;
		
		if (num == 1) {
			return 0;
		} else if (num > 0) {
			while ( num > 1) {
				counter++;
				int result = num / counter;
				num = result;
			}
		} else {
			counter = -1;
		}		
	
	return counter;
	}
	
//	public static void main(String[] args) {
//		System.out.println(returnFactorial(1));
//		System.out.println(returnFactorial(120));
//		System.out.println(returnFactorial(720));
//	}
}
