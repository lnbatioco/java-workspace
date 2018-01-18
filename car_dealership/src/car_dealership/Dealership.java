package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		// instantiate customer
		Customer customer1 = new Customer();
		customer1.setName("Tom");
		customer1.setAddress("123 Random Street");
		customer1.setCashOnHand(12000);
		
		
		// instantiate vehicle
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setMake("Honda");
		vehicle1.setModel("Accord");
		vehicle1.setPrice(150000);
		
		
		// instantiate employee
		Employee employee1 = new Employee();
		employee1.name = "Robert";
		
		
		// customer purchase
		customer1.purchaseCar(vehicle1, employee1, true);
	}

}
