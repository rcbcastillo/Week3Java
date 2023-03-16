package vehicles;

public class Demo {

	public static void main(String[] args) {
		// Create an instance of garage
		Garage bucketGarage = new Garage();
		
		// Create instances of vehicles		
		Vehicle car1 = new Car(1,"black", "Ford", "Fiesta", 24500, 2023, 5);
		Vehicle car2 = new Car(2,"red", "Mini", "Hatch", 36200, 2023, 5);
		Vehicle motorbike1 = new Motorbike(3, "black-blue", "Harley-Davidson", "X350", 73500, 2023, true);
		Vehicle motorbike2 = new Motorbike(4, "yellow-white", "Triumph", "Ax500", 18500, 2023, true);
		Vehicle bicycle1 = new Bicycle(5, "blue", "Ribble Alloy", "Gravel", 2199, 2020, "Electric");
		Vehicle bicycle2 = new Bicycle(6, "orange", "Ribel Carbon", "Endurance", 1850, 2021, "Hybrid");
		
		// Add the vehicles to the bucketGarage(list), calling the method addVehicle
		bucketGarage.addVehicle(bicycle2);
		bucketGarage.addVehicle(bicycle1);
		bucketGarage.addVehicle(car1);		
		bucketGarage.addVehicle(car2);
		bucketGarage.addVehicle(motorbike1);
		bucketGarage.addVehicle(motorbike2);
				
		
		//Using currentItemClass >> output depends on the vehicle subclass
		System.out.println("<<  Calculating bill for a Car class  >>");
		System.out.println(bucketGarage.calculateBilling("Car"));	
		
				
		// Using removeItemByID(int id) to remove items by id
		System.out.println();
		System.out.println("<<  Deleting item by ID  >>");
		System.out.println(bucketGarage + "<-- before deleting all Cars");
		bucketGarage.removeItemById(4);
		System.out.println(bucketGarage + "<-- after deleting all Cars");
		
		//Using currentItemClass >> output depends on the vehicle subclass
		System.out.println();
		System.out.println("<<  Deleting item by type(subclass) >>");
		System.out.println(bucketGarage + "<-- before deleting all Cars");
		bucketGarage.removeAllVehiclesByClass("Car");		
		System.out.println(bucketGarage + "<-- after deleting all Cars");
		
		//Using clearList() to empty the list
		System.out.println();
		System.out.println("<<  Deleting all vehicles from the garage >>");
		System.out.println(bucketGarage + "<-- before deleting all");
		bucketGarage.clearList();		
		System.out.println(bucketGarage + "<-- after deleting all");
		
	}

}
