package arrays;

public class TrappingRainWater {
    public int trap(int[] height) {
        int LM = 0, RM = 0, left = 0, right = height.length - 1, water = 0;
        while (left <= right) {
            LM = Math.max(LM, height[left]);
            RM = Math.max(RM, height[right]);

            if (LM < RM) {
                water += (LM - height[left]);
                left++;
            } else {
                water += (RM - height[right]);
                right--;
            }
        }
        return water;
    }
}
