import java.util.Arrays;
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
	
	public static void main(String[] args) {

		tryInput(new ArrayList<>(), new ArrayList<>());
		tryInput(new ArrayList<Dog>(Arrays.asList(new Dog("Beatrice","Lurcher", "Tom"))), new ArrayList<>());
		tryInput(new ArrayList<Dog>(Arrays.asList(new Dog("Beatrice","Pug", "Tom"))), new ArrayList<>(Arrays.asList("Tom")));
		tryInput(new ArrayList<Dog>(Arrays.asList(new Dog("Beatrice","Pug", "Tom"), new Dog("Izzi","Pug", "Max"), new Dog("Poppy","Lurcher", "Anat"))), new ArrayList<>(Arrays.asList("Tom", "Max")));
	}

	static void tryInput(ArrayList<Dog> input, ArrayList<String> expectedOutput){
		ArrayList<String> result = GetPugOwners.solve(input);
		if(result.equals(expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

class Dog {
	public String name;
	public String breed;
	public String owner;
	
	Dog(String name, String breed, String owner){
		this.name = name;
		this.breed = breed;
		this.owner = owner;		
	}
}
