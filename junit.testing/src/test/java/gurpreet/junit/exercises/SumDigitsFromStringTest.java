package gurpreet.junit.exercises;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SumDigitsFromStringTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of("", 0),
	 Arguments.of("1", 1),
	 Arguments.of("168", 15),
	 Arguments.of("+he12ll3", 6),
	 Arguments.of("northcoders", 0),
	 Arguments.of("01010101", 4),
	 Arguments.of("x0d1e0t1s0a1g0e1", 4)
	      );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Adds all the numbers in the String together")
public void sumDigitsFromStringTest(String input, int expectedOutput){
	//Assertions.assertSame(ReplaceLettersWithX.solve(input), expectedOutput);
	Assertions.assertThat(SumDigitsFromString.solve(input)).isEqualTo(expectedOutput);
}
        
}

