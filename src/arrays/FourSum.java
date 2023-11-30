package arrays;

/* Raj Kumar Boddupally created on 7/10/2021 inside the package - arrays */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.



Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]


Constraints:

1 <= nums.length <= 200
-109 <= nums[i] <= 109
-109 <= target <= 109
 */
public class FourSum {
    public List<List<Integer>> fourSum_BinarySearch(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                for (int k = j + 1; k < nums.length - 1; k++) {
                    if (k != j + 1 && nums[k] == nums[k - 1]) continue;
                    int index = Arrays.binarySearch(nums, k + 1, nums.length, (target - (nums[i] + nums[j] + nums[k])));
                    if (index > -1) {
                        output.add(Arrays.asList(nums[i], nums[j], nums[k], nums[index]));
                    }
                }
            }
        }
        return output;
    }

    public List<List<Integer>> fourSum_v2(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                for (int k = j + 1; k < nums.length - 1; k++) {
                    if (k != j + 1 && nums[k] == nums[k - 1]) continue;
                    int startIndex = k + 1, endIndex = nums.length - 1;
                    while (startIndex <= endIndex) {
                        if (startIndex != k + 1 && nums[startIndex] == nums[startIndex - 1]) {
                            startIndex++;
                            continue;
                        }
                        int sum = nums[i] + nums[j] + nums[k] + nums[startIndex];
                        if (target < sum)
                            break;
                        else if (target > sum)
                            startIndex++;
                        else {
                            output.add(Arrays.asList(nums[i], nums[j], nums[k], nums[startIndex]));
                            startIndex++;
                        }
                    }
                }
            }
        }
        return output;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length < 4) {
            return output;
        }
        if(nums.length == 4) {
            if(nums[0] + nums[1] + nums[2] + nums[3] == target){
                list.add(nums[0]);
                list.add(nums[1]);
                list.add(nums[2]);
                list.add(nums[3]);
                output.add(list);
            }
            return output;
        }
        Arrays.sort(nums);
        int start =0, end = nums.length-1;
        int index = 2;

        while(start < end){
            while(index < end){
                if(nums[start] + nums[end] +nums[index] +nums[index -1] == target){
                    list.add(nums[start]);
                    list.add(nums[end]);
                    list.add(nums[index]);
                    list.add(nums[index-1]);
                    output.add(list);
                    list.clear();
                }
                index ++;
            }
            start++;
            end--;
            index = start + 2;
        }

        return output;
    }
}
