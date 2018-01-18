package car_dealership;

public class Employee {
	
	// attributes
	String name;
	
	
	// behaviors
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
			processTransaction(cust, vehicle);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
		}
	}
	
	public void runCreditHistory(Customer cust, double doubleAmount) {
		System.out.println("Ran credit history for customer: " + cust.getName());
		System.out.println(cust.getName() + " has been approved to purchase vehicle");
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println(cust.getName() + " has purchased the vehicle: " 
		+ vehicle.getMake() + " " + vehicle.getModel() + " for the price of: " + vehicle.getPrice());
	}
}
