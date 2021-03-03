package arrays;/* Raj Kumar Boddupally created on 3/3/2021 inside the package - arrays */

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int output = removeElement(arr, val);
    }

    public static int removeElement(int[] nums, int val) {
        int swapIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[swapIndex++] = nums[i];
            }

        }
        return swapIndex;
    }
}
