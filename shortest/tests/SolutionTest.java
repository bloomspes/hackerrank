import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static Solution s;
    private static final String[] testcase =
            {
                    "aabbaccc",
                    "ababcdcdababcdcd",
                    "abcabcdede",
                    "abcabcabcabcdededededede",
                    "xababcdcdababcdcd"
            };

    private static final int[] result = {7, 9, 8, 14, 17};

    @BeforeEach
    void setUp() {
        s = new Solution();
    }

    @Test
    void solution() {
        assertEquals(s.solution(testcase[0]), result[0]);
    }
}