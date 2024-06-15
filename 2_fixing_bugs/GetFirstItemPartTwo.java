import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
PART TWO:

This time the problem from Part One has already been fixed. 
This code compiles without any problems.

However, when we run the code it fails - someone has added new input data 
which the `solve` method doesn't handle correctly.

Without modifying the input data, can you fix the `solve` method 
to handle this new input and give the expected output?

(To keep it simple, we've restricted the input to only ArrayList<String> 
this time, but the same fix would apply even with the generic <T> syntax 
that allows all possible lists that we saw in Part One.)

 */

public class GetFirstItemPartTwo {
	
	/* FIX THIS METHOD */	
	static String solve(ArrayList<String> input){		
		String firstItem = input.get(0);
		return firstItem;
	}
	
	public static void main(String[] args) {
		
		// Don't modify this code
		tryInput(new ArrayList<>(), null);
		tryInput(new ArrayList<>(List.of("apple", "orange", "banana", "pomegranate")), "apple");
		tryInput(new ArrayList<>(List.of("banana", "orange", "apple", "pomegranate")), "banana");
				
	}

	static void tryInput(ArrayList<String> input, String expectedOutput){
		String result = GetFirstItemPartTwo.solve(input);
		if(Objects.equals(result, expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

