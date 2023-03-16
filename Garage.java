package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	
	// Create list to store vehicles
	List<Vehicle> vehicles = new ArrayList<>();
	
	// Create method to add instances of vehicles
	public boolean addVehicle(Vehicle anyVehicle) {
		return this.vehicles.add(anyVehicle);
	}
	
	// Create a method to calculate Billing
	
	public void calculatePlateBilling() {
		//String message = "Enter a valid category";
		for (Vehicle item: this.vehicles) {
			String currentItemClass = (item.getClass().getName());
						
			if (currentItemClass.endsWith("Car")) {
				System.out.println("£54.87");
			} else if (currentItemClass.endsWith("Motorbike")) {
				System.out.println("£24.87");
			} else if (currentItemClass.endsWith("Bicycle")) {
			System.out.println("No charges");
			}
			
		}
	}
	
	
	
	/*Create a method in Garage that iterates through each Vehicle, 
	calculating a bill for each type of Vehicle in a different way,
	depending on the type of Vehicle it is 
	(this does not need to be complex).*/
	
	


}
