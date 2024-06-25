package gurpreet.junit.fixing_bugs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SendPartyInvitesTest {

 private static Stream<Arguments> listOfValues() {
	 var s1 = new PlaylistDuration.Song("Song1", 180, true);
	 var s2 = new PlaylistDuration.Song("Song2", 240, true);
	 var s3 = new PlaylistDuration.Song("Song3", 210, false);
	 var s4 = new PlaylistDuration.Song("Song4", 300, true);
	 var s5 = new PlaylistDuration.Song("Song5", 190, false);
        return Stream.of(
	Arguments.of(List.of("Alice", "Bob", "Charlie", "David"), new ArrayList<String>()),
	Arguments.of(List.of("Paul", "Bob", "Charlie", "David"), List.of("Paul")),
	Arguments.of(List.of("Paul", "John", "George", "Ringo"), List.of("Paul", "John", "George")),
	Arguments.of(List.of("Jurgen", "Virgil", "Luis", "Darwin"), List.of("Jurgen", "Virgil", "Luis", "Darwin"))
		   );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list of only friends with even length names")
public void sendPartyInvitesTest(List<String> input, List<String>  expectedOutput){
	Assertions.assertThat(SendPartyInvites.solve(input)).isEqualTo(expectedOutput);
}
        
}

