package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, -7, 9, 2};
        insertionSort(arr);

        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + " ");

    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
            }
        }
  }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
