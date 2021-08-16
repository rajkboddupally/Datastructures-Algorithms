package sort;

/* Raj Kumar Boddupally created on 8/16/2021 inside the package - sort */
/*
1. select pivot -> input[left+right]/2;
2. pivot index or index -> partition
3. call qs on left, index-1
4. call qs on index, right

partition(input left right pivot)
loop left <= right
    loop(input[left] < pivot)
       left++;
    loop(input[right] > pivot)
       right--;
    if(left < right)
       swap(input, left, right);
end main loop
return left

3 7 8 5 2 1 9 5 4

 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] a = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        print(a);
        quickSort(a, 0, a.length - 1);
        print(a);
    }

    private static <T> void print(T[] a) {
        for (T t : a)
            System.out.print(t + " ");
        System.out.println();
    }

    private static void quickSort(Integer[] a, int left, int right) {
        if (left >= right)
            return;
        int pivot = a[(left + right) / 2];
        int index = partition(a, left, right, pivot);
        quickSort(a, left, index - 1);
        quickSort(a, index, right);
    }

    private static int partition(Integer[] a, int left, int right, int pivot) {
        while (left <= right) {
            while (a[left] < pivot)
                left++;
            while (a[right] > pivot)
                right--;
            if (left <= right) {
                swap(a, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(Integer[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
}
