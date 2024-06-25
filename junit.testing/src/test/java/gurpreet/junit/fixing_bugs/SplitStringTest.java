package gurpreet.junit.fixing_bugs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SplitStringTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(null, new char[0]),
	 Arguments.of("banana", new char[]{'b', 'a', 'n', 'a', 'n', 'a'}),
	 Arguments.of("apple", new char[]{'a', 'p', 'p', 'l', 'e'}),
	 Arguments.of("cake", new char[]{'c', 'a', 'k', 'e'}) );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a char array of the String input")
public void splitStringTest(String input, char [] expectedOutput){
	Assertions.assertThat(SplitString.solve(input)).isEqualTo(expectedOutput);
}
        
}

