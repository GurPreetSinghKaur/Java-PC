package gurpreet.junit.fixing_bugs;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

public class PlaylistDurationTest {

 private static Stream<Arguments> listOfValues() {
	 var s1 = new PlaylistDuration.Song("Song1", 180, true);
	 var s2 = new PlaylistDuration.Song("Song2", 240, true);
	 var s3 = new PlaylistDuration.Song("Song3", 210, false);
	 var s4 = new PlaylistDuration.Song("Song4", 300, true);
	 var s5 = new PlaylistDuration.Song("Song5", 190, false);
        return Stream.of(
	 Arguments.of(List.of(s1), 180),
	 Arguments.of(List.of(s2), 240),
	 Arguments.of(List.of(s1,s2,s4), 720),
	 Arguments.of(List.of(s1,s2,s4,s4), 1020),
	 Arguments.of(List.of(s2,s3,s4), 540),
	 Arguments.of(List.of(s1,s2,s4,s4,s1,s2), 1440),
	 Arguments.of(List.of(s1,s2,s3,s4,s5), 720)

		   );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns the total duration of all the songs in the playlist")
public void playlistDurationTest(List<PlaylistDuration.Song> input, int  expectedOutput){
	Assertions.assertThat(PlaylistDuration.solve(input)).isEqualTo(expectedOutput);
}
        
}

