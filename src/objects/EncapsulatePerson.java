package objects;

public class EncapsulatePerson {
	// Create a Person class modelling name, age and job title variables
	//instance variables
	private String name;
	private int age;
	private String job_title;
		
	
	//Create a method to return all three of these in a formatted string.
	// using the default constructor
	public EncapsulatePerson (String name, int age, String job_title) {
		this.name = name;
		this.age = age;
		this.job_title = job_title;
	}
	
	//Create a method to return all three of these in a formatted string.
	public String formattedString() {
		String data = ("Name is: " + this.name +","+ " age is: " + this.age +","+ " job_title is: " + this.job_title);
		return data;
	}
	
	// Create a get method to return the name
	public String getName () {
		return this.name;
	}
	
	// Create a set method to return the name
	public void setName (String newName) {
		this.name = newName;
	}

}
