package arrays;/* Raj Kumar Boddupally created on 7/3/2021 inside the package - arrays */

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition s = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(s.searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (r >= l) {
            int m = l + (r - l) / 2;

            if (nums[m] == target)
                return m;
            else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
}
