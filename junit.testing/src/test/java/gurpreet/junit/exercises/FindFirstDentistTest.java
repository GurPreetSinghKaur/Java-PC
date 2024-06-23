package gurpreet.junit.exercises;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FindFirstDentistTest {
	//need to change from strung to person object

 private static Stream<Arguments> listOfPerson() {
        return Stream.of(

		 Arguments.of(new ArrayList<>(), null),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false))), null),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false))), null),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false), new Person("Egbert", true))), "Egbert"),
		 Arguments.of(new ArrayList<Person>(Arrays.asList(new Person("Callum", false), new Person("Diane", false), new Person("Egbert", true), new Person("Francesco", true))), "Egbert")



        );
    }
@ParameterizedTest
@MethodSource("listOfPerson")
@DisplayName("Find the first dentist from the String ArrayList, else returns null")
public void findFirstDentistTest(ArrayList<Person> a, String b){
	Assertions.assertEquals(FindFirstDentist.solve(a), b);
}
        
}

