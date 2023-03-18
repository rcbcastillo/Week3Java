package mavenfactorial;

public class Factorial {
	
	public int reverseFactorial(int num) {
	
		if (num > 0) {
			if (num == 1) {
				return 0;
			} else {
				int counter = 1;
				while ( num > 1) {
					counter++;
					int result = num / counter;
					num = result;
				}
				return counter;
			}
		}	
		return -1;
	}
	
	
//	public static void main(String[] args) {
//		System.out.println(reverseFactorial(1));
//		System.out.println(reverseFactorial(0));
//		System.out.println(reverseFactorial(-1));
//		System.out.println(reverseFactorial(120));
//	}
}
