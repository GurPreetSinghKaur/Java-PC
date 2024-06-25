package gurpreet.junit.fixing_bugs;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GetFirstItemPartTwoTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
     Arguments.of(new ArrayList<>(List.of("apple", "orange", "banana", "pomegranate")), "apple"),
	 Arguments.of(new ArrayList<>(List.of("banana", "orange", "apple", "pomegranate")), "banana"),
	 Arguments.of(new ArrayList<>(), null)
		   );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns the first element of a list")
public <T> void getFirstItemPartTwoTest(ArrayList<String> input, T  expectedOutput){
	Assertions.assertThat(GetFirstItemPartTwo.solve(input)).isEqualTo(expectedOutput);
}
        
}

