package gurpreet.junit.refactoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MessyCalculatorTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(

		);
    }
@ParameterizedTest
@MethodSource("listOfValues")
public void countGroceriesTest(String[] input,int expectedOutput){

	Assertions.assertThat(CountGroceries.solve(input)).isEqualTo(expectedOutput);
}
        
}

