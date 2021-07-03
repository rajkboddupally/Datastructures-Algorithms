package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/* Raj Kumar Boddupally created on 7/3/2021 inside the package - arrays */

class SearchInsertPositionTest {
    static SearchInsertPosition s;

    @BeforeAll
    static void setup() {
        s = new SearchInsertPosition();
    }

    @Test
    void searchInsert() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        Assertions.assertEquals(2, s.searchInsert(nums, target));
    }

    @Test
    void searchInsert2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        Assertions.assertEquals(1, s.searchInsert(nums, target));
    }

    @Test
    void searchInsert3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        Assertions.assertEquals(4, s.searchInsert(nums, target));
    }

    @Test
    void searchInsert4() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        Assertions.assertEquals(0, s.searchInsert(nums, target));
    }

    @Test
    void searchInsert5() {
        int[] nums = {1};
        int target = 0;
        Assertions.assertEquals(0, s.searchInsert(nums, target));
    }
}
