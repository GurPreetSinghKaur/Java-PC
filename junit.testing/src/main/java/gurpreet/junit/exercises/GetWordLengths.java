package gurpreet.junit.exercises;
import java.util.ArrayList;
import java.util.List;

/* 
Write a function that takes a `string` and returns a list containing the
length of each word in that string.
If passed an empty string, the function should return an empty list.
Words will be separated by a single space.

Examples:

"Hello" should return [5]
"Hello everyone" should return [5,8]
"This is a sentence" should return [4,2,1,8]
"" should return []

 */

public class GetWordLengths {
	
	static ArrayList<Integer> solve(String input){
		
		// Insert your code here to return the lengths of each word in the string
		ArrayList<Integer> tempResult = new ArrayList();
		
		//Check whether the input is valid. if it is add the first placeholder for the length of the first word
		if (input.length() < 1) {
			return tempResult;
		} else {
			tempResult.add(0);
		}

		// use a manual index, only change for each word
		int currentIndex = 0;
		//Loop each char and if there is a letter, that means we still on the word and add +1 to the working index 
		//If a ' ' is found it means we need to accommodate the array to hold an extra placeholder and update 'currentIndex' to match it
		for (int i = 0; i < input.length(); i++) {
		 
			
			if (input.charAt(i) != ' ') {
				tempResult.set(currentIndex,tempResult.get(currentIndex) +1 );
			}
			else if (input.charAt(i) == ' ') {
				currentIndex++;
				tempResult.add(0);
			}
			

		}
						return tempResult;
	}
	
	public static void main(String[] args) {

		tryInput("", new ArrayList<>());
		tryInput("hello", new ArrayList<>(List.of(5)));
		tryInput("hello everyone", new ArrayList<>(List.of(5,8)));
		tryInput("this is a sentence", new ArrayList<>(List.of(4,2,1,8)));
		tryInput("I am writing some Java today", new ArrayList<>(List.of(1, 2, 7, 4,4,5)));					
	}

	static void tryInput(String input, ArrayList<Integer> expectedOutput){
		ArrayList<Integer> result = GetWordLengths.solve(input);
		if(result.equals(expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}
