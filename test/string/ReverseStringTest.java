package string;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString reverseString;
    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void reverseString() {
        char[] input = {'h','e','l','l','o'};
        Assert.assertEquals("olleh",reverseString.reverseString(input).toString());
    }

    @Test
    void reverseString1() {
        char[] input = {'H','a','n','n','a','h'};
        Assert.assertEquals("hannaH",reverseString.reverseString(input).toString());
    }
}