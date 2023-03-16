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
		
	/*Garage should have methods that add a Vehicle, 
	 * remove a Vehicle by its ID or its type, 
	 * fix a Vehicle (which calculates the bill) 
	 * and to empty the Garage..*/
	
	/*Garage should have a method 
	 * to remove multiple Vehicles by their type*/
	public void removeVehicle(String myClass) {
		//Creating a temporary list
		List<Vehicle> itemsToRemove = new ArrayList<>();
		for (Vehicle item: new ArrayList<>(this.vehicles)) {
			String currentItemClass = (item.getClass().getSimpleName());
			
			if ((currentItemClass.endsWith(myClass))) {
				itemsToRemove.add(item);
			}
		}
		
		for (Vehicle item: itemsToRemove) {
			System.out.println(item);
		}
		// removing items corresponding to myClass
		this.vehicles.removeAll(itemsToRemove);
	}

}
