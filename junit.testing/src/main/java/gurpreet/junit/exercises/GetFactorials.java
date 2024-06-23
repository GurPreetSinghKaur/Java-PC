package gurpreet.junit.exercises;
import java.util.ArrayList;
import java.util.List;

/* 
Write a function that takes a list of integers and returns a list containing
the factorial of each number in the list.

The factorial of a number is the product of that number and all the integers
below it.
E.g. the factorial of 4 is 4 * 3 * 2 * 1 = 24


Examples:

[3] should return [6]
[3, 4] should return [6, 24]
[1, 5, 2] should return [1, 120, 2]
[] should return []

 */

public class GetFactorials {
	
	static ArrayList<Integer> solve(ArrayList<Integer> input){
		// Insert your code here
		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) <= 1) continue;
			int factorial = input.get(i);
			int result = 0;
			
			for (int l = factorial - 1; l > 0; l--) {
				if (result == 0) {
					result = factorial * l;
				} else {
					result = result * l;
				}
			}

			input.set(i, result);
			
		System.out.print(input);

		}

		return input; 

	}
}
