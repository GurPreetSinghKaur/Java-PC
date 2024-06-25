package gurpreet.junit.refactoring;/*

CountGroceries is a class with a `solve` method which takes an array of Strings.

Each String represents a grocery item, which costs exactly 10 (in some currency).

Compile and run this code and you'll see that the `solve` method calculates the correct result.

However, the code is inefficient and could be made a lot cleaner.

Can you replace the code in the `solve` method with a single line which does the same job?

Remember, refactoring is about tidying code without changing behaviour. The code must still 
compile and print success for all the original inputs when you're done.

 */

 public class CountGroceries {
	
	/* REFACTOR THIS METHOD */	
	static int solve(String[] groceries){		

		// This entire method could be replaced with a single line, and no looping required.
		
		return groceries.length * 10;
	}

}

