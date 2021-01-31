package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringAreCloseTest {
    TwoStringAreClose twoStringAreClose;
    @BeforeEach
    void setUp() {
        twoStringAreClose = new TwoStringAreClose();
    }

    @Test
    void closeStrings() {
        String word1 = "abc";
        String word2="bca";
        Assertions.assertEquals(true, twoStringAreClose.closeStrings(word1,word2));
    }

    @Test
    void closeStrings1() {
        String word1 = "abcd";
        String word2="bcda";
        Assertions.assertEquals(true, twoStringAreClose.closeStrings(word1,word2));
    }

    @Test
    void closeStrings2() {
        String word1 = "cabbba";
        String word2="abbccc";
        Assertions.assertEquals(true, twoStringAreClose.closeStrings(word1,word2));
    }

    @Test
    void closeStrings3() {
        String word1 = "cabbba";
        String word2="aabbss";
        Assertions.assertEquals(false, twoStringAreClose.closeStrings(word1,word2));
    }

    @Test
    void closeStrings4() {
        String word1 = "abbzzca";
        String word2="babzzcz";
        Assertions.assertEquals(false, twoStringAreClose.closeStrings(word1,word2));
    }
}