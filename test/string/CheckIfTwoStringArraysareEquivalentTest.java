package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckIfTwoStringArraysareEquivalentTest {
    CheckIfTwoStringArraysareEquivalent checkIfTwoStringArraysareEquivalent;

    @BeforeEach
    void setUp() {
        checkIfTwoStringArraysareEquivalent = new CheckIfTwoStringArraysareEquivalent();
    }

    @Test
    void arrayStringsAreEqual() {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};
        Assertions.assertTrue(checkIfTwoStringArraysareEquivalent.arrayStringsAreEqual(s1, s2));
    }
}
