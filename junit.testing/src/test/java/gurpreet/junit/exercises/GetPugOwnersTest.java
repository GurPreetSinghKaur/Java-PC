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


public class GetPugOwnersTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new ArrayList<>(), new ArrayList<>()),
	 Arguments.of(new ArrayList<Dog>(Arrays.asList(new Dog("Beatrice","Lurcher", "Tom"))), new ArrayList<>()),
	 Arguments.of(new ArrayList<Dog>(Arrays.asList(new Dog("Beatrice","Pug", "Tom"))), new ArrayList<>(Arrays.asList("Tom"))),
	 Arguments.of(new ArrayList<Dog>(Arrays.asList(new Dog("Beatrice","Pug", "Tom"), new Dog("Izzi","Pug", "Max"), new Dog("Poppy","Lurcher", "Anat"))), new ArrayList<>(Arrays.asList("Tom", "Max")))
	        );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a list of the names of all the pug owners")
public void getPugOwnersTest(ArrayList<Dog> input, ArrayList<String> expectedOutput){
	Assertions.assertEquals(GetPugOwners.solve(input), expectedOutput);
}
        
}

