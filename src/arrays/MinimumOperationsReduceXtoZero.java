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
        int startIndex = 0;
        int endingIndex = nums.length - 1;

        while (startIndex <= endingIndex) {
            int temp1 = 0;
            int temp2 = 0;
            if (nums[startIndex] <= diff) {
                temp1 = nums[startIndex];
            }
            if (nums[endingIndex] <= diff) {
                temp2 = nums[endingIndex];
            }
            //case when elements from left and right are > diff needed
            if(temp2 == temp1 && temp1 == 0)
                return -1;

            sum += Math.max(temp1, temp2);
            diff = x - sum;
            minOperations++;

            if (temp1 > temp2)
                startIndex++;
            else
                endingIndex--;

            if (diff == 0)
                break;

        }
        if (sum != x)
            return -1;

        return minOperations;
    }

}
