package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsReduceXtoZeroTest {
    MinimumOperationsReduceXtoZero minimumOperationsReduceXtoZero;

    @BeforeEach
    void setUp() {

        minimumOperationsReduceXtoZero = new MinimumOperationsReduceXtoZero();
    }

    @Test
    void minOperations() {
        int[] nums = {1, 1, 4, 2, 3};
        int x = 5;
        Assertions.assertEquals(2, minimumOperationsReduceXtoZero.minOperations(nums, x));
    }

    @Test
    void minOperations1() {
        int[] nums = {5, 6, 7, 8, 9};
        int x = 4;
        Assertions.assertEquals(-1, minimumOperationsReduceXtoZero.minOperations(nums, x));
    }

    @Test
    void minOperations2() {
        int[] nums = {3, 2, 20, 1, 1, 3};
        int x = 10;
        Assertions.assertEquals(5, minimumOperationsReduceXtoZero.minOperations(nums, x));
    }
}