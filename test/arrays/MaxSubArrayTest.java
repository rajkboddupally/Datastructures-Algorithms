package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxSubArrayTest {
    MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    void maxSubArray() {

        int[] nums = {-2, 1, -3, 4, -1, 6, 3, -5, 4};
        Assertions.assertEquals(6, maxSubArray.maxSubArray(nums));
    }

    @Test
    void maxSubArray1() {

        int[] nums = {1};
        Assertions.assertEquals(1, maxSubArray.maxSubArray(nums));
    }

    @Test
    void maxSubArray2() {

        int[] nums = {0};
        Assertions.assertEquals(0, maxSubArray.maxSubArray(nums));
    }

    @Test
    void maxSubArray3() {

        int[] nums = {-2147483647};
        Assertions.assertEquals(-2147483647, maxSubArray.maxSubArray(nums));
    }

    @Test
    void maxSubArray4() {

        int[] nums = {-2, -4, -1};
        Assertions.assertEquals(-1, maxSubArray.maxSubArray(nums));
    }
}
