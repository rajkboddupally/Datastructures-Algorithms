package arrays;

public class MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArr = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArr[k++] = nums1[i++];
            } else {
                mergedArr[k++] = nums2[j++];
            }
        }
        while(i < m)
            mergedArr[k++] = nums1[i++];

        while(j < n)
            mergedArr[k++] = nums2[j++];

        if ((m + n) % 2 == 0) {
            median = (mergedArr[(m + n) / 2 - 1] + mergedArr[(m + n) / 2 ])/2.0;
        } else
            median = mergedArr[(m + n) / 2];

        return median;
    }
}
