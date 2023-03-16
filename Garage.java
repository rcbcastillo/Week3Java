package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	
	/* Create list to store vehicles */
	List<Vehicle> vehicles = new ArrayList<>();
	
	/*Create a method that add a Vehicle*/
	public boolean addVehicle(Vehicle anyVehicle) {
		return this.vehicles.add(anyVehicle);
	}
	
	/*Create a method to calculate Billing*/
	public double calculateBilling( String myClass) {
		double billAmount = 0;
		
		for (Vehicle item: this.vehicles) {
			String currentItemClass = (item.getClass().getName());
			int billPerClass = item.calculateBill();
						
			if (currentItemClass.endsWith(myClass)) {
				billAmount = 54.87 + billPerClass;
			} 
			continue;
		}
		return billAmount;
	}
	
	// Empty the vehicles list
	public boolean clearList() {
		this.vehicles.clear();
		//if it is empty the size will be zero
		return this.vehicles.size()==0;
	}
		
	/*Create a method to remove multiple Vehicles 
	 by their type*/
	public void removeAllVehiclesByClass(String myClass) {
		//creating a temporary list
		List<Vehicle> itemsToRemove = new ArrayList<>();
		
		for (Vehicle item: this.vehicles) {
			String currentItemClass = (item.getClass().getSimpleName());
			
			if ((currentItemClass.endsWith(myClass))) {
				itemsToRemove.add(item);
			}
		}
		
		// removing items corresponding to myClass
		this.vehicles.removeAll(itemsToRemove);
	}
	

	/* Create method to remove a Vehicle by its ID*/
	public boolean removeItemById (int id) {		
		List<Vehicle> toRemove = new ArrayList<>();
		boolean isItemDeleted = false;
		
		for (Vehicle item: this.vehicles) {
			if (item.getId() == id) {
				toRemove.add(item);
			}
		}
		// removing item corresponding to Id
		this.vehicles.removeAll(toRemove);
		return !isItemDeleted;
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + this.vehicles + "]";
	}
	
	

}
