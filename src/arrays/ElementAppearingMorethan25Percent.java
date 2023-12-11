package arrays;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/

1287. Element Appearing More Than 25% In Sorted Array
Easy
Topics
Companies
Hint
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.



Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:

Input: arr = [1,1]
Output: 1


Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 105

 */
public class ElementAppearingMorethan25Percent {

    public static int findSpecialInteger_v0(int[] arr) {
        int minPercentage = arr.length / 4;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : arr) {
            countMap.compute(i, (k, v) -> (v == null) ? 1 : v + 1);
            if(countMap.get(i) > minPercentage)
                return i;
        }
        return 0;
    }

    public static int findSpecialInteger(int[] arr) {
        int minPercentage = arr.length / 4;
        int counter = 0;
        int element = arr[0];

        for(int i:arr){
            if(element == i)    counter++;
            else counter = 1;

            if(counter > minPercentage) return i;

            element = i;

        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));

        int[] arr1 = {1,1};
        System.out.println(findSpecialInteger(arr1));
    }



}
