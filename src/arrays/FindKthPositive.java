package arrays;

public class FindKthPositive {

    public static int findKthPositive(int[] arr, int k) {

        int[] missingArr = new int[k];
        int missingArrIndex = 0;

        int x = 1;
        int arrIndex = 0;

        while (missingArrIndex < k) {

            if (arrIndex <= arr.length - 1 && arr[arrIndex] != x) {
                missingArr[missingArrIndex++] = x++;
            } else if (arrIndex > arr.length - 1) {
                missingArr[missingArrIndex++] = x++;
            } else {
                x++;
                arrIndex++;
            }
        }

        return missingArr[missingArrIndex-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.print(findKthPositive(arr, k));
    }

}
