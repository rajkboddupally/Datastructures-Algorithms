package arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*

https://leetcode.com/problems/3sum-closest/description/

Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104

 */

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Set<Integer> elements = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    elements.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int minDiff = Integer.MAX_VALUE;
        Map<Integer, Integer> sortedKeyMap = new TreeMap<>();
        for (int key : elements) {
            minDiff = Math.abs(key - target);
            sortedKeyMap.put(minDiff, key);
        }

        Map.Entry<Integer, Integer> entry = sortedKeyMap.entrySet().iterator().next();
        return entry.getValue();
    }
}
