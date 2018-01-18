package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setName("Tom");
		customer1.setAddress("123 Random Street");
		customer1.setCashOnHand(12000);
		
		System.out.println(customer1.getName());
	}

}
