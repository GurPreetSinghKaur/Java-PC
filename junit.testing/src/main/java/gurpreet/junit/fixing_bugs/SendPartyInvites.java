package gurpreet.junit.fixing_bugs;

import java.util.List;
import java.util.ArrayList;

/* 

SendPartyInvites is a class with a `solve` method which takes a list of friends to invite to the party.

Of course, like all good parties, we only want to invite friends with even-length names, so the `solve`
method returns a list of only friends with even length names.

Unfortunately, there's a bug in the `solve` method and the wrong friends are being invited!

Can you find and fix the bug in the `solve` method? Do not change the inputs.

 */

public class SendPartyInvites {
	
	/* FIX THIS METHOD */	
	static List<String> solve(List<String> friends){	

		List<String> invitedFriends = new ArrayList<>();

		for (String friend : friends) {
				if (friend.length() % 2 == 0) {
						invitedFriends.add(friend);
				}
		}
		
		return invitedFriends;
	}

}

