package gurpreet.junit.exercises;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class TranslateKeyTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
     Arguments.of(new FrenchStudent("Carla", 21, "Paris"), new EnglishStudent("Carla", 21,"Paris")),
	 Arguments.of(new FrenchStudent("Simone", 28, "Nice"), new EnglishStudent("Simone", 28,"Nice")),
	 Arguments.of(new FrenchStudent("Gini", 51, "Marseille"), new EnglishStudent("Gini", 51,"Marseille"))
		);
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Convert the FrenchStudent to an EnglishStudent")
public void translateKeyTest(FrenchStudent input, EnglishStudent  expectedOutput){
	Assertions.assertThat(TranslateKey.solve(input)).isEqualToComparingFieldByField(expectedOutput);
}
        
}

