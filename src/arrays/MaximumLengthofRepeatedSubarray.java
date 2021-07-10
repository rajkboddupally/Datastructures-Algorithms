package arrays;/* Raj Kumar Boddupally created on 7/9/2021 inside the package - arrays */

/*
Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in both arrays.



Example 1:

Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
Output: 3
Explanation: The repeated subarray with maximum length is [3,2,1].
Example 2:

Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
Output: 5


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 100
 */
public class MaximumLengthofRepeatedSubarray {
    public int findLength1(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return 0;

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int firstMaxLength = 0;
        int secondMaxLength = 0;

        while (firstArrayIndex < nums1.length) {

            while (firstArrayIndex < nums1.length && nums1[firstArrayIndex] == nums2[secondArrayIndex]) {
                firstArrayIndex++;
                secondArrayIndex++;
                firstMaxLength++;
            }
            firstArrayIndex++;
            if (firstMaxLength > 0) break;
        }
        firstArrayIndex = 0;
        secondArrayIndex = 0;
        while (secondArrayIndex < nums2.length) {

            while (secondArrayIndex < nums2.length && nums2[secondArrayIndex] == nums1[firstArrayIndex]) {
                firstArrayIndex++;
                secondArrayIndex++;
                secondMaxLength++;
            }
            secondArrayIndex++;
            if (secondMaxLength > 0) break;
        }

        return Math.max(firstMaxLength, secondMaxLength);
    }

    /*
       Use dynamic programming to solve the problem
       dp[i][j] = dp[i+1][j+1] + 1;
    */
    public int findLength(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[][] dp = new int[m + 1][n + 1];

        //initialize
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = 0;
            }
        }

        //populate values
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
}
