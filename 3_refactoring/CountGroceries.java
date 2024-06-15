/* 

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
		int totalPrice = 0;
		
		for (int i = 0; i < groceries.length; i++) {				
				totalPrice += 10;
		}

		return totalPrice;
	}
	
	public static void main(String[] args) {
		
		// Don't modify this code
		tryInput(new String[]{"Apple", "Banana", "Orange", "Milk"}, 40);
		tryInput(new String[]{"Banana", "Orange", "Milk"}, 30);
		tryInput(new String[]{"Apple", "Banana", "Orange", "Milk", "Milk", "Cheese"}, 60);
		tryInput(new String[]{"Apple"}, 10);
		tryInput(new String[]{}, 0);
	}

	static void tryInput(String[] input, int expectedOutput){
						
		int result = CountGroceries.solve(input);
		
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

