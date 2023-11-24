package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].

Return true if it is possible to form the array arr from pieces. Otherwise, return false.



Example 1:

Input: arr = [15,88], pieces = [[88],[15]]
Output: true
Explanation: Concatenate [15] then [88]
Example 2:

Input: arr = [49,18,16], pieces = [[16,18,49]]
Output: false
Explanation: Even though the numbers match, we cannot reorder pieces[0].
Example 3:

Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
Output: true
Explanation: Concatenate [91] then [4,64] then [78]


Constraints:

1 <= pieces.length <= arr.length <= 100
sum(pieces[i].length) == arr.length
1 <= pieces[i].length <= arr.length
1 <= arr[i], pieces[i][j] <= 100
The integers in arr are distinct.
The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).
 */
public class CanFormArray {
    public static void main(String[] args) {
        int[] arr = {12, 21, 11, 22};
        int[][] pieces = {{12, 21}, {11, 22}};
        CanFormArray r = new CanFormArray();
        System.out.println(r.canFormArray(arr, pieces));


    }

    public boolean canFormArray_v1(int[] arr, int[][] pieces) {
        boolean output = true;
        outerloop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                if (pieces[j].length != 1 && pieces[j][0] == arr[i]) {
                    int[] piece = pieces[j];
                    for (int k = 1; k < piece.length; k++) {
                        if (arr[++i] != piece[k]) {
                            output = false;
                            break outerloop;
                        }
                    }
                    output = true;
                    break;
                } else if (pieces[j].length == 1 && arr[i] == pieces[j][0]) {
                    output = true;
                    break;
                } else {
                    output = false;
                }
            }

        }
        return output;
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, List<Integer>> myMap = new HashMap<>();

        for (int[] piece : pieces) {
            List<Integer> sublist = new ArrayList<>();
            for (int j : piece) {
                sublist.add(j);
            }
            myMap.put(piece[0], sublist);
        }

        for (int i = 0; i < arr.length; ) {
            List<Integer> subList = myMap.get(arr[i]);
            if (subList == null)
                return false;
            else if (subList.size() == 1 && subList.get(0) == arr[i]) {
                i++;
            } else if (subList.size() > 1) {
                for (int j = 0; j < subList.size() && i < arr.length; j++) {
                    if (arr[i] != subList.get(j)) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

}
