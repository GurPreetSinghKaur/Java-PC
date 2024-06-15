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

		for (int i =0; i < input.size(); i++) {
			String[] temp = input.get(i).split(" ");
			 
			if (temp[1].equals("Williams")) result.add(input.get(i));
		}
	return result;					
	}
	
	public static void main(String[] args) {

		tryInput(new ArrayList<>(), new ArrayList<>());
		tryInput(new ArrayList<>(List.of("David Williams")), new ArrayList<>(List.of("David Williams")));
		tryInput(new ArrayList<>(List.of("David Williams", "Sarah Williams")), new ArrayList<>(List.of("David Williams", "Sarah Williams")));
		tryInput(new ArrayList<>(List.of("Kirsty February")), new ArrayList<>());
		tryInput(new ArrayList<>(List.of("Kirsty February", "Sam Williams")), new ArrayList<>(List.of("Sam Williams")));
		tryInput(new ArrayList<>(List.of("William David", "Cole Williamson", "Williams Jameson")), new ArrayList<>());
	}

	static void tryInput(ArrayList<String> input, ArrayList<String> expectedOutput){
		ArrayList<String> result = GetWilliams.solve(input);
		if(result.equals(expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}

