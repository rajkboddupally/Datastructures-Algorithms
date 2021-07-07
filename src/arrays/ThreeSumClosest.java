package arrays;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
