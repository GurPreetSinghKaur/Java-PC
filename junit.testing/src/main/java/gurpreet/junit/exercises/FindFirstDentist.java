import java.util.Arrays;
import java.util.Objects;
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
	
	public static void main(String[] args) {

		tryInput(new ArrayList<>(), null);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", false))), null);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false))), null);
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false), new Person("Egbert", true))), "Egbert");
		tryInput(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false), new Person("Egbert", true), new Person("Francesco", true))), "Egbert");

	}

	static void tryInput(ArrayList<Person> input, String expectedOutput){
		String result = FindFirstDentist.solve(input);
		if(Objects.equals(result, expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

class Person {
	public String name;
	public boolean isDentist;
	
	Person(String name, boolean isDentist){
		this.name = name;
		this.isDentist = isDentist;
		
	}
}
