package car_dealership;

public class Vehicle {
	
	// attributes
	private String make;
	private String model;
	private double price;
	
	
	// constructor
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	
	// getters & setters
	public String getMake() {
		return make;
	}
	

	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
