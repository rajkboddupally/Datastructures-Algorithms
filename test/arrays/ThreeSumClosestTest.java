package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/7/2021 inside the package - arrays */

class ThreeSumClosestTest {
    ThreeSumClosest threeSumClosest;

    @BeforeEach
    void setUp() {
        threeSumClosest = new ThreeSumClosest();
    }

    @Test
    void threeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        Assertions.assertEquals(2, threeSumClosest.threeSumClosest(nums, target));
    }

    @Test
    void threeSumClosest1() {
        int[] nums = {1, 1, -1, -1, 3};
        int target = -1;
        Assertions.assertEquals(-1, threeSumClosest.threeSumClosest(nums, target));
    }

    @Test
    void threeSumClosest2() {
        int[] nums = {0, 2, 1, -3};
        int target = 1;
        Assertions.assertEquals(0, threeSumClosest.threeSumClosest(nums, target));
    }
}
