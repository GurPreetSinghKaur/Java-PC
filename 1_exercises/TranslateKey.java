/* 

Northcoders are expanding to France!

Unfortunately for us, our team on the ground in Paris are patriotically
Francophone and have been providing us with student data partly in French.

Write a function that will take an object representing a student's data in French, 
and convert it to a student's data in English.

In particular, the member "prénom" needs translating to "name" on the EnglishStudent.
  
 */
import java.util.stream.*;
import java.util.stream.Collectors;

import java.util.*;

public class TranslateKey {
	
	static EnglishStudent solve(FrenchStudent input){
		
		// Insert your code here to convert the FrenchStudent to an EnglishStudent
	List<EnglishStudent> list =	Stream.of(input).map(x -> new EnglishStudent(x.prénom,x.age,x.location)).collect(Collectors.toList());
						return list.get(0);													        	  
	}
	
	public static void main(String[] args) {

		tryInput(new FrenchStudent("Carla", 21, "Paris"), new EnglishStudent("Carla", 21,"Paris"));
		tryInput(new FrenchStudent("Simone", 28, "Nice"), new EnglishStudent("Simone", 28,"Nice"));
		tryInput(new FrenchStudent("Gini", 51, "Marseille"), new EnglishStudent("Gini", 51,"Marseille"));

	}

	static void tryInput(FrenchStudent input, EnglishStudent expectedOutput){
		EnglishStudent result = TranslateKey.solve(input);
		if(result == null){
			System.out.println("❌ FAILED: No student returned");
		}else{
			if(result.name.equals(expectedOutput.name) && result.age == expectedOutput.age && result.location.equals(expectedOutput.location)){
				System.out.println("✅ SUCCESS");
			}else{
				System.out.println("❌ FAILED");
			}
		}
	}

}

class FrenchStudent {
	public String prénom;
	public int age;
	public String location;

	FrenchStudent(String prénom, int age, String location){
		this.prénom = prénom;
		this.age = age;
		this.location = location;
	}
}

class EnglishStudent {
	public String name;
	public int age;
	public String location;

	EnglishStudent(String name, int age, String location){
		this.name = name;
		this.age = age;
		this.location = location;
	}
}