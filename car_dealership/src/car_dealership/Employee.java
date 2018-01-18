package car_dealership;

public class Employee {
	
	// attributes
	String name;
	
	
	// behaviors
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
		
		if(finance == true) {
			runCreditHistory(cust, loanAmount);
			processTransaction(cust, vehicle);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer will need $" + loanAmount 
			+ " more to purchase vehicle: " + vehicle.getMake() + " " + vehicle.getModel());	
		}
	}
	
	public void runCreditHistory(Customer cust, double doubleAmount) {
		System.out.println("Ran credit history for customer: " + cust.getName());
		System.out.println(cust.getName() + " has been approved to purchase vehicle");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println(cust.getName() + " has purchased the " 
		+ vehicle.getMake() + " " + vehicle.getModel() + " vehicle for the price of: " + vehicle.getPrice());
	}
}
