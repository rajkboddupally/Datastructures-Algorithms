package string;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTwoStringArraysareEquivalentTest {
    CheckIfTwoStringArraysareEquivalent checkIfTwoStringArraysareEquivalent;
    @BeforeEach
    void setUp() {
        checkIfTwoStringArraysareEquivalent= new CheckIfTwoStringArraysareEquivalent();
    }

    @Test
    void arrayStringsAreEqual() {
        String[] s1 = {"ab", "c"};
        String[] s2 = {"a", "bc"};
        Assert.assertEquals(true,checkIfTwoStringArraysareEquivalent.arrayStringsAreEqual(s1,s2));
    }
}