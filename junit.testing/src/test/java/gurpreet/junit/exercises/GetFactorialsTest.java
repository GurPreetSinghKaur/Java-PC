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


public class GetFactorialsTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new ArrayList<>(), new ArrayList<>()),
	 Arguments.of(new ArrayList<>(List.of(4)), new ArrayList<>(List.of(24))),
	 Arguments.of(new ArrayList<>(List.of(3,4)), new ArrayList<>(List.of(6,24))),
	 Arguments.of(new ArrayList<>(List.of(3)), new ArrayList<>(List.of(6))),
	 Arguments.of(new ArrayList<>(List.of(1,5,2)), new ArrayList<>(List.of(1,120,2)))
        );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list containing the factorial of each number in the list")
public void getFactorialsTest(ArrayList<Integer> input, ArrayList<Integer> expectedOutput){
	Assertions.assertEquals(GetFactorials.solve(input), expectedOutput);
}
        
}

