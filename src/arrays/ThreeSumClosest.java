package arrays;

import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Map<Integer, Integer> mymap = new TreeMap<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int startIndex = i + 1;
            int endIndex = nums.length - 1;

            while (startIndex < endIndex) {
                int temp = nums[startIndex] + nums[endIndex] + nums[i];
                mymap.put(Math.abs(target - temp), temp);
                startIndex++;
            }

        }

        return mymap.get(0) == null ? 0 : mymap.get(0);

    }
}
