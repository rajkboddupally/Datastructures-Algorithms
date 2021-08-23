package arrays;

/* Raj Kumar Boddupally created on 8/20/2021 inside the package - arrays */

/*
print the array elements combination who sum is equal to target
Ex - 10, 1, 2, 7, 6, 8, 1, 5    target - 8
ans -  [2,6], [1,2,5], [8], [1,7]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        //int[] input = {1,0,0,0,0,0,0,1};
        int[] input = {10, 1, 2, 7, 6, 8, 1, 5};
        int target = 8;
        allocateSeats(input, target);
    }

    private static void allocateSeats(int[] input, int target) {

        Arrays.sort(input);
        //1 1 2 5 6 7 10

        for (int i = 0; i < input.length; i++) {
            int tempSum = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < input.length; j++) {
                tempSum += input[j];
                list.add(input[j]);

                if (tempSum > target) {
                    list.clear();
                } else if (tempSum == target) {
                    for (Integer x : list) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    list.clear();
                    tempSum = 0;
                    j = i;
                }

            }

        }
    }
}



/*


Input: candidates = [10,1,2,7,6,1,5], target = 8,
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]


1. sort the array   ->  1 1 2 5 6 7 10

2.  Iterate the array
    declare int temp = arr[i]
    print if target == a[i]
     iterate i+1
      temp+ = j
      if(temp == target)
        List<

        else if (temp > target)
          break;

*/


