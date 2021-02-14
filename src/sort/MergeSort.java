package sort;

import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        int size = 10;
        int[] input = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            input[i] = r.nextInt(10000);
        }
        int[] aux = new int[input.length];
        long startTime = System.nanoTime();
        mergeSort(input, aux, 0, input.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Running time in milli sec " + (endTime - startTime) / 1000000);

        for (int k = 0; k < size; k++)
            System.out.print(" " + input[k]);
    }

    private static void mergeSort(int[] input, int[] aux, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSort(input, aux, low, mid);
        mergeSort(input, aux, mid + 1, high);
        merge(input, aux, low, mid, high);

    }

    private static void merge(int[] a, int[] aux, int lo, int mid, int hi) {

        for (int k = 0; k <= hi; k++)
            aux[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (aux[i] > aux[j])
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
}
