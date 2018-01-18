package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		// instantiate customer using constructor
		Customer customer1 = new Customer("Tom", "123 Random St", 12000);
		Customer customer2 = new Customer("Georgia", "456 Sunny Blvd", 15000);
		Customer customer3 = new Customer("Marcy", "789 Bird Ln", 2000);
		
		// instantiate vehicle using constructor
		Vehicle vehicle1 = new Vehicle("Honda", "Accord", 8000);
		Vehicle vehicle2 = new Vehicle("Jeep", "Wrangler", 10000);
		Vehicle vehicle3 = new Vehicle("Toyota", "Camry", 5000);
		Vehicle car = new Vehicle("Toyota", "Camry", 5000);
		
		// instantiate employee
		Employee employee1 = new Employee("Robert", 5678);
		Employee employee2 = new Employee("Carly", 4648);

		
		
		// customer purchase
		customer1.purchaseCar(vehicle1, employee1, false);
		customer2.purchaseCar(vehicle2, employee1, false);
		customer3.purchaseCar(vehicle3, employee2, true);
		
		employee1.getBonus();
		employee2.getBonus();
		
		// compare the data of car with the data of vehicle3 using equals()
			// override equals method in Vehicle class
		boolean value = car.equals(vehicle3);
		System.out.println(value);
	}

}
