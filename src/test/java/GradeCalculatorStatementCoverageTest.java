import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeCalculatorStatementCoverageTest {

    @Test
    void shouldReturnPassWhenTotalScoreIsAtLeast15() {
        int[] scores = {7, 8, 6};

        assertEquals("Pass", GradeCalculator.calculateResult(scores));
    }

    @Test
    void shouldReturnFailWhenTotalScoreIsBelow15() {
        int[] scores = {4, 5, 2};

        assertEquals("Fail", GradeCalculator.calculateResult(scores));
    }
}
