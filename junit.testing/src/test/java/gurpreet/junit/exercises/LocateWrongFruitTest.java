package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class LocateWrongFruitTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new ArrayList<>(), 0),
	 Arguments.of(new ArrayList<>(List.of("apple", "apple", "apple", "apple", "elppa", "apple")), 4),
	 Arguments.of(new ArrayList<>(List.of("apple", "apple", "elppa")), 2),
	 Arguments.of(new ArrayList<>(List.of("apple", "elppa", "apple")), 1),
	 Arguments.of(new ArrayList<>(List.of("banana", "ananab", "banana", "banana")), 1),
	 Arguments.of(new ArrayList<>(List.of("ananab", "ananab", "banana", "ananab")), 2),
	 Arguments.of(new ArrayList<>(List.of("apple", "elppa")), 0)
		       );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns the wrong fruit in an array")
public void locateWrongFruitTest(ArrayList<String> input, int expectedOutput){
	Assertions.assertEquals(LocateWrongFruit.solve(input), expectedOutput);
}
        
}

