package Coins_pkg;

public class Coins {
	
	static void getChange(double cost, int amount) {
		double change = amount - cost;
		int count10Notes =0;
		int count5Notes =0;
		int count50Pen =0;
		int count1PoundCoin =0;
		int count20Pen =0;
		double amountOfPens=0;	
		int pens = 0;
		
		System.out.println("Here is your change (£): " + change);
		
		while (change > 0) {
			double remainingChange;
			if (change >= 10) {
				remainingChange = change-10;
				count10Notes +=1;
				change = remainingChange;
				System.out.println(count10Notes + "£10 note");
			}
			
			if (change >= 5) {
				remainingChange = change - 5;
				count5Notes +=1;
				change = remainingChange;
				
			}
			
			if (change >= 1 && change < 5) {
				remainingChange = change - 1;
				count1PoundCoin +=1;
				change = remainingChange;
				
			}
			
			if (change >= 0.5 && change < 1) {
				remainingChange = change - 0.5;
				count50Pen +=1;
				change = remainingChange;
				
	
			}
			
			if (change >= 0.2 && change < 0.5) {
				remainingChange = change - 0.2;
				count20Pen +=1;
				change = remainingChange;
				

			}
			
			if (change < 0.2) {
				pens = (int)Math.round(change * 1000/10.0); 
				change = amountOfPens - amountOfPens;
				;
			}
		}
		
		
		System.out.println(count10Notes +" "+ "£10 note");
		System.out.println(count5Notes +" "+ "£5 note");
		System.out.println(count1PoundCoin +" "+ "£1 coins");
		System.out.println(count50Pen +" "+ "50p coins");
		System.out.println(count20Pen +" "+ " 20p coins");
		System.out.println(pens +" "+ "p coins");		
		
	}
	
	
	
	public static void main(String[] args) {
		getChange(4.58, 20);
	}
}
