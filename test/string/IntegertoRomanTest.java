package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegertoRomanTest {
    IntegertoRoman i = new IntegertoRoman();

    @Test
    void intToRoman() {
        int num = 30;
        Assertions.assertEquals("XXX", i.intToRoman(num));
    }

    @Test
    void intToRoman1() {
        int num = 1994;
        Assertions.assertEquals("MCMXCIV", i.intToRoman(num));
    }
}