/* 

SumEvenNumbers is a class with a `solve` method which takes two integers - start and end.
It then sums up all the even numbers in the range between start and end 
(including both start and end themselves).

Unfortunately, it's giving the wrong answers in some cases.

ALL of the inputs are correct, but some are showing "FAILED".

Can you find and fix the bug in the `solve` method? Do not change the inputs.

Hint: Look for patterns. Which inputs are failing? What's different about them?

 */

public class SumEvenNumbers {
	
	/* FIX THIS METHOD */	
	static int solve(int start, int end){		
	  if (start > end) {
            throw new IllegalArgumentException("Invalid range: start should be less than or equal to end");
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                sum += i;       // Add the even number to the sum
            }
        }
        return sum;
	}
	
	public static void main(String[] args) {
		
		// Don't modify this code
		tryInput(0, 0, 0);
		tryInput(0, 5, 6);
		tryInput(0, 10, 30);
		tryInput(1, 10, 30);
		tryInput(10, 12, 22);
		tryInput(11, 12, 12);
		tryInput(4, 8, 18);
		tryInput(3, 8, 18);
	}

	static void tryInput(int start, int end, int expectedOutput){
						
		int result = SumEvenNumbers.solve(start, end);
		
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

