package arrays;/* Raj Kumar Boddupally created on 7/7/2021 inside the package - arrays */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given an n x n matrix where each of the rows and columns are sorted in ascending order, return the kth smallest element in the matrix.

Note that it is the kth smallest element in the sorted order, not the kth distinct element.



Example 1:

Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
Example 2:

Input: matrix = [[-5]], k = 1
Output: -5


Constraints:

n == matrix.length
n == matrix[i].length
1 <= n <= 300
-109 <= matrix[i][j] <= 109
All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
1 <= k <= n2
 */
public class KthSmallestElementinSortedMatrix {
    public static void main(String[] args) {
        KthSmallestElementinSortedMatrix obj = new KthSmallestElementinSortedMatrix();
        int[][] testArr = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        //int[][] testArr = {{1, 2}, {1, 3}};
        System.out.println(obj.kthSmallest(testArr, 8));

    }

    public int kthSmallest_v1(int[][] matrix, int k) {
        List<Integer> flatArrList = new ArrayList<>();
        for (int[] row : matrix) {
            for (int col : row) {
                flatArrList.add(col);
            }
        }
        Collections.sort(flatArrList);
        return flatArrList.get(k - 1);
    }

    public int kthSmallest(int[][] matrix, int k) {
        int[] output = new int[matrix.length * matrix[0].length];
        int counter = 0;
        for (int[] ints : matrix) {
            for (int column = 0; column < matrix[0].length; column++) {
                output[counter++] = ints[column];
            }
        }
        return output[k-1];
    }
}
