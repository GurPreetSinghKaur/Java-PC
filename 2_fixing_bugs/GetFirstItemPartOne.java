import java.util.ArrayList;
import java.util.List;

/* 
PART ONE:
GetFirstItemPartOne is a class with a `solve` method which takes a list and returns the first element.

Unfortunately, it looks like the function won't compile.

Try to compile the function, and read the error message carefully.

Can you work out what needs to be changed to make the function pass all the
tests?

HINT: Don't worry about the strange new <T> syntax - it's nothing to do with that. The problem is
something you are already familiar with. Read the code carefully!

NOTE: This new <T> syntax allows lists of all different types to be used - the examples here use both
String AND int lists. We'll explore the power of this syntax later in the bootcamp.

 */

public class GetFirstItemPartOne {
	
	/* FIX THIS METHOD */	
	static <T> T solve(ArrayList<T> input){		
		T firstItem = input.get(0);
		return firstItem;
	}
	
	public static void main(String[] args) {
		
		tryInput(new ArrayList<>(List.of("apple", "orange", "banana", "pomegranate")), "apple");
		tryInput(new ArrayList<>(List.of("banana", "orange", "apple", "pomegranate")), "banana");
		tryInput(new ArrayList<>(List.of(2, 3, 4, 5)), 2);
		
	}

	static <T> void tryInput(ArrayList<T> input, T expectedOutput){
		T result = GetFirstItemPartOne.solve(input);
		if(result.equals(expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

