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

        for (int i = 0; i < nums.length - 1; i++) {

            int startIndex = i + 1;
            int endIndex = nums.length - 1;

            while (startIndex < endIndex) {
                int sum = nums[i] + nums[startIndex] + nums[endIndex];
                if (sum > 0) {
                    endIndex--;
                } else if (sum < 0) {
                    startIndex++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[startIndex], nums[endIndex]));
                    startIndex++;
                    endIndex--;
                }
            }


        }
        return new ArrayList<>(list);
    }

    //n2logn
    public List<List<Integer>> threeSumBinarySearch(int[] nums) {

        if (nums.length < 3)
            throw new IllegalArgumentException("Array length should be at least 3");

        Set<List<Integer>> list = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int k = Arrays.binarySearch(nums, j + 1, nums.length, -(nums[i] + nums[j]));
                if (k > -1) {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                }
            }
        }
        return new ArrayList<>(list);
    }
}
