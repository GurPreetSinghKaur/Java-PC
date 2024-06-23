package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class GetPalindromesTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new ArrayList<>(), new ArrayList<>()),
	 Arguments.of(new ArrayList<>(List.of("racecar")), new ArrayList<>(List.of("racecar"))),
	 Arguments.of(new ArrayList<>(List.of("zracecar")), new ArrayList<>()),
	 Arguments.of(new ArrayList<>(List.of("dog", "dud", "car", "mum")), new ArrayList<>(List.of("dud", "mum"))),
	 Arguments.of(new ArrayList<>(List.of("apple", "orange", "banana", "mum")), new ArrayList<>(List.of("mum")))
        );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list containing all of the words that are palindromes")
public void getPalindromesTest(ArrayList<String> input, ArrayList<String> expectedOutput){
	Assertions.assertEquals(GetPalindromes.solve(input), expectedOutput);
}
        
}

