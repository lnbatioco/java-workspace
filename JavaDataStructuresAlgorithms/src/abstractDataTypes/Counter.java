package abstractDataTypes;

public class Counter {
	
	// attributes
	String name = null;
	int count = 0;
	
	
	// constructor 
			// accepts a string to represent the name of the particular instance
	public Counter(String str) {
		this.name = str;
	}
	
	
	// 3 public methods
	public void increment() {
		count+=1;
	}
	
	public int getCurrentValue() {
		return count;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", count=" + count + "]";
	}
		
}
