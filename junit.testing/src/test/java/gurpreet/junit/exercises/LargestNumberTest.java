package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class LargestNumberTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(3, 3),
	 Arguments.of(123, 321),
	 Arguments.of(937486, 987643),
	 Arguments.of(43, 43),
	 Arguments.of(100, 100),
	 Arguments.of(195723853, 987553321)
	       );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns the largest number that can be made by rearranging the digits")
public void largestNumberTest(int input, int expectedOutput){
	Assertions.assertEquals(LargestNumber.solve(input), expectedOutput);
}
        
}

