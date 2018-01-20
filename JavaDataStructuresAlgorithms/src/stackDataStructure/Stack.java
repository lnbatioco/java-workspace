package stackDataStructure;

public class Stack {
	
	private int maxSize; // store size of stack
	private char[] stackArray; // store list of items that are type char
	private int top; // index position of last item placed on top of the stack
	
	
	// stack needs to be initialized with a size
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1; // so first item will be in index 0
	}
	
	
	// remember! PUSH and POP are the primary operations of a stack data structure
	public void push(char item) {
		if (isFull()) {
			System.out.println("stack is full. cannot input any more items");
		} else {
			top++;
			stackArray[top] = item;
		}
	}
	
	public char pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return 0;
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	
	// peak: return item sitting at top of stack
	public char peak() {
		return stackArray[top];
	}
	
	// empty: true or false if stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}
	
	// isFull: true or false if stack is full
	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}
