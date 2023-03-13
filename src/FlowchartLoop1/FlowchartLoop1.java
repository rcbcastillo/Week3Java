package FlowchartLoop1;

public class FlowchartLoop1 {
	
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
		
	} 
		
}


