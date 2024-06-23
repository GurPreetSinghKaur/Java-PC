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
                Arguments.of(),

        );
    }
@ParameterizedTest
@ValueSource(strings = ("",""))
public void findFirstDentistTest(){}

}

