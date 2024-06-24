package gurpreet.junit.exercises;
import java.util.Arrays;
import java.util.ArrayList;
/* 

Write a function that takes an ArrayList<Person> and
returns the count of people who have their city set to Manchester.
  
 */

public class TallyPeopleInManchester {
	
	static int solve(ArrayList<Person> input){
		
		// Insert your code here to return the count of people who live in Manchester
		//Use a filter() from the stream function in order to filter only Person.city which are equals to "Manchester"
		 return (int)(long) input.stream().filter( x -> x.city == "Manchester" ).count(); 					
					}

}

