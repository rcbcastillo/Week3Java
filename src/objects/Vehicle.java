package objects;

public class Vehicle {
	private String color;
	private String brand;
	private String model;
	private double price;
	private int year;
	
	public Vehicle(String color, String brand, String model, double price, int year) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.year = year;
	}
	
	public String getModel () {
		return this.model;
	}
	
	public String getBrand () {
		return this.brand;
	}
	
	public String getColor () {
		return this.color;
	}

	public double getPrice () {
		return this.price;
	}
	
	public int getYear () {
		return this.year;
	}
	
	public void setModel (String newModel) {
		this.model = newModel;
	}
	
	public void setBrand (String newBrand) {
		this.brand = newBrand;
	}
	
	public void setColor (String newColor) {
		this.color = newColor;
	}
	
	public void setPrice (double newPrice) {
		this.price = newPrice;
	}
	
	public void setYear (int newYear) {
		this.year = newYear;
	}
}
