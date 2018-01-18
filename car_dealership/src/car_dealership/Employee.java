package car_dealership;

public class Employee {
	
	// attributes
	String name;
	int employeeId;
	int bonus;
	
	
	// constructor
	public Employee(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.bonus = 0;
	}
	
	
	// getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public int getBonus() {
		System.out.println(bonus);
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	
	
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
		bonus += 500;
		System.out.println(cust.getName() + " has purchased the vehicle: " 
		+ vehicle + " vehicle for the price of: $" + vehicle.getPrice());
	}
}
