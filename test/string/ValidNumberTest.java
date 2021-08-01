package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/31/2021 inside the package - string */

class ValidNumberTest {
    ValidNumber v = new ValidNumber();

    @BeforeEach
    void createNewInstance() {

    }

    /*

     */
    @Test
    void isNumber() {
        String[] strArr = {".1", "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1",
                "53.5e93", "-123.456e789"};
        for (String input : strArr) {
            System.out.println(input);
            Assertions.assertTrue(v.isNumber(input));
        }
    }

    @Test
    void isNotNumber() {
        String[] strArr = {"092e359-2", "92e1740e91", ".-4", "6+1", "..", "+-", "+.", "4e+", "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53", ".", ".e1"};
        for (String input : strArr) {
            System.out.println(input);
            Assertions.assertFalse(v.isNumber(input));
        }
    }
}
