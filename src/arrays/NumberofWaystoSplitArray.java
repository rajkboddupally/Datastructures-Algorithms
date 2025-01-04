package arrays;

/*
https://leetcode.com/problems/number-of-ways-to-split-array/
Raj Kumar Boddupally created on 03/01/2025 inside the package - arrays
 */
public class NumberofWaystoSplitArray {

    /* Approach
    1. iterate nums from 0 to n-1
    2. for each iteration -  compute left and right sums.
    3. If left >= right then increment counter.
    4. Return counter

    [10,4,-8,7]
    13

    10 3
    14 -1
    6 -1-(-8) 7


    [2,3,1,0]
    6

    2 4
    5 1
    6 0



     */
    public int waysToSplitArray(int[] nums) {
        int ways = 0;
        long leftSum = 0;
        long rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if(leftSum >= rightSum)
                ways++;
        }
        return ways;
    }
}
