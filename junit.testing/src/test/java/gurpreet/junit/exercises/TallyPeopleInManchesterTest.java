package gurpreet.junit.exercises;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class TallyPeopleInManchesterTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of(new ArrayList<>(), 0),
	 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum","Edinburgh", false))), 0),
	 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", "Edinburgh", false), new Person("Diane", "Manchester", false))), 1),
	 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", "Edinburgh", false), new Person("Diane", "Manchester", false), new Person("Egbert", "Manchester", true))), 2),
	 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", "Edinburgh", false), new Person("Diane", "Manchester", false), new Person("Egbert", "Manchester", true), new Person("Francesco", "Liverpool", true))), 2)
	      );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns the count of people who have their city set to Manchester.")
public void tallyPeopleInManchesterTest(ArrayList<Person> input, int  expectedOutput){
	Assertions.assertThat(TallyPeopleInManchester.solve(input)).isEqualTo(expectedOutput);
}
        
}

