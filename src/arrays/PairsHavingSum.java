package arrays;

import java.util.Arrays;

public class PairsHavingSum {

    private static final int[] arr = {20, -20, 10, 0, -10, 30, 40, -30, 5};
    private static final int sum = 10;

    public static void main(String[] args) {

        int length = arr.length;

        Arrays.sort(arr);

        int i = 0;
        int j = length - 1;

        while (i < j) {
            if (arr[i] + arr[j] == sum) {
                System.out.println(arr[i] + " , " + arr[j]);
                i++;
                j--;
            } else if (arr[i] + arr[j] < sum)
                i++;
            else
                j--;
        }

    }

}
