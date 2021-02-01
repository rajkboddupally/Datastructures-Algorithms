package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    RomanToInteger r = new RomanToInteger();
    @Test
    void romanToInt() {
        String roman = "XXX";
        Assertions.assertEquals(30, r.romanToInt(roman));
    }
}