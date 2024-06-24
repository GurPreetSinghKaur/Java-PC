package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class IsValidMobileNumberTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of("", false),
	 Arguments.of("07726", false),
	 Arguments.of("07123456789", true),
	 Arguments.of("+447123456789", true),
	 Arguments.of("00447123456789", true)
	       );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns 'true' if the number is a valid UK number and `false` if not")
public void isValidMobileNumberTest(String input, boolean expectedOutput){
	Assertions.assertEquals(IsValidMobileNumber.solve(input), expectedOutput);
}
        
}

