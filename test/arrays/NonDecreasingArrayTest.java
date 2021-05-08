package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 5/4/2021 inside the package - arrays */

class NonDecreasingArrayTest {
    static NonDecreasingArray n;

    @BeforeAll
    static void setUp() {
        n = new NonDecreasingArray();
    }

    @Test
    void check1() {
        int[] nums = {4, 2, 3};
        Assertions.assertTrue(n.checkPossibility(nums));
    }

    @Test
    void check2() {
        int[] nums = {4, 2, 1};
        Assertions.assertFalse(n.checkPossibility(nums));
    }

    @Test
    void check3() {
        int[] nums = {3, 4, 2, 3};
        Assertions.assertFalse(n.checkPossibility(nums));
    }

    @Test
    void check4() {
        int[] nums = {1, 2, 3};
        Assertions.assertTrue(n.checkPossibility(nums));
    }
}
