package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianofTwoSortedArraysTest {
    MedianofTwoSortedArrays medianofTwoSortedArrays;

    @BeforeEach
    void setUp() {
        medianofTwoSortedArrays = new MedianofTwoSortedArrays();
    }

    @Test
    void findMedianSortedArrays() {
        int[] a1 = {1, 3};
        int[] a2 = {2};

        assertEquals(2, medianofTwoSortedArrays.findMedianSortedArrays(a1, a2));

    }


    @Test
    void findMedianSortedArrays1() {
        int[] a1 = {1, 2};
        int[] a2 = {3, 4};

        assertEquals(2.5, medianofTwoSortedArrays.findMedianSortedArrays(a1, a2));

    }

    @Test
    void findMedianSortedArrays2() {
        int[] a1 = {0,0};
        int[] a2 = {0,0};

        assertEquals(0.0, medianofTwoSortedArrays.findMedianSortedArrays(a1, a2));

    }

    @Test
    void findMedianSortedArrays3() {
        int[] a1 = {1};
        int[] a2 = {};

        assertEquals(1.0, medianofTwoSortedArrays.findMedianSortedArrays(a1, a2));

    }

    @Test
    void findMedianSortedArrays4() {
        int[] a1 = {};
        int[] a2 = {2};

        assertEquals(2.0, medianofTwoSortedArrays.findMedianSortedArrays(a1, a2));

    }
}