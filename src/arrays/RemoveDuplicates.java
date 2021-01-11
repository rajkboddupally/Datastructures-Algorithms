package arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int x = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[x - 1]) {
                nums[x++] = nums[i];
            }
        }
        return x;

    }

    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates c = new RemoveDuplicates();
        int count = c.removeDuplicates(a);
        System.out.print("count " + count);
    }
}
