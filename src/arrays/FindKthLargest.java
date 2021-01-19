package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5

 1 2 3 4 5 6
 6-2 = 4

Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class FindKthLargest {

    public int findKthLargest_V1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }


    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> elements = new PriorityQueue<>(nums.length, (o1, o2) -> o2 - o1);

        for (int i = 0; i < nums.length; i++) {
            elements.add(nums[i]);
        }

        while(k > 1){
            elements.poll();
            k--;
        }
        return elements.poll();
    }
}
