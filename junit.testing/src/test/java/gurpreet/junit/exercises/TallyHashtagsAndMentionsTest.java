package gurpreet.junit.exercises;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

public class TallyHashtagsAndMentionsTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of("So excited to start at @northcoders on Monday! #learntocode #codingbootcamp", Map.of("mentions", 1, "hashtags", 2)),
	 Arguments.of("So excited to start at @northcoders on Monday! #codingbootcamp", Map.of("mentions", 1, "hashtags", 1)),
	 Arguments.of("Hey @coolperson! You should come join a #codingbootcamp @northcoders", Map.of("mentions", 2, "hashtags", 1)),
	 Arguments.of("Having a nice sandwich for lunch", Map.of("mentions", 0, "hashtags", 0)),
	 Arguments.of("Having a nice sandwich for lunch #whocares #lunch #sandwich #icare #hashtag", Map.of("mentions", 0, "hashtags", 5)),
	 Arguments.of("", Map.of("mentions", 0, "hashtags", 0))
	      );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a Map<String, Integer> describing the number of hashtags and\n" +
		"mentions found in the string")
public void tallyHashtagsAndMentionsTest(String input, Map<String, Integer>  expectedOutput){
	Assertions.assertThat(TallyHashtagsAndMentions.solve(input)).isEqualTo(expectedOutput);
}
        
}

