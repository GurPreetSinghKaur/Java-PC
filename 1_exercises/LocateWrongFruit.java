import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.*;

/* 
This function takes a list of fruit in the format:

['apple', 'apple', 'apple', 'apple', 'elppa', 'apple']

The fruit will all be the 'right way round' apart from one fruit! Your function should return its zero-based index position.
So in this example, the function should return 4.

Note: The fruit will not always be apple, but it will always be a group
of the same kind of fruit.

Note: The right way around depends on the majority of the fruit - if they're all backwards except for one,
then the non-backwards fruit is the wrong way round in this case!

Examples:

['apple', 'apple', 'elppa'] returns 2

['apple', 'elppa', 'apple'] returns 1

['banana', 'ananab', 'banana', 'banana'] returns 1

['ananab', 'ananab', 'banana', 'ananab'] returns 2

['apple', 'elppa'] returns 0 
(as we can't tell which one is the right way round with less than 3 pieces of fruit)


 */

public class LocateWrongFruit {
	
	static int solve(ArrayList<String> input){
		
		// Insert your code here 
		//apple:{0,1,2,3}
		//apl:3
		HashMap<String, List<Integer>> map = new HashMap();

		for (int i =0;i<input.size(); i++){

		map.put(input.get(i), map.getOrDefault(input.get(i), new ArrayList<>())  )	;
		map.get(input.get(i)).add(i);


		}

		for (var entrySet : map.entrySet()) {
			if (entrySet.getValue().size() == 1) return entrySet.getValue().get(0);
		}

	//	System.out.println(map);
		return 0;
						
	}
	
	public static void main(String[] args) {

		tryInput(new ArrayList<>(), 0);
		tryInput(new ArrayList<>(List.of("apple", "apple", "apple", "apple", "elppa", "apple")), 4);
		tryInput(new ArrayList<>(List.of("apple", "apple", "elppa")), 2);
		tryInput(new ArrayList<>(List.of("apple", "elppa", "apple")), 1);
		tryInput(new ArrayList<>(List.of("banana", "ananab", "banana", "banana")), 1);
		tryInput(new ArrayList<>(List.of("ananab", "ananab", "banana", "ananab")), 2);
		tryInput(new ArrayList<>(List.of("apple", "elppa")), 0);
		
	}

	static void tryInput(ArrayList<String> input, int expectedOutput){
		int result = LocateWrongFruit.solve(input);
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

