package gurpreet.junit.exercises;
import java.util.Map;
import java.util.*;
/* 

This function receives a tweet String that will contain a number of mentions and
hashtags, as seen on Twitter (sorry... 'X' 😂)

A hashtag is marked by `#` and a mention is marked by `@`.

The function should return a Map<String, Integer> describing the number of hashtags and
mentions found in the string:

Example:

If the tweet string says "So excited to start at @northcoders on Monday!
#learntocode #codingbootcamp"

then your function should return a Map containing: {'hashtags': 2, 'mentions': 1}
  
 */

public class TallyHashtagsAndMentions {
	
	static Map<String, Integer> solve(String input){
		
		// Insert your code here to return the the number of hashtags and mentions

		//Use a HashMap and K : V pair
		//Use String.indexOf() in order to check if a match is found and if it is then updated occurrence from HashMap
		HashMap<String, Integer> map = new HashMap();
		boolean mention = true;
		boolean hashtag = true;
		map.put("mentions", 0);
		map.put("hashtags", 0);

		while (mention | hashtag) {

			if (mention && input.indexOf('@') != -1) {
			input =	input.replaceFirst ("@", "");
				map.put("mentions",map.get("mentions") +1);
			} else mention = false;

			if (hashtag && input.indexOf('#') != -1) {
			input =	input.replaceFirst("#", "");
				map.put("hashtags",map.get("hashtags") +1);
			} else hashtag = false;

		}
		return map;
	}
}
