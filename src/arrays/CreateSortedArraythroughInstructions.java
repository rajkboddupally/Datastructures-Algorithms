package arrays;

public class CreateSortedArraythroughInstructions {
    public int createSortedArray(int[] instructions) {
        int totalCost = 0;
        int[] nums = new int[instructions.length];

        for (int i = 0; i < instructions.length; i++) {
            totalCost += min(nums, instructions[i], i);
        }
        return totalCost;
    }

    private int min(int[] nums, int instruction, int currentIndex) {
        int less = 0, greater = 0;
        nums[currentIndex] = instruction;
        for (int i = currentIndex; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
                greater++;
            } else if (instruction > nums[i - 1]) {
                less = i;
                break;
            }
        }
        return Math.min(less, greater);
    }
}
