package arrays;

/*
Raj Kumar Boddupally created on 12/15/2024 inside the package - arrays

https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/
You are given an integer array nums, an integer k, and an integer multiplier.

You need to perform k operations on nums. In each operation:

Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
Replace the selected minimum value x with x * multiplier.
Return an integer array denoting the final state of nums after performing all k operations.



Example 1:

Input: nums = [2,1,3,5,6], k = 5, multiplier = 2

Output: [8,4,6,5,6]

Explanation:

Operation	Result
After operation 1	[2, 2, 3, 5, 6]
After operation 2	[4, 2, 3, 5, 6]
After operation 3	[4, 4, 3, 5, 6]
After operation 4	[4, 4, 6, 5, 6]
After operation 5	[8, 4, 6, 5, 6]
Example 2:

Input: nums = [1,2], k = 3, multiplier = 4

Output: [16,8]

Explanation:

Operation	Result
After operation 1	[4, 2]
After operation 2	[4, 8]
After operation 3	[16, 8]


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
1 <= k <= 10
1 <= multiplier <= 5
 */
public class FinalArrayStateAfterKMultiplicationOperationsI {
    /*
    Approach
    1. Iterate k until > 0
    2. Iterate through array from 0... n-1
        Find the min in array, store index as well.
    3. replace min value with multiplier*min at the index.
     */
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0){
            int min = nums[0];
            int minIndex = 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i] < min){
                    min = nums[i];
                    minIndex = i;
                }
            }
            nums[minIndex] = nums[minIndex]*multiplier;
        }
        return nums;
    }
}
