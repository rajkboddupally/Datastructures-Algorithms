package arrays;

import java.util.Map;
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.



Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104

 */
public class ContainerWithMostWater {
    public int maxArea_V1(int[] height) {
        int maxWater = Integer.MIN_VALUE;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {
                int water = Math.min(height[i], height[j]) * Math.abs(j - i);
                maxWater = Math.max(maxWater, water);

            }
        }
        return maxWater;
    }

    public int maxArea_v2(int[] height) {
        int maxWater = Integer.MIN_VALUE;

        int startIndex = 0;
        int endIndex = height.length - 1;

        while (startIndex <= endIndex) {
            int water = Math.min(height[startIndex], height[endIndex]) * (endIndex - startIndex);
            maxWater = Math.max(maxWater, water);

            if (height[startIndex] < height[endIndex]) {
                startIndex++;
            } else {
                endIndex--;
            }
        }

        return maxWater;
    }

    //height = [1,8,6,2,5,4,8,3,7]
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int minHeight = Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, (minHeight * (j-i)));
            }
        }
        return maxArea;
    }





















}
