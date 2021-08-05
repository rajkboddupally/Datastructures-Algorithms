package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters l;

    @BeforeEach
    void setUp() {
        l = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        Assertions.assertEquals(3, l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring1() {
        String s = "bbbbb";
        Assertions.assertEquals(1, l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        Assertions.assertEquals(3, l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "";
        Assertions.assertEquals(0, l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring5() {
        String s = "pwwkems";
        Assertions.assertEquals(5, l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring6() {
        String s = "dvdf";
        Assertions.assertEquals(3, l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring7() {
        String s = "abba";
        Assertions.assertEquals(2, l.lengthOfLongestSubstring(s));

    }
}
