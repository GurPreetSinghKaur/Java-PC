package gurpreet.junit;

import static org.junit.Assert.assertTrue;

import gurpreet.junit.exercises.FlipBooleans;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Main
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void FlipBooleans( ){
    FlipBooleans.tryInput(new boolean[]{ true, false, false, true}, new boolean[]{ false, true, true, false});

    }
}
