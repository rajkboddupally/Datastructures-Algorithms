package arrays;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - arrays */

import java.util.Arrays;

/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.

A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].



Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1


Constraints:

1 <= nums.length <= 2500
-104 <= nums[i] <= 104


Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS_v1(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        //Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?

        int max = 0;
        for (int j : dp) {
            max = Math.max(j, max);
        }
        return max;
    }



/*
    Input: nums = [10,9,2,5,3,7,101,18]
    Output: 4
    Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
    */

    // {0, 1, 0, 3, 2, 3};
    public int lengthOfLIS(int[] nums) {
        /*
        int maxLength = 0;
        for(int i = 0;i<nums.length;i++){
            int startingNum = nums[i];
            int temp = 0;
            int previousNume = nums[i];
            for(int j=i+1; j<nums.length-1;j++){
                if(nums[j] > startingNum){
                    if(nums[j] > previousNume){
                        temp++;
                        previousNume = nums[j];
                    }
                    if(nums[j] < previousNume){
                        previousNume = nums[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, temp);
        }
        return maxLength;
        */

        int[] dp = new int[nums.length];

        dp[0] = 1;
        int result = 1;

        for (int i = 1; i < nums.length; i++) {
            int max = 0;

            for (int j = 0; j < i; j++)
                if(nums[j] < nums[i])
                    max = Math.max(dp[j],max);

            dp[i] = max + 1;
            result = Math.max(dp[i], result);
        }

        return result;
    }
}
