package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/9/2021 inside the package - arrays */

class MaximumLengthofRepeatedSubarrayTest {
    MaximumLengthofRepeatedSubarray mlrs = new MaximumLengthofRepeatedSubarray();

    @BeforeEach
    void setUp() {
    }

    @Test
    void findLength() {
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4, 7};
        Assertions.assertEquals(3, mlrs.findLength(nums1, nums2));
    }

    @Test
    void findLength1() {
        int[] nums1 = {0, 0, 0, 0, 0};
        int[] nums2 = {0, 0, 0, 0, 0};
        Assertions.assertEquals(5, mlrs.findLength(nums1, nums2));
    }

    @Test
    void findLength2() {
        int[] nums1 = {0, 0, 0, 0, 1};
        int[] nums2 = {1, 0, 0, 0, 0};
        Assertions.assertEquals(4, mlrs.findLength(nums1, nums2));
    }

    @Test
    void findLength3() {
        int[] nums1 = {1, 2, 3, 2, 1};
        int[] nums2 = {3, 2, 1, 4};
        Assertions.assertEquals(3, mlrs.findLength(nums1, nums2));
    }
}
