package stackDataStructure;

public class Application {

	public static void main(String[] args) {
				
		System.out.println(reverseString("Hello"));
	}
	
	public static String reverseString(String str) {
		// create an instance of Stack
		int maxSize = str.length();
		Stack theStack = new Stack(maxSize);
		
		// retrieve chars from input str and push into Stack instance
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			theStack.push(ch);	
		}
		
		// while Stack instance isn't empty
				// pop each char (starting from top of stack) into result
		String result = "";
		while(!theStack.isEmpty()) {
			char ch = theStack.pop();
			result += ch;
		}
		return result;
	}

}
