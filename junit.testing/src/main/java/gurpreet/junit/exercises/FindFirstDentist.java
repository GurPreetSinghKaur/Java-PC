package gurpreet.junit.exercises;

import java.util.ArrayList;
/* 

Write a function that takes an ArrayList<Person> and
returns the name of the first person in the list that has the `'isDentist'`
property set to `true`. If no dentists are included in the list,
the function should return `null`.
  
 */
public class FindFirstDentist {
	
	static String solve(ArrayList<Person> input){
		
		// Insert your code here to return the name of the first dentist in the list
		for (Person p : input) {
			//Get the first dentist name
			if(p.isDentist) return p.name;

		}

		return null;
						
	}
}


