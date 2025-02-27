package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {
MinimumWindowSubstring m = new MinimumWindowSubstring();
    @Test
    void minWindow() {
        String s="ADOBECODEBANC", t="ABC";
        assertEquals("BANC", m.minWindow(s,t));
    }


    @Test
    void minWindow1() {
        String s="cabwefgewcwaefgcf", t="cae";
        assertEquals("cwae", m.minWindow(s,t));
    }
}