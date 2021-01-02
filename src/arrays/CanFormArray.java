package arrays;

import java.util.Arrays;

public class CanFormArray {
    public static void main(String[] args) {
        int[] arr = {12, 21, 11, 22};
        int[][] pieces = {{12, 21}, {1, 2}};
        CanFormArray r = new CanFormArray();
        System.out.println(r.canFormArray(arr, pieces));


    }

    public boolean canFormArray(int[] arr, int[][] pieces) {
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
                }
                else{
                    output = false;
                }
            }
            if (!output)
                break outerloop;
        }
        return output;
    }


}
