package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {1, 6, 8, 10, 13, 23, 41};
        int key = 11;
        int index = binarySearch(input, key);
        System.out.println("Index " + index);
    }

    private static int binarySearch(int[] input, int key) {
        int lo = 0, hi = input.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (input[mid] < key) {
                lo = mid + 1;
            } else if (input[mid] > key) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
