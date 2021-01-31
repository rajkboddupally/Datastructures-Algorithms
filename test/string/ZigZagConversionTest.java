package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {
    ZigZagConversion z;

    @BeforeEach
    void setUp() {
        z = new ZigZagConversion();
    }

    @Test
    void convert() {
        String input = "PAYPALISHIRING";
        String output = "PAHNAPLSIIGYIR";
        int numRows = 3;

        Assertions.assertEquals(output, z.convert(input, numRows));
    }

    @Test
    void convert1() {
        String input = "PAYPALISHIRING";
        String output = "PINALSIGYAHRPI";
        int numRows = 4;

        Assertions.assertEquals(output, z.convert(input, numRows));
    }
}