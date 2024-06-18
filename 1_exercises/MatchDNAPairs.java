import java.util.ArrayList;
import java.util.List;
import java.util.HashMap; 
import java.util.Map;

/* 
This function takes a string of DNA, such as 'GTCA', and returns a list
containing correctly matched DNA pairs.

The pairs are as follows:

'G' -> 'C'
'C' -> 'G'
'T' -> 'A'
'A' -> 'T'

The function should ignore any letters that are not valid DNA pairs
(e.g. not 'G', 'C', 'T' or 'A').
However, it should also work for lowercase and uppercase letters.

'G' returns ['GC']
'GAT' returns ['GC', 'AT', 'TA']
'GYTC' returns ['GC', 'TA', 'CG']
'gat' returns ['GC', 'AT', 'TA']
'gxat' returns ['GC', 'AT', 'TA']

 */

public class MatchDNAPairs {
	
	static ArrayList<String> solve(String input){
		
		// Insert your code here
		//Use a HashMap and add K : V pair 
		//Loop through each character to check if it is in the hashmap then add its value to the ArrayList
		 ArrayList<String> result = new ArrayList();
		 HashMap<Character,String> hashMap = new HashMap();

		 //Make the String upper case
		 input = input.toUpperCase();
		 hashMap.put('G',"GC");
		 hashMap.put('C',"CG");
		 hashMap.put('T',"TA");
		 hashMap.put('A',"AT");

		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			if (hashMap.containsKey(input.charAt(i))) result.add(hashMap.get(input.charAt(i)));
		}
	
		  
	return result;
						
	}
	
	public static void main(String[] args) {

		tryInput("", new ArrayList<>());
		tryInput("G", new ArrayList<>(List.of("GC")));
		tryInput("C", new ArrayList<>(List.of("CG")));
		tryInput("T", new ArrayList<>(List.of("TA")));
		tryInput("A", new ArrayList<>(List.of("AT")));
		tryInput("g", new ArrayList<>(List.of("GC")));
		tryInput("c", new ArrayList<>(List.of("CG")));
		tryInput("t", new ArrayList<>(List.of("TA")));
		tryInput("a", new ArrayList<>(List.of("AT")));
		
		tryInput("GAT", new ArrayList<>(List.of("GC", "AT", "TA")));
		tryInput("GYTC", new ArrayList<>(List.of("GC", "TA", "CG")));
		tryInput("gat", new ArrayList<>(List.of("GC", "AT", "TA")));
		tryInput("gxat", new ArrayList<>(List.of("GC", "AT", "TA")));	
		
	}

	static void tryInput(String input, ArrayList<String> expectedOutput){
		ArrayList<String> result = MatchDNAPairs.solve(input);
		if(result.equals(expectedOutput)){
			System.out.println("✅ SUCCESS");
		}else{
			System.out.println("❌ FAILED");
		}
	}

}