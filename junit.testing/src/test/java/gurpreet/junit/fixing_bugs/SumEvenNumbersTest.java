package gurpreet.junit.fixing_bugs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SumEvenNumbersTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(0, 0, 0),
	 Arguments.of(0, 5, 6),
	 Arguments.of(0, 10, 30),
	 Arguments.of(1, 10, 30),
	 Arguments.of(10, 12, 22),
	 Arguments.of(11, 12, 12),
	 Arguments.of(4, 8, 18),
	 Arguments.of(3, 8, 18)
		);
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list of only friends with even length names")
public void sumEvenNumbersTest(int input,int input2, int expectedOutput){
	Assertions.assertThat(SumEvenNumbers.solve(input,input2)).isEqualTo(expectedOutput);
}
        
}

