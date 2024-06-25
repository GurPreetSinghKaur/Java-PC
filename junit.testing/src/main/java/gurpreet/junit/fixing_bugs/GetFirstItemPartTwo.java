package gurpreet.junit.fixing_bugs;

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
		if (input.size() < 1) return null;	
		String firstItem = input.get(0);
		return firstItem;
	}

}

