/* 

Write a function that takes a String and adds all the numbers in the
string together.

The function should then return this total as an integer.

Consecutive numbers should be treated as individual digits
(i.e. '123' is the same as 1, 2, 3 and not 123).

Examples:

'1' returns 1

'168' returns 15

'he12ll3' returns 6

'northcoders' returns 0

 */

 public class SumDigitsFromString {
	
	static int solve(String input){
		
		// Insert your code here
						
	}
	
	public static void main(String[] args) {

		tryInput("", 0);
		tryInput("1", 1);
		tryInput("168", 15);
		tryInput("+he12ll3", 6);
		tryInput("northcoders", 0);
		tryInput("01010101", 4);
		tryInput("x0d1e0t1s0a1g0e1", 4);
	
	}

	static void tryInput(String input, int expectedOutput){
		int result = SumDigitsFromString.solve(input);
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}
