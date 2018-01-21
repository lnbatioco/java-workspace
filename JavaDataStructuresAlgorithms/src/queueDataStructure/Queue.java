package queueDataStructure;

public class Queue {
	
	private int maxSize; 
	private long[] queueArray; 
	private int front; 
	private int rear; 
	private int nItems; 
	
	
	// constructor to initialize a queue
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0; 
		rear = -1;
		nItems = 0; 
	}
	
	
	// operations
	public void insert(long item) {
		if (isFull()) {
			System.out.println("queue is full. cannot insert any more items.");
		} else {	
			rear++;
			queueArray[rear] = item;
			nItems++;
		}
	}
	
	public long remove() {
		if (isEmpty()) {
			System.out.println("queue is empty. no items to remove.");
			return -1;
		} else {
			long toRemove = queueArray[front];
			front++;
			
			if(front == maxSize) {
				front = 0;
				System.out.println("queue is currently empty.");
			}
			
			nItems--;
			return toRemove;
		}
		
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public void view() {
		System.out.print("[ ");
		for(int i = front; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.println("]");
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
}
