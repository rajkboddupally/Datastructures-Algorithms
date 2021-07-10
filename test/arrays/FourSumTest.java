package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - arrays */

class FourSumTest {
    FourSum fS = new FourSum();

    @Test
    void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-2, -1, 1, 2));
        output.add(Arrays.asList(-2, 0, 0, 2));
        output.add(Arrays.asList(-1, 0, 0, 1));
        Assertions.assertArrayEquals(output.toArray(), fS.fourSum(nums, target).toArray());
    }

    @Test
    void fourSum1() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(2, 2, 2, 2));
        Assertions.assertArrayEquals(output.toArray(), fS.fourSum(nums, target).toArray());
    }
}
