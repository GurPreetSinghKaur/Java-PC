package gurpreet.junit.exercises;
/*

Write a function that takes a String of a mobile number.
It should return `true` if the number is a valid UK number and `false` if not.

A valid mobile number may begin with:

1. '07' followed by exactly 9 more digits.
2. '+447' followed by exactly 9 more digits.
3. '00447' followed by exactly 9 more digits.

Anything else is invalid.


Examples:

"07726" returns false
"07123456789" returns true
"+447123456789" returns true
"00447123456789" returns true
"0712345678!" returns false
"07123456789!" returns false

 */

 public class IsValidMobileNumber {
	
	static boolean solve(String input){
		// Insert your code here
		//Check if the input has valid minimum length and if it matches the allowed characters
		//When using String.matches(), add .* at the beginning and the end in order to check substrings 
		if (input.length() < 10 | input.matches(".*[^+0-9].*"))  return false;
		
		//better performance instead of declaring this line at the beginning
		String[] temp = input.split("7");

		if (temp[0].contains("0") | temp[0].contains("+44") | temp[0].contains("0044")) return true;

		return false;			
	}
}
