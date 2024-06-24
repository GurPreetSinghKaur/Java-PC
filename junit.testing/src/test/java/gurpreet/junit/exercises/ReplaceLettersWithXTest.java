package gurpreet.junit.exercises;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ReplaceLettersWithXTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of("", ""),
	 Arguments.of("a", "X"),
	 Arguments.of("A", "X"),
	 Arguments.of("hello", "XXXXX"),
	 Arguments.of("Hello!", "XXXXX!"),
	 Arguments.of("Do you like coding?", "XX XXX XXXX XXXXXX?")

	      );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a List containing correctly matched DNA pairs")
public void replaceLettersWithXTest(String input, String expectedOutput){
	//Assertions.assertSame(ReplaceLettersWithX.solve(input), expectedOutput);
	Assertions.assertThat(ReplaceLettersWithX.solve(input)).isEqualTo(expectedOutput);
}
        
}

