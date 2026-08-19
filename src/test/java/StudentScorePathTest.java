import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentScorePathTest {

    @Test
    void shouldCoverEmptyLoopAndFailPath() {
        assertEquals("Fail", StudentScore.evaluate(new int[]{}));
    }

    @Test
    void shouldCoverOneLoopIterationAndPassPath() {
        assertEquals("Pass", StudentScore.evaluate(new int[]{15}));
    }

    @Test
    void shouldCoverMultipleLoopIterationsAndFailPath() {
        assertEquals("Fail", StudentScore.evaluate(new int[]{4, 5, 2}));
    }

    @Test
    void shouldCoverMultipleLoopIterationsAndPassPath() {
        assertEquals("Pass", StudentScore.evaluate(new int[]{7, 8, 6}));
    }
}
