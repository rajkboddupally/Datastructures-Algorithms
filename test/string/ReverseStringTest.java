package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {
    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void reverseString() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        Assertions.assertEquals("olleh", reverseString.reverseString(input));
    }

    @Test
    void reverseString1() {
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};
        Assertions.assertEquals("hannaH", reverseString.reverseString(input));
    }
}
