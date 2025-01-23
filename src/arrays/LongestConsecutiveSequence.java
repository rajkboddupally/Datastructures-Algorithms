package arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        Queue<Integer> q = new PriorityQueue<>();
        for (int num : nums) {
            q.offer(num);
        }

        int longestSeq = 1;
        int counter = 1;
        int prev = q.poll();

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (curr == prev) {
                continue;
            } else if (curr == prev + 1) {
                counter++;
                longestSeq = Math.max(longestSeq, counter);
            } else {
                counter = 1;
            }
            prev = curr;
        }
        return longestSeq;
    }
}
