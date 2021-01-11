package string;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters l;
    @BeforeEach
    void setUp() {
        l=new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        Assert.assertEquals(3,l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring1() {
        String s = "bbbbb";
        Assert.assertEquals(1,l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        Assert.assertEquals(3,l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring4() {
        String s = "";
        Assert.assertEquals(0,l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring5() {
        String s = "pwwkems";
        Assert.assertEquals(5,l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring6() {
        String s = "dvdf";
        Assert.assertEquals(3,l.lengthOfLongestSubstring(s));

    }

    @Test
    void lengthOfLongestSubstring7() {
        String s = "abba";
        Assert.assertEquals(2,l.lengthOfLongestSubstring(s));

    }
}