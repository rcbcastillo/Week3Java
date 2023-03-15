package objects;

public class Bicycle extends Vehicle {
	private String type;
		
		public Bicycle(String color, String brand, String model, double price, int year, String type) {
			super(color, brand, model, price, year);
			this.type = type;
		}
		
		public String getType () {
			return this.type;
		}
		
		public void setType (String newType) {
			this.type = newType; 
		}
}
