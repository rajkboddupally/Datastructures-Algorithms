package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxOperationsTest {

    MaxOperations m;

    @BeforeEach
    void setUp() {
        m = new MaxOperations();
    }

    @Test
    void maxOperations() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        Assertions.assertEquals(2, m.maxOperations_NotOptimized(nums, k));
    }

    @Test
    void maxOperations1() {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        Assertions.assertEquals(1, m.maxOperations_NotOptimized(nums, k));
    }
}
