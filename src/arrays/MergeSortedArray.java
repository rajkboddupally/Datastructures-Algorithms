package arrays;

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has enough space
(size that is equal to m + n) to hold additional elements from nums2.
 */
public class MergeSortedArray {

    public int[] merge_old(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        for (int i = 0; i < n; i++) {
            nums1[++index1] = nums2[i];

            for (int j = index1; j > 0; j--) {
                if (nums1[j] < nums1[j - 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                } else
                    break;
            }
        }
        return nums1;
    }


    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int index = m + n - 1;

        while (index1 >= 0 && index2 >= 0) {
            nums1[index--] = nums1[index1] > nums2[index2] ? nums1[index1--] : nums2[index2--];
        }

        while (index2 >= 0) {
            nums1[index--] = nums2[index2--];
        }


        return nums1;
    }
}
