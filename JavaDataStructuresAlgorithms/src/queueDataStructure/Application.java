package queueDataStructure;

public class Application {

	public static void main(String[] args) {
		
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(10);
		myQueue.insert(245);
		myQueue.insert(399);
		myQueue.insert(43);

		myQueue.view();
	}

}
