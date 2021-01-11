package arrays;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {
    MergeSortedArray m3 = new MergeSortedArray();

    @BeforeEach
    void setUp() {

    }

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] output = {1, 2, 2, 3, 5, 6};

        Assert.assertArrayEquals(output, m3.merge(nums1, m, nums2, n));
    }

    @Test
    void merge1() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] output = {1};

        Assert.assertArrayEquals(output, m3.merge(nums1, m, nums2, n));
    }
}