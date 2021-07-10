package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - arrays */

class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence lIS = new LongestIncreasingSubsequence();

    @Test
    void lengthOfLIS() {
        int[] num = {10, 9, 2, 5, 3, 7, 101, 18};
        Assertions.assertEquals(4, lIS.lengthOfLIS(num));
    }

    @Test
    void lengthOfLIS1() {
        int[] num = {0, 1, 0, 3, 2, 3};
        Assertions.assertEquals(4, lIS.lengthOfLIS(num));
    }

    @Test
    void lengthOfLIS2() {
        int[] num = {7, 7, 7, 7, 7, 7, 7};
        Assertions.assertEquals(1, lIS.lengthOfLIS(num));
    }


    @Test
    void lengthOfLIS3() {
        int[] num = {4, 10, 4, 3, 8, 9};
        Assertions.assertEquals(3, lIS.lengthOfLIS(num));
    }
}
