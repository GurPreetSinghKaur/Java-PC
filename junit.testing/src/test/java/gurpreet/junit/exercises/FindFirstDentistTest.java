package gurpreet.junit.exercises;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class FindFirstDentistTest {
	//need to change from strung to person object

 private static Stream<Arguments> listOfPerson() {
        return Stream.of(
		 Arguments.of(new ArrayList<>(), null),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false))), null),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false))), null),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false), new Person("Egbert", true))), "Egbert"),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false), new Person("Egbert", true), new Person("Francesco", true))), "Egbert")
	}


        );
    }
@ParameterizedTest
@MethodSource(strings = ("listOfPerson")
public void findFirstDentistTest(){}
// Insert your code here to return the name of the first dentist in the list
		for (Person p : input) {
			//Get the first dentist name
			if(p.isDentist) return p.name;
		}

		return null;
}

