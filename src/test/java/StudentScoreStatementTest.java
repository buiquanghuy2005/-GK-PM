import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentScoreStatementTest {

    @Test
    void shouldReturnPass() {
        assertEquals("Pass", StudentScore.evaluate(new int[]{7, 8, 6}));
    }

    @Test
    void shouldReturnFail() {
        assertEquals("Fail", StudentScore.evaluate(new int[]{4, 5, 2}));
    }
}
