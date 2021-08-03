package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* Raj Kumar Boddupally created on 8/3/2021 inside the package - hashtable */
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1


Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        // System.out.println(m.majorityElement(new int[]{1, 2, 1, 1, 2, 2, 2}));
        //System.out.println(m.major(new int[]{1, 3, 2, 3, 3, 2, 3}));
        //System.out.println(m.majorV1(new int[]{1, 3, 2, 3, 3, 2, 3}));
        System.out.println(m.majorV2(new int[]{1, 3, 2, 3, 3, 2, 3}));
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, (k, v) -> k + 1);
        }
        int majorityElement = nums[0];
        int majorityCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityElement = entry.getKey();
                majorityCount = entry.getValue();
            }
        }
        return majorityElement;
    }

    //Boyer Moore Voting algorithm
    public int major(int[] num) {
        int major = num[0], count = 1;
        for (int i = 1; i < num.length; i++) {
            if (count == 0) {
                count++;
                major = num[i];
            } else if (major == num[i]) {
                count++;
            } else count--;
        }
        return major;
    }

    public int majorV1(int[] num) {
        Arrays.sort(num);
        return num[num.length / 2];

    }

    //Randomization.
    private int majorV2(int[] num) {
        Random rand = new Random();

        int majorityCount = num.length / 2;

        while (true) {
            int candidate = num[rand.nextInt(num.length)];
            if (getCount(num, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

    private int getCount(int[] num, int candidate) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == candidate)
                count++;
        }
        return count;
    }
}
