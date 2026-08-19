import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeCalculatorPathCoverageTest {

    @Test
    void shouldCoverZeroLoopIterations() {
        int[] scores = {};

        assertEquals("Fail", GradeCalculator.calculateResult(scores));
    }

    @Test
    void shouldCoverOneLoopIterationAndPassBranch() {
        int[] scores = {15};

        assertEquals("Pass", GradeCalculator.calculateResult(scores));
    }

    @Test
    void shouldCoverMultipleLoopIterationsAndFailBranch() {
        int[] scores = {4, 5, 2};

        assertEquals("Fail", GradeCalculator.calculateResult(scores));
    }

    @Test
    void shouldCoverMultipleLoopIterationsAndPassBranch() {
        int[] scores = {7, 8, 6};

        assertEquals("Pass", GradeCalculator.calculateResult(scores));
    }
}
