package gurpreet.junit.exercises;
import java.util.ArrayList;

/* 
Write a function takes an ArrayList<Dog> and returns a
list of the names of all the pug owners. 
 */

public class GetPugOwners {
	
	static ArrayList<String> solve(ArrayList<Dog> input){
		
		// Insert your code here to return the names of pug owners
		ArrayList<String> result = new ArrayList(); 
		//Loop through each Dog element
		for (Dog dog : input) {
			// check for any Pug breed and add the owner if a pug is found  
			if(dog.breed.equals("Pug")) result.add(dog.owner);
		}
						return result;
	}
}

