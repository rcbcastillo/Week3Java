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
	
	

}
