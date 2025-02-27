package recursion;

import java.util.Arrays;

public class ReverseArray {
    static int[] reverse(int[] arr) {
        reverse(0, arr.length, arr);
        return arr;
    }

    static int[] reverse(int l, int r, int[] arr) {
        if (l >= r) return arr;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return reverse(l + 1, r - 1, arr);
    }

    static int[] reverse(int[] arr, int idx) {
        if (idx >= arr.length / 2)
            return arr;

        int temp = arr[idx];
        arr[idx] = arr[arr.length - idx - 1];
        arr[arr.length - idx - 1] = temp;

        return reverse(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 10, 55, 88};
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
