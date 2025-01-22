package arrays;

public class JumpGameII {
    public int jump(int[] nums) {
        int minJumps = 0;
        int maxIndex = nums.length - 1;
        int currJump = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > currJump - 1) {
                minJumps++;
            }
            currJump = Math.max(currJump - 1, nums[i]);
            if (maxIndex - (i + currJump) <= 0)
                return minJumps;
        }
        return minJumps;
    }
}