package arrays;

/* Raj Kumar Boddupally created on 8/17/2021 inside the package - arrays */

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {2, 6, 1, 34, 22, 67, 35, 75, 16};
        int[] b = {12, 16, 35, 11, 23, 34, 66, 6, 18};
        printCommon(a, b);
    }

    private static void printCommon(int[] a, int[] b) {
        Set<Integer> aSet = new HashSet<>();
        for (int i : a)
            aSet.add(i);

        for (int j : b) {
            if (aSet.contains(j))
                System.out.print(j + " ");
        }
    }
}
