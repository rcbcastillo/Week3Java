package Main;
import objects.Person;

public class Main {
	
	public static void main(String[] args) {
		//Create some example objects with this class.
		Person person1 = new Person("AS", 38, "Customer Service");
		System.out.println(person1);
		Person person2 = new Person("RB", 39, "Ciber Security Chief");
		System.out.println(person2);
		Person person3 = new Person("JB", 37, "Accountant");
		System.out.println(person3);
		/*		 
		
		Extension:

		Create a List<> implementation and store those objects inside.

		HINT: it's probably best to put your List<> implementation in a separate class.

		Create a method that can search for a specific Person by their name.

		HINT: @Override the toString() method.
		 */
	}

}
