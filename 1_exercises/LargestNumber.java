/* 
Write a function that takes an integer and returns the largest number that can
be made by rearranging the digits.

Examples:

3 returns 3
123 returns 321
937846 returns 987643
43 returns 43

 */

public class LargestNumber {
	
	static int solve(int input){
		
		// Insert your code here
						
	}
	
	public static void main(String[] args) {

		tryInput(3, 3);
		tryInput(123, 321);
		tryInput(937486, 987643);
		tryInput(43, 43);		
		tryInput(100, 100);
		tryInput(195723853, 987553321);
		
	}

	static void tryInput(int input, int expectedOutput){
		int result = LargestNumber.solve(input);
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS: " + result + " = " + expectedOutput);
		}else{
			System.out.println("❌ FAILED: " + result + " != " + expectedOutput);
		}
	}

}
