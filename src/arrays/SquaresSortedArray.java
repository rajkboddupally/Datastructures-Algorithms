package arrays;

import java.util.Arrays;
import java.util.TreeMap;

public class SquaresSortedArray {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};

        SquaresSortedArray r = new SquaresSortedArray();
       // System.out.println(r.sortedSquares(arr));


    }

    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            output[i] = nums[i]*nums[i];
        }
        Arrays.sort(output);
        return output;
    }
}
