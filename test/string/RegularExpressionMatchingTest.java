package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegularExpressionMatchingTest {
    RegularExpressionMatching r;

    @BeforeEach
    void setUp() {
        r = new RegularExpressionMatching();
    }

    @Test
    void isMatch() {
        String s = "aa";
        String p = "a";
        Assertions.assertFalse(r.isMatch(s, p));
    }

    @Test
    void isMatch1() {
        String s = "aa";
        String p = "a*";
        Assertions.assertTrue(r.isMatch(s, p));
    }

    @Test
    void isMatch2() {
        String s = "aab";
        String p = "c*a*b";
        Assertions.assertTrue(r.isMatch(s, p));
    }

    @Test
    void isMatch3() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        Assertions.assertFalse(r.isMatch(s, p));
    }

    @Test
    void isMatch4() {
        String s = "mississippi";
        String p = "mis*is*ip*.";
        Assertions.assertTrue(r.isMatch(s, p));
    }

    @Test
    void isMatch5() {
        String s = "ab";
        String p = ".*c";
        Assertions.assertFalse(r.isMatch(s, p));
    }

    @Test
    void isMatch6() {
        String s = "aaa";
        String p = "a*a";
        Assertions.assertTrue(r.isMatch(s, p));
    }

    @Test
    void isMatch7() {
        String s = "aaa";
        String p = "ab*a*c*a";
        Assertions.assertFalse(r.isMatch(s, p));
    }
}
