package sort;

import java.util.Random;

public class MergeSortOptimized {

    private static final int THRESHOLD = 7;
    private static final InsertionSort<Integer> ins = new InsertionSort<>();

    public static void main(String[] args) {
        //Integer[] a = { 20, 10, 5, 1, 4, 70, 87, 5, 6, 1, 78, 5, 3, 67 };
        int size = 100;
        Integer[] a = new Integer[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            a[i] = r.nextInt(500);
        }
        int length = a.length;
        Integer[] aux = new Integer[length];

        mergeSort(a, aux, 0, length - 1);

        for (int k = 0; k < length; k++)
            System.out.print(" " + a[k]);
    }

    private static void mergeSort(Integer[] a, Integer[] aux, int lo, int hi) {
		/*
		1. check if low >= hi -> return
		2. find mid
		3. call recursively for lo - mid
		4. call recursively mid+1 - hi
		5. merge
		*/

        if (lo + THRESHOLD >= hi) {
            ins.insertSort(a);
            return;
        }

        int mid = lo + (hi - lo) / 2;

        mergeSort(a, aux, lo, mid);
        mergeSort(a, aux, mid + 1, hi);
        if (a[mid] < a[mid + 1])
            return;
        merge(a, aux, lo, mid, hi);
    }

    private static void merge(Integer[] a, Integer[] aux, int lo, int mid, int hi) {
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
