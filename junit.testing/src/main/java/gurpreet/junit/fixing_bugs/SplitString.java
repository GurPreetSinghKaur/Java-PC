package gurpreet.junit.fixing_bugs;

import java.util.Arrays;

/* 

SplitString is a class with a `solve` method that takes a string and returns a list containing
all of the individual characters as separate elements.

Unfortunately, it looks like this implementation currently doesn't compile.

Can you work out what one thing needs changing to make the class compile?

It should display "SUCCESS" when you run it without further changes.

 */

public class SplitString {
	
	/* FIX THIS METHOD */	
	static char[] solve(String input){		
		if (input == null) {
			return new char[0];
	}

//	char[] charArray = new char[input.length()];
//
//	for (int i = 0; i < input.length(); i++) {
//			charArray[i] = input.charAt(i);
//	}

	return input.toCharArray();
	}
	
	public static void main(String[] args) {
		
		// Don't modify this code
		tryInput(null, new char[0]);
		tryInput("banana", new char[]{'b', 'a', 'n', 'a', 'n', 'a'});
		tryInput("apple", new char[]{'a', 'p', 'p', 'l', 'e'});
		tryInput("cake", new char[]{'c', 'a', 'k', 'e'});
				
	}

	static void tryInput(String input, char[] expectedOutput){
						
		char[] result = SplitString.solve(input);
		
		if(Arrays.equals(result, expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

