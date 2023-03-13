package FlowchartLoop1;

public class FlowchartLoop1 {
	
	static void print10Times() {
		System.out.println("Print 10X from 1-10");
		for (int i = 1; i < 11; i++) {
			System.out.println("This is the : " + i + "X" );
			for (int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Flowchart1:");
		int A1 = 100;
		while ( A1 <= 200) {
			System.out.println(A1);
			A1++;
		}
		
		System.out.println("Flowchart2:");
		int A2 = 100;
		
		while (A2 <= 200) {
			if ( A2 % 2 == 0) {
				System.out.println("-");
				A2++;
				
				
			}else {
				System.out.println("*");
				A2++;
			}
		}
		
		print10Times();
		
	} 
		
}


