package gurpreet.junit.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class MatchDNAPairsTest {

 private static Stream<Arguments> listOfValues() {
        return Stream.of(
	 Arguments.of("", new ArrayList<>()),
	 Arguments.of("G", new ArrayList<>(List.of("GC"))),
	 Arguments.of("C", new ArrayList<>(List.of("CG"))),
	 Arguments.of("T", new ArrayList<>(List.of("TA"))),
	 Arguments.of("A", new ArrayList<>(List.of("AT"))),
	 Arguments.of("g", new ArrayList<>(List.of("GC"))),
	 Arguments.of("c", new ArrayList<>(List.of("CG"))),
	 Arguments.of("t", new ArrayList<>(List.of("TA"))),
	 Arguments.of("a", new ArrayList<>(List.of("AT"))),
	 Arguments.of("GAT", new ArrayList<>(List.of("GC", "AT", "TA"))),
	 Arguments.of("GYTC", new ArrayList<>(List.of("GC", "TA", "CG"))),
	 Arguments.of("gat", new ArrayList<>(List.of("GC", "AT", "TA"))),
	 Arguments.of("gxat", new ArrayList<>(List.of("GC", "AT", "TA")))
	        );
    }
@ParameterizedTest
@MethodSource("listOfValues")
@DisplayName("Returns a List containing correctly matched DNA pairs")
public void matchDNAPairsTest(String input, ArrayList<String> expectedOutput){
	Assertions.assertEquals(MatchDNAPairs.solve(input), expectedOutput);
}
        
}

