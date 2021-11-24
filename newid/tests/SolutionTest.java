import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static Solution s;
    private static String[] testcase =
            {
                    "...!@BaT#*..y.abcdefghijklm",
                    "z-+.^.",
                    "=.=",
                    "123_.def",
                    "abcdefghijklmn.p"
            };
    private static String[] result =
            {
                    "bat.y.abcdefghi",
                    "z--",
                    "aaa",
                    "123_.def",
                    "abcdefghijklmn"
            };

    @BeforeEach
    void setUp() {
        s = new Solution();
    }

    @Test
    void solution() {
        assertEquals(s.solution(testcase[0]), result[0]);
        assertEquals(s.solution(testcase[1]), result[1]);
        assertEquals(s.solution(testcase[2]), result[2]);
        assertEquals(s.solution(testcase[3]), result[3]);
        assertEquals(s.solution(testcase[4]), result[4]);
    }
}