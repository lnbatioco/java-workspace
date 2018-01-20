package abstractDataTypes;

public class Age {

	public static void main(String[] args) {
		
		// create an abstract data type called "Counter" 
		// instantiate an instance of Counter and invoke all its methods
		
		Counter myCount = new Counter("myCount");
		myCount.increment();
		myCount.increment();
		myCount.increment();
		myCount.increment();
		
		System.out.println(myCount.getCurrentValue());
		System.out.println(myCount.toString());

	}

}
