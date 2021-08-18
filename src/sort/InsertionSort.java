package sort;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] arr = {6, 3, -7, 9, 2};
        insertionSort(arr);

        print(arr);

    }

    private static void insertionSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > key)
                    swap(arr, j, j + 1);
                else
                    break;
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T> void print(T[] a) {
        for (T t : a)
            System.out.print(t + " ");
        System.out.println();
    }
}
