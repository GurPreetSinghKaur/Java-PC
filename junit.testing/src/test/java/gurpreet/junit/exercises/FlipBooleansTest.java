package gurpreet.junit.exercises;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlipBooleansTest {
    private static Stream<Arguments> inputsAndResults() {

        return Stream.of(
                Arguments.of(new boolean[]{ true, false, false, true}, new boolean[]{ false, true, true, false}),
                Arguments.of(new boolean[]{ false, false, false, false, false}, new boolean[]{ true, true, true, true, true}),
                Arguments.of(new boolean[]{ true, false, true, false}, new boolean[]{ false, true, false, true})

        );
    }
    @ParameterizedTest
    @MethodSource("inputsAndResults")
    public void FlipBooleans (boolean[] a, boolean[] b) {
        assertArrayEquals(FlipBooleans.solve(a), b);
    }
}
