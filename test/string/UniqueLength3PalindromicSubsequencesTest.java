package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueLength3PalindromicSubsequencesTest {
    UniqueLength3PalindromicSubsequences u = new UniqueLength3PalindromicSubsequences();
    @Test
    void countPalindromicSubsequence() {
        assertEquals(3, u.countPalindromicSubsequence("aabca"));
    }

    @Test
    void countPalindromicSubsequence1() {
        assertEquals(0, u.countPalindromicSubsequence("adc"));
    }

    @Test
    void countPalindromicSubsequence2() {
        assertEquals(4, u.countPalindromicSubsequence("bbcbaba"));
    }
}