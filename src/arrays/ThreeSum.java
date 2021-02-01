package arrays;

import java.util.*;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int startIndex = i + 1;
            int endIndex = nums.length - 1;
            while (startIndex < endIndex) {
                List<Integer> subLists = new ArrayList<>();
                int tempSum = nums[startIndex] + nums[endIndex] + nums[i];
                if (tempSum == 0) {
                    subLists.add(nums[i]);
                    subLists.add(nums[startIndex]);
                    subLists.add(nums[endIndex]);
                    list.add(subLists);

                    startIndex++;
                    endIndex--;
                } else if (tempSum > 0) {
                    endIndex--;
                } else {
                    startIndex++;
                }

            }
        }
        return new ArrayList<>(list);
    }
}
