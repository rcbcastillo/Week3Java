package objects;

import objects.Vehicle;

public class Car extends Vehicle {
	private int numberOfDoors;
	
	public Car(String color, String brand, String model, double price, int year, int numberOfDoors) {
		super(color, brand, model, price, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public int getNumberOfDoors () {
		return this.numberOfDoors;
	}
	
	public void setNumberOfDors (int myDoorsNumber) {
		this.numberOfDoors = myDoorsNumber; 
	}
}
