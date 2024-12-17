package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalArrayStateAfterKMultiplicationOperationsITest {
    FinalArrayStateAfterKMultiplicationOperationsI f = new FinalArrayStateAfterKMultiplicationOperationsI();
    @Test
    void getFinalState() {
        int[] nums = new int[]{2,1,3,5,6}, output= new int[]{8,4,6,5,6};
        int k = 5, multiplier = 2;
        assertArrayEquals(output,f.getFinalState(nums,k,multiplier));
    }

    @Test
    void getFinalState_V1() {
        int[] nums = new int[]{1,2}, output= new int[]{16,8};
        int k = 3, multiplier = 4;
        assertArrayEquals(output,f.getFinalState(nums,k,multiplier));
    }
}