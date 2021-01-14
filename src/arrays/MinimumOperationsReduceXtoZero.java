package arrays;

import java.util.Arrays;

public class MinimumOperationsReduceXtoZero {

    public int minOperations_V1(int[] nums, int x) {
        int minOperations = 0;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > x)
                continue;
            if (sum + nums[i] <= x) {
                sum += nums[i];
                minOperations++;
            }
        }
        if (sum != x)
            return -1;
        return minOperations;
    }

    public int minOperations(int[] nums, int x) {
        int minOperations = 0;
        int sum = 0;
        int diff = x;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < diff){

            }

        }
        return minOperations;
    }

}
