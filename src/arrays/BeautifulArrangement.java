package arrays;
/*
Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:

perm[i] is divisible by i.
i is divisible by perm[i].
Given an integer n, return the number of the beautiful arrangements that you can construct.



Example 1:

Input: n = 2
Output: 2
Explanation:
The first beautiful arrangement is [1,2]:
    - perm[1] = 1 is divisible by i = 1
    - perm[2] = 2 is divisible by i = 2
The second beautiful arrangement is [2,1]:
    - perm[1] = 2 is divisible by i = 1
    - i = 2 is divisible by perm[2] = 1
Example 2:

Input: n = 1
Output: 1


Constraints:

1 <= n <= 15
 */
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
