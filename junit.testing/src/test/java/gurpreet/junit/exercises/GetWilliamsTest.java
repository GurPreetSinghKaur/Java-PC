package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class GetWilliamsTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new ArrayList<>(), new ArrayList<>()),
	 Arguments.of(new ArrayList<>(List.of("David Williams")), new ArrayList<>(List.of("David Williams"))),
	 Arguments.of(new ArrayList<>(List.of("David Williams", "Sarah Williams")), new ArrayList<>(List.of("David Williams", "Sarah Williams"))),
	 Arguments.of(new ArrayList<>(List.of("Kirsty February")), new ArrayList<>()),
	 Arguments.of(new ArrayList<>(List.of("Kirsty February", "Sam Williams")), new ArrayList<>(List.of("Sam Williams"))),
	 Arguments.of(new ArrayList<>(List.of("William David", "Cole Williamson", "Williams Jameson")), new ArrayList<>())
	        );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list of each person whose last name is 'Williams'")
public void getWilliamsTest(ArrayList<String> input, ArrayList<String> expectedOutput){
	Assertions.assertEquals(GetWilliams.solve(input), expectedOutput);
}
        
}

