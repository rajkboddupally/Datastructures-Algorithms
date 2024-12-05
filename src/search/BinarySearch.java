package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {1, 6, 8, 10, 13, 23, 41};
        int key = 13;
        int index = binary_search(input, key);
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


    private static int binary_search(int[] input, int target){
        int start =0, end = input.length -1;

        while(start <= end){
            int mid = (start + end)/2;
            if(input[mid] == target)
                return mid;
            else if (input[mid] > target) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
