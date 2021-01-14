package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {
    ImplementStrStr implementStrStr;

    @BeforeEach
    void setUp() {
        implementStrStr = new ImplementStrStr();
    }

    @Test
    void strStr() {
        String haystack = "hello", needle = "ll";
        Assertions.assertEquals(2, implementStrStr.strStr(haystack, needle));

    }

    @Test
    void strStr1() {
        String haystack = "aaaaa", needle = "bba";
        Assertions.assertEquals(-1, implementStrStr.strStr(haystack, needle));

    }

    @Test
    void strStr2() {
        String haystack = "", needle = "";
        Assertions.assertEquals(0, implementStrStr.strStr(haystack, needle));

    }

    @Test
    void strStr3() {
        String haystack = "mississippi", needle = "issip";
        Assertions.assertEquals(4, implementStrStr.strStr(haystack, needle));

    }
}