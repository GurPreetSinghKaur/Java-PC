package gurpreet.junit.exercises;
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
		//Use a stream of FrenchStudent object. Stream will first map the object from FrenchStudent into EnglishStudent 
		//Then collect it as a list of <EnglishStudent> and return the first EnglishObject object from the list  
	List<EnglishStudent> list =	Stream.of(input).map(x -> new EnglishStudent(x.prénom,x.age,x.location)).collect(Collectors.toList());
						return list.get(0);													        	  
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