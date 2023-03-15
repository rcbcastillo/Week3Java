package objects;

public class Motorbike extends Vehicle {
	private boolean puncture_kit;
	
	public Motorbike(String color, String brand, String model, double price, int year, boolean puncture_kit) {
		super(color, brand, model, price, year);
		this.puncture_kit = puncture_kit;
	}
	
	public boolean getPunctureKit () {
		return this.puncture_kit;
	}
	
	public void setPunctureKit (boolean value) {
		this.puncture_kit = value; 
	}
}
