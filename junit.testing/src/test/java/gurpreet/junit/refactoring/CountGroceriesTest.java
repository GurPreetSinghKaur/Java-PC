package gurpreet.junit.refactoring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CountGroceriesTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new String[]{"Apple", "Banana", "Orange", "Milk"}, 40),
	 Arguments.of(new String[]{"Banana", "Orange", "Milk"}, 30),
	 Arguments.of(new String[]{"Apple", "Banana", "Orange", "Milk", "Milk", "Cheese"}, 60),
	 Arguments.of(new String[]{"Apple"}, 10),
	 Arguments.of(new String[]{}, 0)
		);
    }
@ParameterizedTest
@MethodSource("listOfValues")
public void countGroceriesTest(String[] input,int expectedOutput){

	Assertions.assertThat(CountGroceries.solve(input)).isEqualTo(expectedOutput);
}
        
}

