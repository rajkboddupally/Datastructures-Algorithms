package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring l;
    @BeforeEach
    void setUp() {
        l=new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindrome() {
        String str = "babad";
        Assertions.assertEquals("bab", l.longestPalindrome(str));
    }

    @Test
    void longestPalindrome1() {
        String str = "cbbd";
        Assertions.assertEquals("bb", l.longestPalindrome(str));
    }

    @Test
    void longestPalindrome2() {
        String str = "bd";
        Assertions.assertEquals("b", l.longestPalindrome(str));
    }

    @Test
    void longestPalindrome3() {
        String str = "aacabdkacaa";
        Assertions.assertEquals("aca", l.longestPalindrome(str));
    }
}