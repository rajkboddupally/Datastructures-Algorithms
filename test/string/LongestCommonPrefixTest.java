package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix l = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String[] input = {"flower","flow","flight"};
        String output = "fl";
        Assertions.assertEquals(output, l.longestCommonPrefix(input));
    }
}