package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
PermutationInString p = new PermutationInString();
    @Test
    void checkInclusion() {
        String s1="ab", s2="eidbaooo";
        assertEquals(true, p.checkInclusion(s1,s2));
    }
}