package Main;
import objects.Person;
import objects.EncapsulatePerson;
import java.util.ArrayList;
import java.util.List;

public class Main {
	// Create a List<> implementation and store those objects inside.
	public static List<Person> myListOfObjects = new ArrayList<Person>();
	
	public static void main(String[] args) {
		//Create some example objects with this class.
		Person person1 = new Person("AS", 38, "Customer Service");
		myListOfObjects.add(person1);
		
		Person person2 = new Person("RB", 39, "Ciber Security Chief");
		myListOfObjects.add(person2);
		Person person3 = new Person("JB", 37, "Accountant");
		myListOfObjects.add(person3);
		
		/*		 
		Extension:
		HINT: it's probably best to put your List<> implementation in a separate class.
		HINT: @Override the toString() method.
		 */
		
		// Printing the created instances
		System.out.println(person1.formattedString());
		System.out.println(person2.formattedString());
		System.out.println(person3.formattedString());
		
		// Printing the number of objects in myListOfObjects
		for (Person objectName : myListOfObjects) {
			System.out.println(objectName.formattedString());
		}
	
		// Printing an object if the name exists
		for (Person objectName : myListOfObjects) {
			if (objectName.name.equalsIgnoreCase("AS")) {
				System.out.println(objectName.formattedString());
			}
		}
		
		// Printing the created instances
		EncapsulatePerson person4 = new EncapsulatePerson("Anne", 38, "Customer Service");
				
		EncapsulatePerson person5 = new EncapsulatePerson("RB", 39, "Ciber Security Chief");
		
		EncapsulatePerson person6 = new EncapsulatePerson("JB", 37, "Accountant");
	
		
		System.out.println(person4.formattedString() + "person 4");
		System.out.println(person4.getName() + " <-- Old name of person 4");
		person4.setName("Harry");
		System.out.println(person4.getName() + " <-- New name of person 4");
	
	}
}
