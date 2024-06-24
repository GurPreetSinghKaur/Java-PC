package gurpreet.junit.exercises;
/*

Write a function that takes a String and returns a String with all of the
letter characters replaced with an 'X'.

Any non-letter characters (e.g. punctuation, symbols) should be left as they
are.

Examples:

"a" returns "X"

"A" returns "X"

"hello" returns "XXXXX"

"Hello!" returns "XXXXX!"

"Do you like coding?" returns "XX XXX XXXX XXXXXX?"

 */

public class ReplaceLettersWithX {
	
	static String solve(String input){
		// Insert your code here
		//Use Regex in replaceAll() method in order to match all the alphabets from A to Z and a to z.
		//replace all matching arguments with "X" 
		return input.replaceAll("[A-Za-z]", "X");
						
	}
}
