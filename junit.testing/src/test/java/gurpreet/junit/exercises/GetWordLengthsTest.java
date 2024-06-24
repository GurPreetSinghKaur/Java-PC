package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class GetWordLengthsTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of("", new ArrayList<>()),
	 Arguments.of("hello", new ArrayList<>(List.of(5))),
	 Arguments.of("hello everyone", new ArrayList<>(List.of(5,8))),
	 Arguments.of("this is a sentence", new ArrayList<>(List.of(4,2,1,8))),
	 Arguments.of("I am writing some Java today", new ArrayList<>(List.of(1, 2, 7, 4,4,5)))
	       );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list containing the length of each word in that String")
public void getWordLengthsTest(String input, ArrayList<Integer> expectedOutput){
	Assertions.assertEquals(GetWordLengths.solve(input), expectedOutput);
}
        
}

