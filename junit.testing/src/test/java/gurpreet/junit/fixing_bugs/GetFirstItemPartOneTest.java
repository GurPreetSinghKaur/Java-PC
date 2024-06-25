package gurpreet.junit.fixing_bugs;

import gurpreet.junit.fixing_bugs.GetFirstItemPartOne;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GetFirstItemPartOneTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
     Arguments.of(new ArrayList<>(List.of("apple", "orange", "banana", "pomegranate")), "apple"),
	 Arguments.of(new ArrayList<>(List.of("banana", "orange", "apple", "pomegranate")), "banana"),
	 Arguments.of(new ArrayList<>(List.of(2, 3, 4, 5)), 2)
		   );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns the first element of a list")
public <T> void getFirstItemPartOneTest(ArrayList<T> input, T  expectedOutput){
	Assertions.assertThat(GetFirstItemPartOne.solve(input)).isEqualTo(expectedOutput);
}
        
}

