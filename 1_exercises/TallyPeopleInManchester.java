import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
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
	
	public static void main(String[] args) {

		tryInput(new ArrayList<>(), 0);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum","Edinburgh", false))), 0);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", "Edinburgh", false), new Person("Diane", "Manchester", false))), 1);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", "Edinburgh", false), new Person("Diane", "Manchester", false), new Person("Egbert", "Manchester", true))), 2);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", "Edinburgh", false), new Person("Diane", "Manchester", false), new Person("Egbert", "Manchester", true), new Person("Francesco", "Liverpool", true))), 2);

	}

	static void tryInput(ArrayList<Person> input, int expectedOutput){
		int result = TallyPeopleInManchester.solve(input);
		if(result == expectedOutput){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

class Person {
	public String name;
	public boolean isDentist;
	public String city;
	
	Person(String name, String city, boolean isDentist){
		this.name = name;
		this.city = city;
		this.isDentist = isDentist;
		
	}
}
