package car_dealership;

public class Customer {
	
	// attributes
	private String name;
	private String address;
	private double cashOnHand;
	
	
	// getters & setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	
	// behaviors
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {		
		// "this" meaning customer self
		emp.handleCustomer(this, finance, vehicle);
	}
}
