package arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
