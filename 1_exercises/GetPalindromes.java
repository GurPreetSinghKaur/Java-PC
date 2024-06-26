import java.util.ArrayList;
import java.util.List;
import java.util.*;
/* 
Write a function that takes a list of words and returns a list containing
all of the words that are palindromes (the same word forwards and backwards, e.g. 'pip').

 */

public class GetPalindromes {
	
	static ArrayList<String> solve(ArrayList<String> input){
		
		// Insert your code here to return the list of palindromes
		ArrayList<String> result = new ArrayList();
		
		for (int i = 0; i < input.size(); i++) {
			StringBuilder sb = new StringBuilder(input.get(i));
			//reverse the stringBuilder, then reverse the string, finally check if it is the same as the original string.
			if (sb.reverse().toString().equals(input.get(i))) result.add(input.get(i)); 
			
		}




		return result;
						
	}
	
	public static void main(String[] args) {

		tryInput(new ArrayList<>(), new ArrayList<>());

		tryInput(new ArrayList<>(List.of("racecar")), new ArrayList<>(List.of("racecar")));

		tryInput(new ArrayList<>(List.of("zracecar")), new ArrayList<>());

		tryInput(new ArrayList<>(List.of("dog", "dud", "car", "mum")), new ArrayList<>(List.of("dud", "mum")));

		tryInput(new ArrayList<>(List.of("apple", "orange", "banana", "mum")), new ArrayList<>(List.of("mum")));
				
	}

	static void tryInput(ArrayList<String> input, ArrayList<String> expectedOutput){
		ArrayList<String> result = GetPalindromes.solve(input);
		if(result.equals(expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}
