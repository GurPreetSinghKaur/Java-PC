import java.util.Arrays;

public class FlipBooleans {
	
	static boolean[] solve(boolean[] input){
		
		// Insert your code here
		
		// Implement a function which flips each boolean value in an array
		// e.g. { true, false } should become { false, true}
		for (int i = 0; i < input.length; i++) {
			//! to flip the boolean
			input[i] = !input[i]; 

		}
	

		return input;
		
	}
	
	public static void main(String[] args) {

		tryInput(new boolean[]{ true, false, false, true}, new boolean[]{ false, true, true, false});
		tryInput(new boolean[]{ false, false, false, false, false}, new boolean[]{ true, true, true, true, true});
		tryInput(new boolean[]{ true, false, true, false}, new boolean[]{ false, true, false, true});

	}

	static void tryInput(boolean[] input, boolean[] expectedOutput){
		boolean[] result = FlipBooleans.solve(input);
		if(Arrays.equals(result, expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}