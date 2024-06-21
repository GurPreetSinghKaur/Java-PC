package gurpreet.junit.exercises;
import java.util.Arrays;

public class FlipBooleans {
	
	public static boolean[] solve(boolean[] input){
		
		// Insert your code here
		
		// Implement a function which flips each boolean value in an array
		// e.g. { true, false } should become { false, true}
		for (int i = 0; i < input.length; i++) {
			//! to flip the boolean
			input[i] = !input[i];
		}
		return input;
	}

}