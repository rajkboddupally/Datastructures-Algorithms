package arrays;

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

    public int maxArea(int[] height) {
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
}
