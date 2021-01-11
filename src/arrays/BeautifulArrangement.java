package arrays;

public class BeautifulArrangement {
    int count = 0;

    public int countArrangement(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        permute(arr, 0);

        return count;
    }

    private void permute(int[] arr, int i) {
        if (i == arr.length) {
            count++;
            return;
        }

        for (int k = i; k < arr.length; k++) {
            swap(arr, k, i);
            if (arr[i] % (i + 1) == 0 || (i + 1) % arr[i] == 0) {
                permute(arr, i + 1);
            }
            swap(arr, k, i);
        }

    }

    private void swap(int[] arr, int k, int i) {
        int temp = arr[k];
        arr[k] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        BeautifulArrangement r = new BeautifulArrangement();
        System.out.println(r.countArrangement(4));
    }
}
