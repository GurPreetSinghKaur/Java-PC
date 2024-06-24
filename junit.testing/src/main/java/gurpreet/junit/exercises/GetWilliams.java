package gurpreet.junit.exercises;
import java.util.ArrayList;
import java.util.List;

/* 
Write a function that takes a list of `names` representing a person's full
name and returns a list of each person whose last name is 'Williams'.

Examples:

['David Williams'] returns ['David Williams']

['David Williams', 'Sarah Williams'] returns ['David Williams', 'Sarah Williams']

['Kirsty February'] returns []

['Kirsty February', 'Sam Williams'] returns ['Sam Williams']

['William David', 'Cole Williamson'] returns []

 */

public class GetWilliams {
	
	static ArrayList<String> solve(ArrayList<String> input){
		
		// Insert your code here 
		ArrayList<String> result = new ArrayList();
		//Split each name into two by using the String.split() which will effectively return an array with the strings cut up to each ' ' 
		//Match the last word which will be the word after the ' ' to 'Williams' and add it to the array if it is the case
		for (int i =0; i < input.size(); i++) {
			String[] temp = input.get(i).split(" ");
			 
			if (temp[1].equals("Williams")) result.add(input.get(i));
		}
	return result;					
	}
	

}

